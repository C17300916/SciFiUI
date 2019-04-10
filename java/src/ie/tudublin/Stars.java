package ie.tudublin;

import java.util.Random;


public class Stars extends UiObject {
    

    Random rand = new Random();
    //star size    
    float S_Size1 = -10;
    float S_Size2 = -10;
    float S_Size3 = -10;
    float S_Size4 = -10;
    float S_Size5 = -10;
    float S_Size6 = -10;
    

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
        if(S_Size1>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S1x, S1y, S_Size1);
        }
        if(S_Size3>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S3x, S3y, S_Size3);
        }
        if(S_Size5>0){
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S5x, S5y, S_Size5);
        }

        // 3 stars right hand side
        if (S_Size2 > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S2x,S2y, S_Size2);
        }
        if (S_Size4 > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S4x,S4y, S_Size4);
        }
        if (S_Size6 > 0) {
            ui.stroke(218,165,32);
            ui.fill(218,165,32);
            ui.circle(S6x,S6y, S_Size6);
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
        if(S_Size3 > 10){
            S_Size3 += .01f;
        }
        else{
            S_Size3 += .1f;
        }
        if(S_Size4 > 10){
            S_Size4 += .01f;
        }
        else{
            S_Size4 += .1f;
        }
        if(S_Size5 > 10){
            S_Size5 += .01f;
        }
        else{
            S_Size5 += .1f;
        }
        if(S_Size6 > 10){
            S_Size6 += .01f;
        }
        else{
            S_Size6 += .1f;
        }
        
        //star movement
        //star 1
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
        //star 2
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
                S1y -= .5;

            }
        }

        //star 3
        if(S_Size3>=0){
            if(S3y == y) {
                S1x += .5;
            }
            if (S3y > y) {
                S3x += .5;
                S3y += .5;

            }
            if (S3y < y) {
                S3x += .5;
                S3y -= .5;

            }
        }
        //star 4
        if(S_Size4>=0){
            if(S4y == y) {
                S4x -= .5;
            }
            if (S4y > y) {
                S4x -= .5;
                S4y += .5;

            }
            if (S4y < y) {
                S4x -= .5;
                S4y -= .5;

            }
        }
        //star 5
        if(S_Size5>=0){
            
            if(S5y == y) {
                S5x += .5;
            }
            if (S5y > y) {
                S5x += .5;
                S5y += .5;

            }
            if (S5y < y) {
                S5x += .5;
                S5y -= .5;

            }
        }
        //star 6
        if(S_Size6>=0){
            
            if(S6y == y) {
                S6x -= .5;
            }
            if (S6y > y) {
                S6x -= .5;
                S6y += .5;

            }
            if (S6y < y) {
                S6x -= .5;
                S6y -= .5;

            }
            
        }
        spawned += ui.timeDelta;
        if(spawned >= 10.0){

            S1x = x + rand.nextInt(500);
            S1y = y + rand.nextInt(300);
            S_Size1 =0;

            S3x = x + rand.nextInt(500);
            S3y = y + rand.nextInt(300);
            S_Size3 =0;

            S5x = x + rand.nextInt(500);
            S5y = y + rand.nextInt(300);
            S_Size5 =0;
        
            S2x = x - rand.nextInt(500);
            S2y = y - rand.nextInt(300);
            S_Size2 = 0;

            S4x = x - rand.nextInt(500);
            S4y = y - rand.nextInt(300);
            S_Size4 = 0;

            S6x = x - rand.nextInt(500);
            S6y = y - rand.nextInt(300);
            S_Size6 = 0;
        }
    }
    float spawned;
        
}

    
