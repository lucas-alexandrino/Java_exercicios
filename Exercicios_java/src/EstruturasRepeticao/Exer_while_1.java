package LaçosCondicionais;

import java.util.Scanner;

public class Exer_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, idadeMais = 0, idadeMenos = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva sua idade:\n(para parar digite -1)");
		idade = leia.nextInt();

		while (idade >= 0 && idade <= 100) {

			if (idade < 21) {
				idadeMenos += 1;
			}
			if (idade > 50) {
				idadeMais += 1;
			}
			System.out.println("Escreva sua idade:\n(para parar digite -10)");
			idade = leia.nextInt();

		}

		System.out.println("Total de pessoas menores de 21 anos: " + idadeMenos);
		System.out.println("Total de pessoas maiores de 50 anos " + idadeMais);
	}

}
