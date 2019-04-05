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
    int Snum1 = rand.nextInt(4);
    int Snum2 = rand.nextInt(4);
    int Snum3 = rand.nextInt(4);
    int Snum4 = rand.nextInt(4);
    //star size
    int S_low = 5;
    int S_high = 30;
    int S_size1 = rand.nextInt(S_high- S_low) + S_low;
    int S_size2 = rand.nextInt(S_high- S_low) + S_low;
    int S_size3 = rand.nextInt(S_high- S_low) + S_low;
    int S_size4 = rand.nextInt(S_high- S_low) + S_low;
    //spawnpoints
    int Xs1 = rand.nextInt(700);
    int Xs2 = rand.nextInt(XR_high- XR_low) + XR_low;
    int Xs3 = rand.nextInt(700);
    int Xs4 = rand.nextInt(XR_high- XR_low) + XR_low;
    int Yco3 = rand.nextInt(Y_high- Y_low) + Y_low;
    int Yco4 = rand.nextInt(Y_high- Y_low) + Y_low;


        


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
        ui.stroke(planetcolours[Snum1][0], planetcolours[Snum1][1], planetcolours[Snum1][2]);
        ui.fill(planetcolours[Snum1][0], planetcolours[Snum1][1], planetcolours[Snum1][2]);           
        ui.circle(Xs1,Yco3,S_size1);

        ui.stroke(planetcolours[Snum2][0], planetcolours[Snum2][1], planetcolours[Snum2][2]);
        ui.fill(planetcolours[Snum2][0], planetcolours[Snum2][1], planetcolours[Snum2][2]);           
        ui.circle(Xs2,Yco4,S_size2);

        ui.stroke(planetcolours[Snum3][0], planetcolours[Snum3][1], planetcolours[Snum3][2]);
        ui.fill(planetcolours[Snum3][0], planetcolours[Snum3][1], planetcolours[Snum3][2]);           
        ui.circle(Xs3,Yco3,S_size3);

        ui.stroke(planetcolours[Snum4][0], planetcolours[Snum4][1], planetcolours[Snum4][2]);
        ui.fill(planetcolours[Snum4][0], planetcolours[Snum4][1], planetcolours[Snum4][2]);           
        ui.circle(Xs4,Yco4,S_size4);

        ui.popMatrix();
    }
    private float spawned =0 ;
    public void update()
    {
        XR += 1.75;
        XL -= 1.75;
        Yco1 += 3;
        Yco2 += 3;

        
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

        /*spawned += ui.time;
        ui.ellapsed += ui.time;
        if (spawned >= 5.0)
        {
            ui.uiObjects.remove(this);
            
            render();
        }*/

    }

    
}