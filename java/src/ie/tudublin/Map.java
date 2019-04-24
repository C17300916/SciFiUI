package ie.tudublin;


public class Map extends UiObject
{
    float h = 250;
    float w = 10;
    float a = 75;
    public Map(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

 

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