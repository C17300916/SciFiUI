package ie.tudublin;


public class Distance extends UiObject
{
    float h = 80;
    float w = 400;
    float gap = 20;
    public Distance(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float startPoint = x  - w/2 + 10;

    @Override
	public void update() {
        
        ui.stroke(255);
        ui.noFill();
        ui.rect(x, y, w, h);
        ui.line(startPoint, y, startPoint + gap, y - 20);
        
        

		
    }

    @Override
    public void render() {
        spawned += ui.timeDelta;
        if(spawned >= 16.0){
            ui.uiObjects.remove(this);
        }

    }
    float spawned;
}