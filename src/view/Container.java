package view;

import javax.swing.JFrame;

import model.Fase;

public class Container extends JFrame {
    
    public Container() {
        add(new Fase());
        
        setTitle("Space Ship");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Container();
    }
}

