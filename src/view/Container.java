package view;

import javax.swing.JFrame;

import model.Fase;

public class Container extends JFrame {
    
    public Container() {
    	//add e instancia a classe Fase a janela (Container)
        add(new Fase());
        
        setTitle("Space Ship"); //titulo da janela
        setSize(800, 500); //tamanho da janela (largura/altura)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar janela
        setLocationRelativeTo(null); //centraliza janela na tela
        setResizable(false); //responsividade da janela
        setVisible(true); //visibilidade da janela
    }
    
    public static void main(String[] args) {
    	//cria a instancia container e exibe a janela
        new Container();
    }
}