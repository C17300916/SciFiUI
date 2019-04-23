package ie.tudublin;

import java.util.Random;

public class Distance extends UiObject
{
    float h = 160;
    float w = 400;
    float gap = 10;
    Random rand = new Random();
    public Distance(UI ui, float x, float y, float distance)
    {
        super(ui, 0, x, y, 0, 0, distance);
    }
    float distanceTravelled= 0;
    //average speed  km/s of a spaceship in orbit is 7.77
    float speedTravelled = 7.77f;
    float distTime =0;


    float time;
    float startPointX = x  - w/2 + gap;
    float startPointY = y + h/2 - gap;
    float endPointX = x + w/2 -gap;
    float endPointY = y - h/2 + gap;

    //values for line graph
    float prevX = startPointX;
    float prevY = startPointY;
    float currentX = prevX;
    float currentY =prevY;
   
    @Override
	public void update() {
        
        ui.stroke(255);
        ui.fill(30);
        ui.rect(x, y, w, h);

        //y axis ( time )
        ui.line(startPointX, startPointY, startPointX, endPointY);
        ui.text("Time ( seconds )", x, y);
        //x axis ( distance )
        ui.line(startPointX, startPointY, endPointX, startPointY);
        ui.text("Distance ( Km )", x, y);

        
        //distance graph
        
        ui.line(prevX, prevY, distanceTravelled/20 + startPointX, startPointY- time*10);
		
    }

    @Override
    public void render() {

        //updating variables
        /*
        prevX = currentX;
        currentX += distanceTravelled;
        prevY = currentY;
        currentY += time;*/

            
        spawned += ui.timeDelta;
        if(spawned >= 10.0){
            ui.uiObjects.remove(this);
        }
    
        time += ui.timeDelta;

        distTime += ui.timeDelta;
        if(distTime > 1.0){
            distanceTravelled += speedTravelled;
        }

    
        
    }
    float spawned;
}
    