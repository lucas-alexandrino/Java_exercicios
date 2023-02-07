package exercicios_java;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float novosalario;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("\n Digite o salário: ");
		float salario= leia.nextFloat(); 
		System.out.println("\n Digite o abono: ");
		float abono = leia.nextFloat();

		novosalario = salario + abono ;
		
		System.out.printf("\n Novo salário: %.2f ",novosalario);
	}
	
	
	
	

}