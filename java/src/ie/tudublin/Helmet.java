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
        ui.fill(255);
        //ui.noFill();
        
        //outside shape
        ui.vertex(0, 0);
        ui.vertex(0,y);
        ui.vertex(x, y);
        ui.vertex(x, 0);

        //inside shape
        ui.beginContour();
        ui.vertex(gap, gap);
        ui.vertex(halfW, gap/2);
        ui.vertex(x- gap, gap);
        ui.vertex(x- gap, y - gap*2);
        ui.vertex(x- gap*2,  y- (gap + gap/2));
        ui.vertex(halfW + gap, y- (gap + gap/2));
        ui.vertex(halfW + gap/2, y- gap*2);
        ui.vertex(halfW - gap/2, y- gap*2);
        ui.vertex(halfW - gap , y- (gap + gap/2));
        ui.vertex(gap*2, y- (gap + gap/2));
        ui.vertex(gap, y - gap*2);
        ui.vertex(gap, gap);
        ui.endContour();
        /*ui.line(gap, gap, gap, y - gap*2);
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
        */


        ui.endShape();
        
    }

    

    public void update()
    {
        
    }

}