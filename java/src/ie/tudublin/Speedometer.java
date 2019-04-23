package ie.tudublin;


public class Speedometer extends UiObject
{
    
    
    public Speedometer(UI ui, float x, float y, float speed)
    {
        super(ui, 0, x, y, 0, speed, 0);
    }

    float size = 200;
    //twelfth 
    float twth = 1/12f;
    //1 and 1 twelfth
    float oNot = 1 + twth;


   

    @Override
    public void render() {

        //drawing the design of speedometer
        ui.beginShape();
        ui.stroke(0);
        ui.fill(0,0,255);
        ui.arc(x, y, size*1.5f, size*1.5f, speed, speed*2 );
        ui.fill(21,0,234);
        ui.arc(x, y, size*1.5f, size*1.5f, speed *oNot , speed*2);
        ui.fill(43,0,212);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth) , speed*2 );
        ui.fill(64,0,191);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*2), speed*2 );
        ui.fill(85,0,170);
        ui.arc(x, y, size*1.5f, size*1.5f, speed *(oNot + twth*3f), speed*2 );
        ui.fill(106,0,149);
        ui.arc(x, y, size*1.5f, size*1.5f, speed *(oNot + twth*4f), speed*2 );
        ui.fill(128,0,128);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*5f), speed*2 );
        ui.fill(149,0,106);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*6f), speed*2 );
        ui.fill(170,0,85);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*7f), speed*2 );
        ui.fill(191,0,64);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*8f), speed*2 );
        ui.fill(212,0,43);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*9f), speed*2 );
        ui.fill(234,0,21);
        ui.arc(x, y, size*1.5f, size*1.5f, speed * (oNot + twth*10f), speed*2 );
        ui.noStroke();
        ui.fill(255);
        ui.arc(x, y, size, size, speed, speed*2 );
        ui.endShape();
        
    }

    @Override
	public void update() {
		
    }
}