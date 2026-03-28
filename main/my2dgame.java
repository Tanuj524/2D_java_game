package main;
import javax.swing.JFrame;

public class my2dgame {
    public static void main(String args[]){
        JFrame window = new JFrame();
        gamepanel gp=new gamepanel();
        window.add(gp);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2D Adventure");
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        gp.setupGame(); 
        gp.startGameThread();
    }
}
