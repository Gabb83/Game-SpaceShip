package model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel implements ActionListener {
    
    private Image fundo;
    private Player player;
    private Timer timer;
    
    //construtor da class Fase
    public Fase() {
    	setFocusable(true); //permite que receba dados do teclado
    	setDoubleBuffered(true); //permite uma redenizacao mais suave
    	
        //add e carrega a imagem do background da janela
        ImageIcon referencia = new ImageIcon(getClass().getResource("image-background-space.jpg"));
        fundo = referencia.getImage();
        
        //instancia a classe Player e chama o metodo referentes ao imagem do player
        player = new Player();
        player.load();
        
        addKeyListener(new TecladoAdapter());
        
        //chama o metodo actionPerformed e inicia o timer
        timer = new Timer(5, this);
        timer.start();
    }
    
    
	public void paint(Graphics g) {
		//Converte o objeto Graphics em Graphics2D para renderizacao.
        Graphics2D graficos = (Graphics2D) g;
        
        /*preenche e dimensiona a janela com a imagem de fundo e 
         a imagem do player na sua posicao inicial*/
        graficos.drawImage(fundo, 0, 0, getWidth(), getHeight(), this);
        graficos.drawImage(player.getImagem(), player.getX(), player.getY(), this);
        
        g.dispose(); //libera recursos
    }
	
	//atualiza a posicao do player e refaz a repintura da janela
	@Override
	public void actionPerformed(ActionEvent e) {
		player.update();
		repaint();
		
	}
	
	//chama os metodos das teclas quando pressionadas/liberadas
	private class TecladoAdapter extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			player.keyPressed(e);
		}
		
		public void keyReleased(KeyEvent e) {
			player.keyReleased(e);
		}
	}
}
