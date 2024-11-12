package gui;

import actions.KeyHandler;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTreeUI;

public class Gui {

    JFrame jf;
    Draw d;
    public static int witdh = 800, height =  600;
    public static int xoff = 130, yoff = 20;

    public void create(){
    jf = new JFrame("Snake");
    jf.setSize(witdh,height);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setLocationRelativeTo(null);
    jf.setLayout(null);
    jf.setResizable(false);
    jf.addKeyListener(new KeyHandler());

    d = new Draw();
    d.setBounds(0, 0, witdh,height);
    d.setVisible(true);
    jf.add(d);

    jf.requestFocus();
    jf.setVisible(true);
    }
}
