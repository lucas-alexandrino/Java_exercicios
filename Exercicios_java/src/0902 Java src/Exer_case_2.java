package exercicios_java;

import java.math.MathContext;
import java.util.Scanner;

public class Exer_case_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int codigoCargo;
		String nome = null;
		float salario;
		double novoSalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nome = leia.next();
		System.out.println("Digite seu codigo:");
		codigoCargo = leia.nextInt();
		System.out.println("Digite seu salário:");
		salario =leia.nextFloat();
		
		switch (codigoCargo) {
		case 1:
			novoSalario =salario + ( salario * 0.10 );
			System.out.printf("%s Gerente %.2f",nome,novoSalario);
		break;
		case 2:
			novoSalario =salario + ( 7% salario);
			System.out.printf("%s Vendedor %.2f",nome,novoSalario);
		break;
		case 3:
			novoSalario =salario + ( 9%  salario);
			System.out.printf("%s Supervisor %.2f",nome,novoSalario);
		break;
		case 4:
			novoSalario =salario + ( 6%  salario);
			System.out.printf("%s Motorista %.2f",nome,novoSalario);
		break;
		case 5:
			novoSalario =salario + ( 5%  salario);
			System.out.printf("%s Estoquista %.2f",nome,novoSalario);
		break;
		case 6:
			novoSalario =salario + ( 8%  salario);
			System.out.printf("%s Técnico de TI %.2f",nome,novoSalario);
		default :
			System.out.println("ERRO DE CODIGO");
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
