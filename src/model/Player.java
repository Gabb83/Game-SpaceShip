package model;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int largura, altura;
	
	public Player() {
		this.x = 100;
		this.y = 100;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon(getClass().getResource("image-sprite-spaceShip.png"));
		imagem = referencia.getImage();
		
		Image imgTemp = referencia.getImage();
		int novaAltura = 50;
		int novaLargura = 50;
		imagem = imgTemp.getScaledInstance(novaAltura, novaLargura, Image.SCALE_SMOOTH);
		
		
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	public void update() {
		x += dx;
		y += dy;
	}
	
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy = -2;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 2;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = -2;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx = 2;
		}
	}
	
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_DOWN) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_LEFT) {
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT) {
			dx = 0;
		}
	}
 
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
		
}