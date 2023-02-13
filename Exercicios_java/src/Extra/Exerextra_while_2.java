package exercicios_java;

import java.util.Scanner;

public class Exerextra_while_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade, genero, opcoes;
		int peopleCalm = 0, womanNervous = 0, manAgressive = 0, othersCalm = 0, peopleNervous_40 = 0, peopleCalm_18 = 0;
		String continua = "s";

		int limite = 0;

		Scanner leia = new Scanner(System.in);

		while (!continua.equals("n") && limite != 150) {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			System.out.println("\n 1 - Feminino \t \n 2 - Masculino \t \n 3 - Outros");
			System.out.println("Digite sua identificação de genero:");
			genero = leia.nextInt();
			System.out.println("\n 1 - Sou calmo \t \n 2 - Sou nervoso \t \n 3 - Sou agressivo");
			System.out.println("\nDigite a opção: ");
			opcoes = leia.nextInt();
			System.out.println("Deseja continuar? s(Sim) ou n(Não)");
			continua = leia.next();
			limite += 1;
			System.out.println("Numeros limite" + limite);

			if (opcoes == 1) {
				peopleCalm += 1;

			}
			if (genero == 1 && opcoes == 3) {
				womanNervous += 1;
			}
			if (genero == 2 && opcoes == 3) {
				manAgressive += 1;
			}
			if (genero == 3 && opcoes == 1) {
				othersCalm += 1;
			}
			if (idade >= 40 && opcoes == 2) {
				peopleNervous_40 += 1;
			}
			if (idade < 18 && opcoes == 1) {
				peopleCalm_18 += 1;
			}
		}
		System.out.println("Quantidade pessoas calmas: " + peopleCalm);
		System.out.println("Quantidade de mulheres nervosas: " + womanNervous);
		System.out.println("Quantidade de homens agressivos: " + manAgressive);
		System.out.println("Quantidade de Outros calmos: " + othersCalm);
		System.out.println("Quantidade de pessoas nervosas com mais de 40 anos: " + peopleNervous_40);
		System.out.println("Quantidade de pessoas calmas com menos de 18 anos: " + peopleCalm_18);
	}
}
