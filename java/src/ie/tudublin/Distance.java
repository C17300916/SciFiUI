package ie.tudublin;

import java.util.Random;

public class Distance extends UiObject
{
    float h = 160;
    float w = 400;
    float gap = 20;
    Random rand = new Random();
    public Distance(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float startPoint = x  - w/2 + 10;
    float varY = y;
    float prevY =y;
    float nextPoint = startPoint + gap;
    @Override
	public void update() {
        
        ui.stroke(255);
        ui.noFill();
        ui.rect(x, y, w, h);
        for(int i=0; i< gap; i++){
            ui.line(startPoint, prevY, nextPoint, varY);
            startPoint = nextPoint;
            prevY = varY;
            nextPoint += gap;
            if(varY == y){
                varY += (h/2 + gap) + rand.nextFloat()*((-(h/2 - gap)) - (h/2 + gap));
            }
            if(varY > y){
                varY -= (-(h/2 - gap)) + rand.nextFloat()*((varY) - (-(h/2 - gap)));
            }
            if(varY < y){
                varY += (varY) + rand.nextFloat()*((h/2 + gap) - (varY));
            }

        }
        
        

		
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