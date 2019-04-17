package ie.tudublin;

import processing.core.PApplet;

public class Temperature extends UiObject
{
    public Temperature(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    public void render()
    {
        ui.beginShape();
        ui.noFill();
        /*ui.line(5, y, 20, y);
        ui.arc(80, y, 150, 150, PApplet.PI, PApplet.TWO_PI);
        ui.arc(80, y, 120, 120, PApplet.PI, PApplet.TWO_PI);
        ui.line(155, y, 140, y);
        */
        ui.vertex(5, y);
        ui.bezierVertex(5, y, 80, y-150, 155, y);
        ui.vertex(140, y);
        ui.bezierVertex(140, y, 80, y-120, 20, y);
        ui.vertex(5, y);
        ui.endShape();
    }

	public void update() {
		
    }
}