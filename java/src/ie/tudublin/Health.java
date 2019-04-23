package ie.tudublin;


public class Health extends UiObject
{
    public Health(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float a = 75;
    float b = 300;
    //changeable variables for rect 1
    float aChange1 = 0; 
    float bChange1 =0;
    //changeable variables for rect 2
    float aChange2 = 0; 
    float bChange2 =0;
    //setting all health items to 100%
    float brain = 100;
    float body =100;
    float lungs =100;
    float fNw =100;//food and water


    public void render()
    {

        //everything inside large circle for design
        ui.fill(0,255,0);
        ui.circle(x, y, b +a );

        //adding health cross shape (inside colour)
        ui.beginShape();
        ui.stroke(0,0,255);
        ui.fill(0,0,255);
        ui.rectMode(ui.CENTER);
        ui.rect(x, y, a, b);
        ui.rect(x,y,b,a);
        ui.endShape();
        //health shape (outside colour)
        ui.beginShape();
        ui.noStroke();
        ui.fill(255);
        ui.rectMode(ui.CORNER);
        ui.rect(x -a/2, y - b/2, a, bChange1);
        ui.rect(x - b/2 ,y - a/2 ,b, aChange2);
        ui.endShape();

        //adding text indicators
        ui.textSize(15);
        ui.text("BRAIN", x - b/3, y - b/3);
        ui.text(brain + "%", x - b/3, y - b/5);
        ui.text("BODY", x - b/3, y +b/5);
        ui.text(body + "%", x - b/3, y + b/3);
        ui.text("LUNGS", x + b/3, y - b/3);
        ui.text(lungs + "%",x + b/3, y - b/5);
        ui.text("FOOD", x + b/3, y +b/5);
        ui.text("WATER", x + b/3, y +b/4);
        ui.text(fNw + "%",x + b/3, y + b/3);


        
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
            if(bChange1 <=b/2 +a/2){
                bChange1 ++;
            }
            else{
                if(bChange1 <= 200){
                    bChange1 ++;
                }
                if(aChange2 <= a){
                    aChange2 ++;
                }
            }
        }
        if(BrainTime  >= 5.0){
            brain --;
            BrainTime =0;
            if(bChange1 <=b/2 +a/2){
                bChange1 ++;
            }
            else{
                if(bChange1 <= 200){
                    bChange1 ++;
                }
                if(aChange2 <= a){
                    aChange2 ++;
                }
            }
        }
        if(fnWTime >= 20.0){
            fNw --;
            fnWTime =0;
            if(bChange1 <=b/2 +a/2){
                bChange1 ++;
            }
            else{
                if(bChange1 <= 200){
                    bChange1 ++;
                }
                if(aChange2 <= a){
                    aChange2 ++;
                }
            }
        }
        if(lungsTime >= 17.0){
            lungs --;
            lungsTime =0;
            if(bChange1 <=b/2 +a/2){
                bChange1 ++;
            }
            else{
                if(bChange1 <= 200){
                    bChange1 ++;
                }
                if(aChange2 <= a){
                    aChange2 ++;
                }
            }
        }
		
    }
    float BodTime;
    float fnWTime;
    float lungsTime;
    float BrainTime;
}