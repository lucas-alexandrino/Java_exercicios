package LaçosCondicionais;

import java.util.Scanner;

public class Exer_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, quantPar = 0, quantImpar = 0;
		int x;

		Scanner leia = new Scanner(System.in);

		for (x = 1; x <= 10; x++) {

			System.out.println("Digite um numero");
			n1 = leia.nextInt();

			if (n1 % 2 == 0) {
				quantPar += 1;
			} else {
				quantImpar += 1;
			}

		}
		System.out.println("Total números pares: " + quantPar);
		System.out.println("Total números ímpares: " + quantImpar);
	}
}
