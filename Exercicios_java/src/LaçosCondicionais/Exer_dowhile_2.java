package LaçosCondicionais;

import java.util.Scanner;

public class Exer_dowhile_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, alocamento = 0;
		double media, x = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Escreva um número:");
			num = leia.nextInt();

			if (num % 3 == 0 && num != 0) {
				alocamento += num;
				x += 1;
				System.out.println("alocamento e x" + alocamento + " " + x);
			}

		} while (num != 0);

		media = alocamento / x;
		System.out.printf("A média de todos os números múltiplos é de: %.2f", media);

	}

}
