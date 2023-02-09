package exercicios_java;

import java.util.Scanner;

public class Exer_case_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigo;
		float saldo = 1000;
		float valorTransacao = 0;
		float operacao = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("\n1-Saldo \n 2-Saque \n 3-Depósito");
		System.out.println("Digite o numero da operação");
		codigo = leia.nextInt();

		if (codigo == 2 || codigo == 3) {

			System.out.println("Digite o valor:");
			valorTransacao = leia.nextFloat();
		} else {
			System.out.println("Operação Inválida");
		}

		switch (codigo) {
		case 1:
			System.out.println("Novo saldo " + operacao);
			break;
		case 2:
			operacao = saldo - valorTransacao ;
			System.out.println("Novo saldo " + operacao);
			break;
		case 3:
			operacao = saldo + valorTransacao ;
			System.out.println("Novo saldo " + operacao);
			break;
		default:
			System.out.println("Operação inválida!");

		}

	}

}
