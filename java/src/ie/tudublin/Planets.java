package ie.tudublin;

import java.util.Random;

import processing.core.PVector;

public class Planets extends UiObject {
    int size = 50;
    int[][] planetcolours = {{255,0,0},{0,255,0},{0,0,255},{255,0,127},
{102,0,204},{0,255,128},{51,255,255},{102,0,0}};
    int[][] starcolours = {{255,255,51},{255,255,0},{255,128,0},{153,153}};


    Random rand = new Random();
    int Pnum1 = rand.nextInt(7);
    int Pnum2 = rand.nextInt(7);
    int Snum = rand.nextInt(4);

    int P_low = 40;
    int P_high = 70;
    int PSize = rand.nextInt(P_high-P_low) + P_low;
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
    
    public int fireRate;


    public Planets(UI ui, float x, float y, float rotation)
    {
        super(ui, x, y, 0, 0, 5, rotation);
        
        

    }
    
    public void render()
    {
        ui.pushMatrix();
        
        //planet left side
        ui.stroke(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);
        ui.fill(planetcolours[Pnum1][0], planetcolours[Pnum1][1], planetcolours[Pnum1][2]);
        ui.circle(XL,Yco1,PSize);
        //planet right side
        ui.stroke(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.fill(planetcolours[Pnum2][0], planetcolours[Pnum2][1], planetcolours[Pnum2][2]);
        ui.circle(XR,Yco2,PSize);
        
        ui.popMatrix();
    }
    private float spawned =0 ;
    public void update()
    {
        XR += 1.75;
        XL -= 1.75;
        Yco1 += 3;
        Yco2 += 3;


        spawned += ui.time;
        if (spawned >= 5.0)
        {
            ui.uiObjects.remove(this);
        }

    }

    
}