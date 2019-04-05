package ie.tudublin;

import java.util.Random;

import processing.core.PVector;

public class Planets extends UiObject {
    int size = 50;
    int[][] planetcolours = {{255,0,0},{0,255,0},{0,0,255},{255,0,127},
{102,0,204},{0,255,128},{51,255,255},{102,0,0}};
    int[][] starcolours = {{255,255,51},{255,255,0},{255,128,0},{153,153}};
    int counterP =0 ;
    

    
    Random rand = new Random();
    //PLANETS
    int Pnum1 = rand.nextInt(7);
    int Pnum2 = rand.nextInt(7);
    int P_low = 40;
    int P_high = 70;
    int PSize1 = rand.nextInt(P_high-P_low) + P_low;
    int PSize2 = rand.nextInt(P_high-P_low) + P_low;
    //spawn locationsleft
    int XL = rand.nextInt(700);
    //spawn locations right 
    int XR_low = 500;
    int XR_high = 1200;
    int XR = rand.nextInt(XR_high- XR_low) + XR_low;

    int Y_low = -100;
    int Y_high = 50;
    int Yco1 = rand.nextInt(Y_high- Y_low) + Y_low;
    int Yco2 = rand.nextInt(Y_high- Y_low) + Y_low;
    //STARS
    //colours
    int Snum1 = rand.nextInt(3);
    int Snum2 = rand.nextInt(3);
    int Snum3 = rand.nextInt(3);
    int Snum4 = rand.nextInt(3);
    //star size
    int S_low = 5;
    int S_high = 30;
    int S_size1 = rand.nextInt(S_high- S_low) + S_low;
    int S_size2 = rand.nextInt(S_high- S_low) + S_low;
    int S_size3 = rand.nextInt(S_high- S_low) + S_low;
    int S_size4 = rand.nextInt(S_high- S_low) + S_low;
    //spawnpoints
    int XS_low = -100;
    int XS_high = 900;
    int XSR_low = 300;
    int XSR_high = 1000;
    int YS2_low = -500;
    int YS2_high = -50;
    int Xs1 = rand.nextInt(XS_high- XS_low) + XS_low;
    int Xs2 = rand.nextInt(XSR_high- XSR_low) + XSR_low;
    int Xs3 = rand.nextInt(XS_high- XS_low) + XS_low;
    int Xs4 = rand.nextInt(XSR_high- XSR_low) + XSR_low;
    int Ys1 = rand.nextInt(Y_high- Y_low) + Y_low;
    int Ys2 = rand.nextInt(YS2_high- YS2_low) + YS2_low;
    int Ys3 = rand.nextInt(Y_high- Y_low) + Y_low;
    int Ys4 = rand.nextInt(YS2_high- YS2_low) + YS2_low;

        


    public Planets(UI ui, float x, float y, float rotation)
    {
        super(ui, x, y, 0, 0, 5, rotation);
        
        

    }
    
    public void render()
    {
        ui.pushMatrix();
        
        //DRAWING PLANETS
         //planet left side
        ui.stroke(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);
        ui.fill(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);           
        ui.circle(XL,Yco1,PSize1);
        //planet right side
        ui.stroke(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.fill(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.circle(XR,Yco2,PSize2);

        //DRAWING STARS
        ui.stroke(starcolours[Snum1][0], starcolours[Snum1][1], starcolours[Snum1][2]);
        ui.fill(starcolours[Snum1][0], starcolours[Snum1][1], starcolours[Snum1][2]);           
        ui.circle(Xs1,Ys1,S_size1);

        ui.stroke(starcolours[Snum2][0], starcolours[Snum2][1], starcolours[Snum2][2]);
        ui.fill(starcolours[Snum2][0], starcolours[Snum2][1], starcolours[Snum2][2]);           
        ui.circle(Xs2,Ys2,S_size2);

        ui.stroke(starcolours[Snum3][0], starcolours[Snum3][1], starcolours[Snum3][2]);
        ui.fill(starcolours[Snum3][0], starcolours[Snum3][1], starcolours[Snum3][2]);           
        ui.circle(Xs3,Ys3,S_size3);

        ui.stroke(starcolours[Snum4][0], starcolours[Snum4][1], starcolours[Snum4][2]);
        ui.fill(starcolours[Snum4][0], starcolours[Snum4][1], starcolours[Snum4][2]);           
        ui.circle(Xs4,Ys4,S_size4);

        

        ui.popMatrix();
    }
    private float spawned =0 ;
    public void update()
    {
        //planet movement
        XR += 1.75;
        XL -= 1.75;
        Yco1 += 3;
        Yco2 += 3;

        //star movement
        Ys1 += 1;
        Ys2 += 1;
        Ys3 += 1;
        Ys4 += 1;

        //checking if planets off page
        if( XR >= 1300 || Yco2 >=900){ 
            Pnum2 = rand.nextInt(7); 
            PSize2 = rand.nextInt(P_high-P_low) + P_low;
            XR = rand.nextInt(XR_high- XR_low) + XR_low;
            Yco2 = rand.nextInt(Y_high- Y_low) + Y_low;
        }

        if ( XL <= -100 || Yco1 >=900){
            Pnum1 = rand.nextInt(7);
            PSize1 = rand.nextInt(P_high-P_low) + P_low;
            XL = rand.nextInt(700);
            Yco1 = rand.nextInt(Y_high- Y_low) + Y_low;
        }

        //checking if stars off the page
        if(  Ys1 >=850){ 
            Snum1 = rand.nextInt(3); 
            S_size1 = rand.nextInt(S_high- S_low) + S_low;
            Xs1 = rand.nextInt(XS_high- XS_low) + XS_low;
            Ys1 = rand.nextInt(Y_high- Y_low) + Y_low;
        }
        if( Ys2 >=850){
            Snum2 = rand.nextInt(3); 
            S_size2 = rand.nextInt(S_high- S_low) + S_low;
            Xs2 = rand.nextInt(XSR_high- XSR_low) + XSR_low;
            Ys2 = rand.nextInt(YS2_high- YS2_low) + YS2_low;
        }
        if( Ys3 >=850){
            Snum3 = rand.nextInt(3);
            S_size3 = rand.nextInt(S_high- S_low) + S_low;
            Xs3 = rand.nextInt(XS_high- XS_low) + XS_low;
            Ys3 = rand.nextInt(Y_high- Y_low) + Y_low;
        }
        if( Ys4 >=850){
            Snum4 = rand.nextInt(3);
            S_size4 = rand.nextInt(S_high- S_low) + S_low;
            Xs4 = rand.nextInt(XSR_high- XSR_low) + XSR_low;
            Ys4 = rand.nextInt(YS2_high- YS2_low) + YS2_low;
        }
    }

    
}