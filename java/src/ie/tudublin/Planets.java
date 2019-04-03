package ie.tudublin;

import java.awt.*;
import java.util.Random;

public class Planets extends UiObject {
    int size = 50;
    int[][] planetcolours = {{255,0,0},{0,255,0},{0,0,255},{255,0,127},
{102,0,204},{0,255,128},{51,255,255},{102,0,0}};
    int[][] starcolours = {{255,255,51},{255,255,0},{255,128,0},{153,153}};


    Random rand = new Random();
    int Pnum = rand.nextInt(7);
    int Snum = rand.nextInt(4);
    
    public int fireRate;


    public Planets(UI ui)
    {
        super(ui, 0, 0, 0, 0);
        
        

    }
    
    public void render()
    {
        ui.pushMatrix();
        
        
        ui.stroke(planetcolours[Pnum][0],planetcolours[Pnum][1],planetcolours[Pnum][2]);
        ui.noFill();
        ui.line(400, 400, 10, 400);
        
        ui.popMatrix();
    }
    
    public void update()
    {
        
    }

    
}