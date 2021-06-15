import java.awt.*;
//import java.awt.Panel;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Pongframe extends JFrame{

    Panel panel;

    Pongframe(){
        panel = new Panel();
        this.add(panel);
        this.setTitle("Ping Pong");
        this.setResizable(false);
        this.setBackground(Color.gray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
