package ie.tudublin;

import processing.core.PConstants;
public class Boost extends UiObject
{
    public Boost(UI ui, float x, float y )
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float size1 = 140;
    float size2 = 110;
    float booster = PConstants.PI + 0.01f;
    
    
    

    public void render()
    {
        
        ui.stroke(255);

        //back ellispse
        ui.ellipse(x, y, size1, size1);

        ui.beginShape();
        //boost going up 
        ui.fill(255,255,0);
        ui.arc(x, y, size1, size1, PConstants.PI, booster);
        ui.endShape();

        //inner ellipse
        ui.fill(255,0,0);
        ui.ellipse(x, y, size2, size2);

        //checking if booster is full
        ui.fill(0);
        ui.textSize(15);
        if(booster > PConstants.PI + PConstants.TWO_PI){
            
            ui.text("BOOST FULL", x, y);
            
        }
        

    }
	public void update() {
        //booster goes up slowly
        if(booster < PConstants.PI + 0.01f + PConstants.TWO_PI && ! ui.checkKey(' ')){
            booster += 0.006f;
        }

        //booster goes down once space pressed
        
        if(ui.checkKey(' ')){
            booster -= 0.006f ;
            
        }
        
    }
    
    
    
    
    
    
}