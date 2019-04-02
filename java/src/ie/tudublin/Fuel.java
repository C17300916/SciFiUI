package ie.tudublin;
import processing.core.PConstants;

public class Fuel extends UiObject
{
    int size = 50;
    int half = 2;
    int qtr = 4;
    

    public int fireRate;

    public Fuel(UI ui, float frequency, float x, float y)
    {
        super(ui,0, x, y, 0);
    }
    float y2 = 0.1f;
    float fdown = y-y/half;
    public void render()
    {
        ui.pushMatrix();
        ui.stroke(0, 0, 255);
        ui.fill(0,0,255);
        ui.rectMode(PConstants.CENTER);
        ui.rect(x, y, size, y);
        ui.stroke(255, 0, 0);
        ui.rectMode(PConstants.CORNER);
        ui.fill(255,0,0);
        ui.rect(x - size/half, fdown, size, y2);
        
        ui.stroke(255,0,0);
        ui.line(x-size/1.2f, y - y/half , x + size/1.2f, y-y/half);
        ui.line(x-size/1.2f, y - y/qtr , x + size/1.2f, y-y/qtr);
        ui.line(x-size/1.2f,  y , x + size/1.2f, y);
        ui.line(x-size/1.2f, y + y/qtr , x + size/1.2f, y+y/qtr);
        ui.line(x-size/1.2f, y + y/half , x + size/1.2f, y+y/half);

        ui.popMatrix();
    }

    public void update()
    {
        if (ui.checkKey('w') )
        {
            y2 =y2 + 0.1f;
        }
        
        
    }

    
}