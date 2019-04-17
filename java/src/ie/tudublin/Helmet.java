package ie.tudublin;



public class Helmet extends UiObject
{
    
    

    public Helmet(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, 0);
    }

    float gap = x / 8f;
    float halfW = x/2;
    float halfH = y/2;
    public void render()
    {
        ui.beginShape();
        ui.stroke(255);
        ui.fill(0,250,154);
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


        ui.endShape();
        
    }

    

    public void update()
    {
        
    }

}