package exercicios_java;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1,n2,n3,n4;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("\n Digite os numeros:");
		n1=leia.nextInt();
		n2=leia.nextInt();
		n3=leia.nextInt();
		n4=leia.nextInt();
		
		float calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: "+calculo);
		

		
		
		
	}

}
