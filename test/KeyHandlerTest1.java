package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.keyhandler;

import java.awt.event.KeyEvent;

public class KeyHandlerTest1{

    private KeyEvent createKeyPress(int keyCode) {
        return new KeyEvent(
            new java.awt.Canvas(),
            KeyEvent.KEY_PRESSED,
            System.currentTimeMillis(),
            0,
            keyCode,
            KeyEvent.CHAR_UNDEFINED
        );
    }

    private KeyEvent createKeyRelease(int keyCode) {
        return new KeyEvent(
            new java.awt.Canvas(),
            KeyEvent.KEY_RELEASED,
            System.currentTimeMillis(),
            0,
            keyCode,
            KeyEvent.CHAR_UNDEFINED
        );
    }

    @Test
    void testUpKey() {
        keyhandler kh = new keyhandler();

        kh.keyPressed(createKeyPress(KeyEvent.VK_W));
        assertTrue(kh.upPressed);
    }

    @Test
    void testDownKey() {
        keyhandler kh = new keyhandler();

        kh.keyPressed(createKeyPress(KeyEvent.VK_S));
        assertTrue(kh.downPressed);
    }

    @Test
    void testLeftKey() {
        keyhandler kh = new keyhandler();

        kh.keyPressed(createKeyPress(KeyEvent.VK_A));
        assertTrue(kh.leftPressed);
    }

    @Test
    void testRightKey() {
        keyhandler kh = new keyhandler();

        kh.keyPressed(createKeyPress(KeyEvent.VK_D));
        assertTrue(kh.rightPressed);
    }

    @Test
    void testKeyRelease() {
        keyhandler kh = new keyhandler();

        kh.keyPressed(createKeyPress(KeyEvent.VK_W));
        assertTrue(kh.upPressed);

        kh.keyReleased(createKeyRelease(KeyEvent.VK_W));
        assertFalse(kh.upPressed);
    }
}