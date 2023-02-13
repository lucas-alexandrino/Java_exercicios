package exercicios_java;

import java.util.Scanner;

public class Exerextra_dowhile_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, media = 0, x = 0;
		float calculo = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			n1 = leia.nextInt();

			if (n1 % 3 == 0 && n1 != 0) {
				x++;
				media += n1;
			}
		} while (n1 != 0);

		calculo = media / x;
		System.out.println("Média dos números múltiplos de 3: " + calculo);

	}

}
