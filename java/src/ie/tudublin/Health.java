package ie.tudublin;


public class Health extends UiObject
{
    public Health(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float a = 50;
    float b = 200;

    public void render()
    {

        //adding health cross shape
        ui.beginShape();
        ui.stroke(255);
        ui.fill(255);
        ui.rectMode(ui.CENTER);
        ui.rect(x, y, a, b);
        ui.rect(x,y,b,a);

        ui.endShape();

        //adding text indicators

        
    }

	public void update() {
		
    }
}