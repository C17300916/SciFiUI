package ie.tudublin;

import processing.core.PVector;

public class Target extends UiObject
{
    int size = 50;

    public int fireRate;


    public Target(UI ui, float x, float y)
    {
        super(ui, x, y, 0, 0);
        
        

    }

    public void render()
    {
        ui.pushMatrix();
        
        
        ui.stroke(0, 255, 0);
        

        float halfSize = size / 2;
        
        ui.rect(ui.mouseX, ui.mouseY, size, size);
        
        
        
        ui.popMatrix();
    }

    public void update()
    {

        
        
    }

    
}