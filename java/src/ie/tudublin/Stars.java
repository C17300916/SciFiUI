package ie.tudublin;

import java.util.Random;


public class Stars extends UiObject {
    

    Random rand = new Random();
    //star size    
    float S_Size = -10;
    

    public Stars(UI ui, float x, float y)
    {
        super(ui, 0, x, y, 0, 5, 0);
        
    }

    //stars spawn points
    float S1x = x + rand.nextInt(500);
    float S1y = y + rand.nextInt(300);
    float S2x = x - rand.nextInt(500);
    float S2y = y - rand.nextInt(300);
    float S3x = x + rand.nextInt(500);
    float S3y = y + rand.nextInt(300);
    float S4x = x - rand.nextInt(500);
    float S4y = y - rand.nextInt(300);
    float S5x = x + rand.nextInt(500);
    float S5y = y + rand.nextInt(300);
    float S6x = x - rand.nextInt(500);
    float S6y = y - rand.nextInt(300);



    
    public void render()
    {
        ui.pushMatrix();
        
        //DRAWING PLANETS
         //3 stars on left hand side
        if(S_Size>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S1x, S1y, S_Size);
        }
        if(S_Size>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S3x, S3y, S_Size);
        }
        if(S_Size>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S5x, S5y, S_Size);
        }

        // 3 stars right hand side
        if (S_Size > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S2x,S2y, S_Size);
        }
        if (S_Size > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S4x,S4y, S_Size);
        }
        if (S_Size > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S6x,S6y, S_Size);
        }
            
        ui.popMatrix();
    }
    
    public void update()
    {
       spawned += ui.timeDelta;
       if(spawned >= 3.0){
           render();
       }
    }
    float spawned;
        
}

    
