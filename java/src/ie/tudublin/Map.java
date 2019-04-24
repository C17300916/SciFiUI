package ie.tudublin;

import java.util.Random;

public class Map extends UiObject
{
    float h = 250;
    float w = 10;
    float a = 75;

    Random rand = new Random();
    public Map(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    //generating random numbers for size and location of planets on map
    int RSize1 = rand.nextInt(15);
    int RSize2 = rand.nextInt(15);
    int RSize3 = rand.nextInt(15);
    int RSize4 = rand.nextInt(15);

    int P1x = rand.nextInt(100);
    int P1y = rand.nextInt(100);

    int P2x = rand.nextInt(100);
    int P2y = rand.nextInt(100);

    int P3x = rand.nextInt(100);
    int P3y = rand.nextInt(100);
    
    int P4x = rand.nextInt(100);
    int P4y = rand.nextInt(100);

    @Override
    public void render() {

        ui.stroke(255);
        ui.noFill();
        //outline of map
        ui.rectMode(ui.CENTER);
        ui.rect(x, y, h+w, h+w);
        ui.rect(x, y, h, h);
        ui.fill(150);
        ui.rect(x, y, h-w, h-w);

        //random planets
        ui.stroke(0, 0, 255);
        ui.fill(0, 0, 255);
        //mapping random planet one
        float x1 = ui.map(P1x, 0, 100, x-h/2, x+h/2);
        float y1 = ui.map(P1y, 0, 100, y- h/2, y + h/2);
        ui.circle(x1, y1, RSize1);

        //mapping random planet one
        float x2 = ui.map(P2x, 0, 100, x-h/2, x+h/2);
        float y2 = ui.map(P2y, 0, 100, y- h/2, y + h/2);
        ui.circle(x2, y2, RSize1);

        //mapping random planet one
        float x3 = ui.map(P3x, 0, 100, x-h/2, x+h/2);
        float y3 = ui.map(P3y, 0, 100, y- h/2, y + h/2);
        ui.circle(x3, y3, RSize1);

        //mapping random planet one
        float x4 = ui.map(P4x, 0, 100, x-h/2, x+h/2);
        float y4 = ui.map(P4y, 0, 100, y- h/2, y + h/2);
        ui.circle(x4, y4, RSize1);


        //route taking 
       /* ui.line(x1, y1, x2, y2);
        ui.line(x1, y1, x2, y2);
        ui.line(x1, y1, x2, y2);
        ui.line(x1, y1, x2, y2);
        ui.line(x1, y1, x2, y2);*/

        //exit button
        ui.stroke(255);
        ui.fill(20);
        ui.rectMode(ui.CENTER);
        ui.rect(x + x/3, y - y/2, a, a/2);
        ui.fill(255);
        ui.textSize(20);
        ui.text("E = exit",x + x/3, y - y/2);

    }

       

    @Override
	public void update() {

        //despawning health if 'e' pressed
        if(ui.checkKey('e')){
            ui.uiObjects.remove(this);
        }
		
    }
}