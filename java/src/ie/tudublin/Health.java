package ie.tudublin;


public class Health extends UiObject
{
    public Health(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float a = 50;
    float b = 200;
    float brain = 100;
    float body =100;
    float lungs =100;
    float fNw =100;//food and water

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
        ui.text("BRAIN", x, y);
        ui.text(brain + "%", x, y);
        ui.text("BODY", x, y);
        ui.text(body + "%", x, y);
        ui.text("LUNGS", x, y);
        ui.text(lungs + "%", x, y);
        ui.text("FOOD & WATER", x, y);
        ui.text(fNw + "%", x, y);


        
    }

	public void update() {
        //health deteriorating over time
        BodTime += ui.timeDelta;
        BrainTime += ui.timeDelta;
        fnWTime += ui.timeDelta;
        lungsTime += ui.timeDelta;

        if(BodTime >= 2.0){
            body --;
            BodTime =0;
        }
        if(BrainTime  >= 5.0){
            brain --;
            BrainTime =0;
        }
        if(fnWTime >= 20.0){
            fNw --;
            fnWTime =0;
        }
        if(lungsTime >= 17.0){
            lungs --;
            lungsTime =0;
        }
		
    }
    float BodTime;
    float fnWTime;
    float lungsTime;
    float BrainTime;
}