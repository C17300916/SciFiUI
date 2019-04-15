package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class UI extends PApplet
{
    MovingCircle mc;
    float timer1, timer2;
    Stars s;
    

    boolean[] keys = new boolean[1024];

    public ArrayList<UiObject> uiObjects = new ArrayList<UiObject>();

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        //size(1200, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        fullScreen(); 
    }

    public void setup()
    {
        uiObjects.add(new Buttons(this, width/4, height - height/ 6));
        uiObjects.add(new Radar(this, 1, width/10, height - height / 7, 100));
        uiObjects.add(new Target(this, width / 2, height/2));
        uiObjects.add(new Fuel(this, 1, width -50, height - 300));
        uiObjects.add(new Helmet(this, width, height));

       
        uiObjects.add(new MovingCircle(this, 0, width / 2, height * .75f, 25));
        
        noCursor();
        
        
        //uiObjects.add(new Planets(this,width / 2, height / 2, 1 ));
       // uiObjects.add(new Planet(this, width / 2, height / 2));
        
       
        
    }

    Radar radar;

    public float timeDelta;
    private float last;
    public void mouseClicked(){
        float butY = height - height/ 6 ;
        float butX = width/4;
        float butW = 230;
        float butH = 50;


        //if clicking first button
        if(mouseX >= butX - butH &&  mouseX <= butX - butH + butW ){
            if(mouseY >= butY - butH && mouseY <= butY){
                System.out.println("button 1 clicked" );
            }
        }
        //if clicking second button
        if(mouseX >= (butX*2 + butX/2) && mouseX <= (butX*2 + butX/2) + butW ){
            if(mouseY >= butY-butH && mouseY <= butY){
                System.out.println("button 2 clicked" );
            }
        }
        //if clicking third button
        if(mouseX >= butX-butH && mouseX <= (butX-butH) + butW ){
            if(mouseY >= butY+butH && mouseY <= butY + butH*2){
                System.out.println("button 3 clicked" );
            }
        }

        //if clicking fourth button
        if(mouseX >= (butX*2 + butX/2) && mouseX <= (butX*2 + butX/2) + butW ){
            if(mouseY >= butY+butH && mouseY <= butY+butH*2){
                System.out.println("button 4 clicked" );
            }
        }
        

    }

    

    public void draw()
    {
        background(0);

        float now = millis();
        timeDelta = (now - last) / 1000.0f;
        last = now;

        timer1 += timeDelta;
        if(timer1 > 1.0){
            Stars s = new Stars(this, width / 2, height / 2);
            uiObjects.add(s);
            timer1 = 0;
            
        }
        timer2 += timeDelta;
        if(timer2 > 14.0){
            Planet p = new Planet(this, width / 2, height / 2);
            uiObjects.add(p);
            timer2 = 0;
            
        }


        //text("Ellapsed: "+ timer, 10, 200);

        for(int i= uiObjects.size() - 1; i >= 0; i--)
        {
            UiObject c = uiObjects.get(i);
            c.render();
            c.update();
        }      

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

