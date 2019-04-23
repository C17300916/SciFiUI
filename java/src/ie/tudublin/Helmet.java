package ie.tudublin;



public class Helmet extends UiObject
{
    
    

    public Helmet(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 0, false);
    }

    float gap1 = x / 10f;
    float gap2 = x / 8f;
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
        ui.vertex(gap2, gap1);
        ui.vertex(halfW, gap1/2);
        ui.vertex(x- gap2, gap1);
        ui.vertex(x- gap2, y - gap1*2);
        ui.vertex(x- gap2*2,  y- (gap1 + gap1/2));
        ui.vertex(halfW + gap2, y- (gap1 + gap1/2));
        ui.vertex(halfW + gap2/2, y- gap1*2);
        ui.vertex(halfW - gap2/2, y- gap1*2);
        ui.vertex(halfW - gap2 , y- (gap1 + gap1/2));
        ui.vertex(gap2*2, y- (gap1 + gap1/2));
        ui.vertex(gap2, y - gap1*2);
        ui.vertex(gap2, gap1);
        ui.endContour();


        ui.endShape();
        
    }

    

    public void update()
    {
        
    }

}