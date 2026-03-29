package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamepanel;

public class obj_key extends superobject {
    gamepanel gp;
    public obj_key(gamepanel gp)
    {
        name="key";
        try{
            image=ImageIO.read(getClass().getResourceAsStream("/objects/key.png"));
            uTool.scaleImage(image, gp.tileSize,gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
