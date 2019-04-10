package ie.tudublin;

import java.util.Random;



public class planetPractice extends UiObject {
    int size = 50;
    int[][] planetcolours = {{255,0,0},{0,255,0},{0,0,255},{255,0,127},
{102,0,204},{0,255,128},{51,255,255},{102,0,0}};
    
    

    
    Random rand = new Random();
    //PLANETS
    //picking a colour
    int Pnum1 = rand.nextInt(7);
    int Pnum2 = rand.nextInt(7);
    //planet size    
    float PSize1 = -60;
    float PSize2 = 0;

    public planetPractice(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 5, 0);
        
    }

    //planets spawn points
    float P1x = x;
    float P2x = x;
    float P1y = y + rand.nextInt(300);
    float P2y = y - rand.nextInt(300);
    



    
    public void render()
    {
        ui.pushMatrix();
        
        //DRAWING PLANETS
         //planet left side
        if(PSize1>0){
        ui.stroke(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);
        ui.fill(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);           
        ui.circle(P1x,P1y,PSize1);
        }
        //planet right side
        if(PSize2>0){
        ui.stroke(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.fill(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.circle(P2x,P2y,PSize2);
        }
          
            
        ui.popMatrix();
    }
    private float spawned =0 ;
    public void update()
    {
        //planet movement
        PSize1 += rand.nextFloat();
        PSize2 += rand.nextFloat();

        //planet1
        if(ui.checkKey(' ') && PSize1>=0 ){
            if(P1y == y){
                P1x -= 4;
            }
            if(P1y > y){
                P1x -= 4;
                P1y += .5;

            }
            if(P1y < y){
                P1x -= 4;
                P1y -= .5;

            }
        }
        else if(PSize1>=0 ){
            if(P1y == y){
                P1x -= 2;
            }
            if(P1y > y){
                P1x -= 2;
                P1y += .5;

            }
            if(P1y < y){
                P1x -= 2;
                P1y -= .5;

            }
        }
        if(ui.checkKey(' ') && PSize1>=0 ){
            if(P2y == y){
                P2x += 4;
            }
            if(P2y > y){
                P2x += 4;
                P2y += .5;

            }
            if(P2y < y){
                P2x += 4;
                P2y -= .5;

            }
        }
        else if(PSize2>=0){
            if(P2y == y){
                P2x += 2;
            }
            if(P2y > y){
                P2x += 2;
                P2y += .5;

            }
            if(P2y < y){
                P2x += 2;
                P2y -= .5;

            }
        }
        
 

        //resetting planets
        if(P2x > 1300){
            P2x = x;
            PSize2 = 0;
            Pnum2 = rand.nextInt(7);
            P2y = y - rand.nextInt(300);
        }
        if(P1x < -100){
            P1x = x;
            PSize1 = -60;
            Pnum1 = rand.nextInt(7);
            P1y = y + rand.nextInt(300);
        }
    }

        
}

    
