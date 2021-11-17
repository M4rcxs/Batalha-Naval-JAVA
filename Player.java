
public class Player {
	private int tiro, pontos;
	public void removeTiro() {
		this.tiro--;
	}
	public void ganhaPonto(int pontos) {
		this.pontos += pontos;
	}
	public Player() {
		this.tiro = 5;
		this.pontos = 0;
	}
	public int getTiro() {
		return tiro;
	}
	public int getPonto() {
		return pontos;
	}
}
