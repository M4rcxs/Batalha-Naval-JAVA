import java.util.Random;

/*	
 * o tabuleiro deve receber a posição das peças e desabilitar
 *	a posicao para que mais peças não ocupem o mesmo lugar.
 *
 */
public class Tabuleiro {
	private int[][] tab = new int[8][8];
	Peca[] pecas = new Peca[5];
	public Tabuleiro(){
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				this.tab[i][j] = 0;
			}
		}
		int x, y, pontos, i = 0;
		while(i < 5) {
			Random random = new Random();
			x = random.nextInt(8);
			y = random.nextInt(8);
			if(tab[x][y] != 1) {
				pontos = random.nextInt(5)+1;
				this.addPeca(x, y, pontos, i);
				i++;
			}	
		}
	}
	private void addPeca(int x, int y, int pontos, int posVet) {
		Peca peca = new Peca();
		peca.addPos(x, y);
		peca.setPontos(pontos);
		this.tab[x][y] = 1;
		this.pecas[posVet] = peca; 
	}
	public boolean atirar(int x, int y, Player player) {
		player.removeTiro();
		if(this.tab[x][y] == 1) {
			this.tab[x][y] = -1;
			player.ganhaPonto(this.pegaPonto(x, y));
			System.out.println("Acertou!!");
			return true;
		}
		System.out.println("Errou!!");
		return false;
	}
	private int pegaPonto(int x, int y) {
		for(int i = 0; i < 5; i++) {
			if(this.pecas[i].pegaX() == x && this.pecas[i].pegaY() == y) {
				return pecas[i].getPontos();
			}
		}
		return 0;
	}
	public void imprimeTab() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				System.out.print(" "+ this.tab[i][j]);
			}
			if(i != 8) {
				System.out.println("");
			}
		}
	}
}
