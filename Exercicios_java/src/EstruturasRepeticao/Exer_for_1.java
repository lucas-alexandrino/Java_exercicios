package LaçosCondicionais;

import java.util.Scanner;

public class Exer_for_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, n2, x = 0;

		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com o número 1: ");
		n1 = leia.nextInt();
		System.out.println("Entre com o número 2: ");
		n2 = leia.nextInt();

		for (x = n1; x <= n2; x++) {
			if (n1 > n2) {
				System.out.println("INTERVALO INVÁLIDO!");
			}
			System.out.println("X Antes do calculo"+x);
			 if (x % 3 == 0 && x % 5 == 0) {
				System.out.println("\n" + x + " é múltiplo de 3 e 5");
			}

		}

	}

}
