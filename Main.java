import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int x, y;
		Tabuleiro tab = new Tabuleiro();
		Player player = new Player();
		Scanner scanner = new Scanner(System.in);
		while(player.getTiro() > 0) {
			System.out.println("Insira a posicao x: ");
			x = scanner.nextInt();
			System.out.println("Insira a posicao y: ");
			y = scanner.nextInt();
			if(x > 8 || y > 8) {
				System.out.println("Insira um numero menor ou igual a 8");
				return;
			}
			tab.atirar(x, y, player);
		}
		System.out.println("Voce fez : "+ player.getPonto()+" pontos");
		tab.imprimeTab();
		scanner.close();
	}
}
