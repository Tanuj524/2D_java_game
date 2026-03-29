package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamepanel;

public class obj_chest extends superobject{
    gamepanel gp;
    public obj_chest(gamepanel gp)
    {
        name="chest";
        try{
            image=ImageIO.read(getClass().getResourceAsStream("/objects/chest (OLD).png"));
            uTool.scaleImage(image, gp.tileSize,gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
