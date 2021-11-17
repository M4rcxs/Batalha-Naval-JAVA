/*
*	a peca deve receber dois valores aleatorios de 1 a 8 ambos, que serão as coordenadas
*	
*
*/

public class Peca {
	private int posX, posY;
	private int pontos;
	public void addPos(int x, int y) {
		this.posX = x;
		this.posY = y;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int pegaX() {
		return posX;
	}
	public int pegaY() {
		return posY;
	}
}
