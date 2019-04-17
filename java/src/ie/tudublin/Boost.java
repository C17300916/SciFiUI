package ie.tudublin;


public class Boost extends UiObject
{
    public Boost(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float size1 = 140;
    float size2 = 110;
    float booster = ui.PI + 0.01f;
    float timer =0;

    public void render()
    {
        timer += ui.timeDelta;
        ui.stroke(255);

        //back ellispse
        ui.ellipse(x, y, size1, size1);

        ui.beginShape();
        //boost going up 
        ui.fill(218,165,32);
        ui.arc(x, y, size1, size1, ui.PI, booster);
        ui.endShape();

        //inner ellipse
        ui.fill(255,0,0);
        ui.ellipse(x, y, size2, size2);

        //boos
    }
	public void update() {
        //booster goes up slowly
        if(booster < booster + ui.TWO_PI){
            booster += 0.006f;
        }
        
		
    }
}