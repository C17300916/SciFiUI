package ie.tudublin;

import processing.core.PApplet;

public class MovingCircle extends UiObject
{
    private float dx = 1;
   

    public MovingCircle(UI ui,float frequency, float x, float y, float radius)
    {
       super(ui, frequency, x, y, radius, 0, 0);
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, radius * 2, radius * 2);
        ui.fill(255);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I am a moving circle", x, y);

    }

    public void update()
    {
        x += dx;
        if ((x > ui.width - radius) || (x < radius))
        {
            dx *= -1;
        }
    }
}
