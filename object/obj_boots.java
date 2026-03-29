package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamepanel;

public class obj_boots extends superobject {
    gamepanel gp;
    public obj_boots(gamepanel gp)
    {
        name="boots";
        try{
            image=ImageIO.read(getClass().getResourceAsStream("/objects/boots.png"));
            uTool.scaleImage(image, gp.tileSize,gp.tileSize);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
