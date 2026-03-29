package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamepanel;

public class obj_door extends superobject {
    gamepanel gp;
    public obj_door(gamepanel gp)
    {
        name="door";
        try{
            image=ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
            uTool.scaleImage(image, gp.tileSize,gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
        }
        collision=true;
    }
}
