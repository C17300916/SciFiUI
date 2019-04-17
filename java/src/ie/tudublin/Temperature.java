package ie.tudublin;

import java.util.Random;

import processing.core.PApplet;

public class Temperature extends UiObject
{
    public Temperature(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    //arc variable
    float arc_1 = PApplet.PI + PApplet.HALF_PI;
    float size1 = 140;
    float size2 = 120;
    float deg = 0;
    Random rand = new Random();

    public void render()
    {
        
        ui.beginShape();
        ui.fill(255);
        ui.arc(x, y, size1, size1, PApplet.PI, PApplet.TWO_PI, PApplet.CHORD);
        ui.fill(255, 0, 0);
        ui.arc(x, y, size1, size1, PApplet.PI, arc_1);
        ui.fill(0,250,154);
        ui.arc(x, y, size2, size2, PApplet.PI, PApplet.TWO_PI, PApplet.CHORD);
        ui.fill(255,0,0);
        ui.textSize(15);
        ui.text(deg+"°C", x, y -20);
        
        ui.endShape();
        
    }
    float time; 
    
	public void update() {
        time += ui.timeDelta;
        if(time > 2.0){
            arc_1 = PApplet.PI + rand.nextFloat()*(PApplet.TWO_PI - PApplet.PI);
            deg = ui.map(arc_1, PApplet.PI, PApplet.TWO_PI,-40, 40);
            time =0;
            
        }
        
       
    }
}