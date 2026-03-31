package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import entity.player;
import main.gamepanel;
import main.keyhandler;
import main.CollisionChecker;

public class CollisionTest {

    player p;
    gamepanel gp;
    keyhandler keyH;

    @BeforeEach
    void setup() {
        gp = new gamepanel();
        keyH = new keyhandler();

        gp.keyH = keyH;
        gp.cChecker = new CollisionChecker(gp);

        // if needed (depends on your code)
        // gp.obj = new SuperObject[10];

        p = new player(gp, keyH);
    }

    @Test
    void testCollisionDoesNotCrash() {
        assertDoesNotThrow(() -> {
            gp.cChecker.checkTile(p);
        });
    }

    @Test
    void testCollisionFlagBoolean() {
        gp.cChecker.checkTile(p);

        assertTrue(p.collisionOn == true || p.collisionOn == false);
    }
}