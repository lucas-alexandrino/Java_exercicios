package exercicios_java;

import java.util.Scanner;

public class Exer_case_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,codigo,operacao;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Digite o número 1:");
		n1 =leia.nextInt();
		System.out.println("Digite o número 2");
		n2= leia.nextInt();
		System.out.println("Digite o código:");
		codigo =leia.nextInt();
		
		
		switch(codigo) {
		case 1:
			operacao = n1 + n2;
			System.out.println(operacao);
		break;
		case 2:
			operacao = n1 - n2;
			System.out.println(operacao);
		break;
		case 3:
			operacao = n1 * n2;
			System.out.println(operacao);
		break;
		case 4:
			operacao = n1 / n2;
			System.out.println(operacao);
		break;	
		default:	
			System.out.println("Operação Inválida!");
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}

}
