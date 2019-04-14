package ie.tudublin;

import processing.core.PConstants;

public class Helmet extends UiObject
{
    
    

    public Helmet(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float gap = x / 10f;
    float halfW = x/2;
    float halfH = y/2;
    public void render()
    {
        ui.beginShape();
        ui.stroke(255);
        ui.noFill();
        ui.rectMode(PConstants.CORNER);
        ui.rect(0, 0, x-1, y-1);
        ui.fill(255);
        ui.line(gap, gap, gap, y - gap*2);
        ui.line(gap, y - gap*2, gap*2, y- (gap + gap/2));
        ui.line(gap*2, y- (gap + gap/2), halfW - gap , y- (gap + gap/2));
        ui.line(halfW - gap , y- (gap + gap/2), halfW - gap/2, y- gap*2);
        ui.line(halfW - gap/2, y- gap*2, halfW + gap/2, y- gap*2);
        ui.line(halfW + gap/2, y- gap*2, halfW + gap, y- (gap + gap/2));
        ui.line(halfW + gap, y- (gap + gap/2), x- gap*2,  y- (gap + gap/2));
        ui.line(x- gap*2,  y- (gap + gap/2), x- gap, y - gap*2);
        ui.line(x- gap, y - gap*2, x- gap, gap);
        ui.line(x- gap, gap, halfW, gap/2);
        ui.line(halfW, gap/2, gap, gap);


        ui.endShape();
        
    }

    

    public void update()
    {
        
    }

}