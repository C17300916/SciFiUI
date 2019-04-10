package ie.tudublin;

import java.util.Random;


public class Stars extends UiObject {
    

    Random rand = new Random();
    //star size    
    float S_Size1 = -10;
    float S_Size2 = -10;
    
    

    public Stars(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 5, 0);
        
    }

    //stars spawn points
    float S1x = x;
    float S1y = rand.nextInt(800);
    float S2x = x;
    float S2y = rand.nextInt(800);




    
    public void render()
    {
        ui.pushMatrix();
        
        //DRAWING Stars
        if(S_Size1>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S1x, S1y, S_Size1);
        }
        if(S_Size2>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S2x, S2y, S_Size2);
        }
        
        ui.popMatrix();
    }
    
    public void update()
    {
        //sizing each star
        if(S_Size1 > 10){
            S_Size1 += .01f;
        }
        else{
            S_Size1 += .1f;
        }
        if(S_Size2 > 10){
            S_Size2 += .01f;
        }
        else{
            S_Size2 += .1f;
        }
        
        
        //star movement

        if(S_Size1>=0){
            
            if(S1y == y) {
                S1x += .5;
            }
            if (S1y > y) {
                S1x += .5;
                S1y += .5;

            }
            if (S1y < y) {
                S1x += .5;
                S1y -= .5;

            }
        }
        if(S_Size2>=0){
            
            if(S2y == y) {
                S2x -= .5;
            }
            if (S2y > y) {
                S2x -= .5;
                S2y += .5;

            }
            if (S2y < y) {
                S2x -= .5;
                S2y -= .5;

            }
        }
        
        spawned += ui.timeDelta;
        if(spawned >= 10.0){
            ui.uiObjects.remove(this);
        }
    }
    float spawned;
        
}

    
