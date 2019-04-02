package ie.tudublin;

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

    public void render()
    {
        ui.pushMatrix();
        ui.stroke(0, 0, 255);
        

        //ui.rect(x, y, size, y, 5);
        ui.rect(x, y, size, y);

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
        
        
        
    }

    
}