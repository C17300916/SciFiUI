package ie.tudublin;

import processing.core.PApplet;
public class Planets extends UiObject
{
    int size = 50;
    colorMode(HSB);

    public int fireRate;


    public Planets(UI ui)
    {
        super(ui, 0, 0, 0, 0);
        
        

    }
    
    public void render()
    {
        ui.pushMatrix();
        
        
        
        ui.noFill();
        ui.line(400, 400, 10, 400);
        
        ui.popMatrix();
    }
    
    public void update()
    {
        
    }

    
}