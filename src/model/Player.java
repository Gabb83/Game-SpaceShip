package model;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player {
	
	private int x, y; //posicao do player
	private int dx, dy; //deslocamento do player
	private Image imagem; //imagem do player
	private int largura, altura; //tamanho da imagem do player
	
	//construtor da classe, permitindo a posicao inicial do player
	public Player() {
		this.x = 100;
		this.y = 100;
	}
	
	public void load() {
		
		//add a imagem do player/nave
		ImageIcon referencia = new ImageIcon(getClass().getResource("image-sprite-spaceShip.png"));
		imagem = referencia.getImage();
		
		//responsavel por definir o tamanho em px da imagem do player
		Image imgTemp = referencia.getImage();
		altura = 50;
		largura = 50;
		imagem = imgTemp.getScaledInstance(altura, largura, Image.SCALE_SMOOTH);
		
		//centraliza
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}
	
	//atualiza a posicao do player com a de desolcamento
	public void update() {
		x += dx;
		y += dy;
	}
	
	/*
	 * desloca o player quando as teclas sao pressionadas
	 * e define a velocidade do player com cada tecla
	 * teclas usada: setas e wasd
	 */
	public void keyPressed(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP || codigo == KeyEvent.VK_W) {
			dy = -4;
		}
		
		if(codigo == KeyEvent.VK_DOWN || codigo == KeyEvent.VK_S) {
			dy = 4;
		}
		
		if(codigo == KeyEvent.VK_LEFT || codigo == KeyEvent.VK_A) {
			dx = -4;
		}
		
		if(codigo == KeyEvent.VK_RIGHT || codigo == KeyEvent.VK_D) {
			dx = 4;
		}
	}
	
	//para o deslocamento do player quando a tecla deixa de ser pressionada
	public void keyReleased(KeyEvent tecla) {
		int codigo = tecla.getKeyCode();
		
		if(codigo == KeyEvent.VK_UP || codigo == KeyEvent.VK_W) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_DOWN || codigo == KeyEvent.VK_S) {
			dy = 0;
		}
		
		if(codigo == KeyEvent.VK_LEFT || codigo == KeyEvent.VK_A) {
			dx = 0;
		}
		
		if(codigo == KeyEvent.VK_RIGHT || codigo == KeyEvent.VK_D) {
			dx = 0;
		}
	}
	
	//metodos getters das variaveis x, y, imagem
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