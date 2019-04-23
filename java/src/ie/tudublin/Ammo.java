package ie.tudublin;


public class Ammo extends UiObject
{
    float h = 120;
    float w = 200;
    float g = 20;
    float a = 75;
    

    public Ammo(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    

    @Override
    public void render() {

        //rocket outline
        ui.stroke(255);
        ui.fill(255);
        ui.triangle(x+w/2, y + h/1.5f, x+w/4, y+h, x+w, y+h*1.45f);
        ui.triangle(x-w/2, y + h/1.5f, x-w/4, y+h, x-w, y+h*1.45f);
        //flame outside
        ui.beginShape();
        ui.stroke(255,140,0);
        ui.fill(255,140,0);
        ui.vertex(x, y+h);
        ui.bezierVertex(x, y+h, x + g*4, y + h*1.5f, x, y + h*1.85f);
        ui.bezierVertex(x, y + h*1.85f, x - g*4, y + h*1.5f, x, y+h);
        ui.endShape();
        //flame outside
        ui.beginShape();
        ui.stroke(255,190,0);
        ui.fill(255,190,0);
        ui.vertex(x, y+h);
        ui.bezierVertex(x, y+h, x + g*2.5f, y + h*1.5f, x, y + h*1.85f);
        ui.bezierVertex(x, y + h*1.85f, x - g*2.5f, y + h*1.5f, x, y+h);
        ui.endShape();
        //rocket base
        ui.beginShape();
        ui.fill(255);
        ui.vertex(x, y - h);
        ui.bezierVertex(x, y-h, x + w , y , x + w/2, y +h);
        ui.bezierVertex(x + w/2, y +h, x , y + h*1.5f, x - w/2, y +h);
        ui.bezierVertex(x - w/2, y +h, x - w , y , x, y-h);
        ui.endShape();
        
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