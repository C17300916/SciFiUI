package ie.tudublin;

import java.util.Random;

import processing.core.PVector;

public class planetPractice extends UiObject {
    int size = 50;
    int[][] planetcolours = {{255,0,0},{0,255,0},{0,0,255},{255,0,127},
{102,0,204},{0,255,128},{51,255,255},{102,0,0}};
    int[][] starcolours = {{255,255,51},{255,255,0},{255,128,0},{153,153}};
    int counterP =0 ;
    

    
    Random rand = new Random();
    //PLANETS
    //picking a colour
    int Pnum1 = rand.nextInt(7);
    int Pnum2 = rand.nextInt(7);
    //planet size
    
    float PSize1 = 0;
    float PSize2 = 0;

    public planetPractice(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 5, 0);
        
    }

    //planets spawn points
    float P1x = x;
    float P2x = x;
    float P1y = y;
    float P2y = y;
    
    
    public void render()
    {
        ui.pushMatrix();
        
        //DRAWING PLANETS
         //planet left side
        ui.stroke(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);
        ui.fill(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);           
        ui.circle(P1x,P1y,PSize1);
        //planet right side
        ui.stroke(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.fill(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.circle(P2x,P2y,PSize2);

       
        ui.popMatrix();
    }
    private float spawned =0 ;
    public void update()
    {
        //planet movement
        PSize1 += rand.nextFloat();
        PSize2 += .1;
        P2x += 1;
        P1x -= 1; 

       

        
    }

    
}