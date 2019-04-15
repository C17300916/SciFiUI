package ie.tudublin;

import processing.core.PApplet;

public class Buttons extends UiObject
{
    float h = 50;
    float w = 230;
    public Buttons(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    public void render()
    {
        //button 1
        if(ui.mouseX >= x- h && ui.mouseX <= x-h + w ){
            if(ui.mouseY >= y-h && ui.mouseY <= y-h + h){
                ui.fill(121,144,220);
            }
            else{
                ui.fill(255,51,255);
            }
        }
        else{
            ui.fill(255,51,255);
        }
        
        ui.stroke(0);
        ui.rectMode(PApplet.CORNER);
        ui.rect(x-h, y-h, w, h);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(h/2);
        ui.text("Health", x + h + 10, y -30 );

        //button 2
        if(ui.mouseX >= (x*2 + x/2) && ui.mouseX <= (x*2 + x/2) + w ){
            if(ui.mouseY >= y-h && ui.mouseY <= y-h + h){
                ui.fill(121,144,220);
            }
            else{
                ui.fill(255,51,255);
            }
        }
        else{
            ui.fill(255,51,255);
        }
        
        ui.rect((x*2 + x/2), y-h, w, h);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(h/2);
        ui.text("Map", (x*2 + x/2) + h*2, y -30 );

        //button 3
        if(ui.mouseX >= x-h && ui.mouseX <= (x-h) + w ){
            if(ui.mouseY >= y+h && ui.mouseY <= y+h + h){
                ui.fill(121,144,220);
            }
            else{
                ui.fill(255,51,255);
            }
        }
        else{
            ui.fill(255,51,255);
        }
        
        ui.rect(x-h, y+h, w, h);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(h/2);
        ui.text("Ammo", x + h + 10, y+h+20 );

        //button 4
        if(ui.mouseX >= (x*2 + x/2) && ui.mouseX <= (x*2 + x/2) + w ){
            if(ui.mouseY >= y+h && ui.mouseY <= (y+h) + h){
                ui.fill(121,144,220);
            }
            else{
                ui.fill(255,51,255);
            }
        }
        else{
            ui.fill(255,51,255);
        }
        
        ui.rect((x*2 + x/2), y+h, w, h);
        ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.textSize(h/2);
        ui.text("Distance", (x*2 + x/2) + h*2 +10, y+h+20 );
    }

    public void update(){


    }
}