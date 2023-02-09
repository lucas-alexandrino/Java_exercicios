package exercicios_java;

import java.util.Scanner;

public class Exer_if_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		
		System.out.println("Escreva a letra A:");
		a=leia.nextInt();
		System.out.println("Escreva a letra B:");
		b=leia.nextInt();
		System.out.println("Escreva a letra C:");
		c=leia.nextInt();	
		
		
		if ((a + b) > c ) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if ((a + b) == c) {
			System.out.println("A Soma de A + B é igual a C");
		}
		else if ((a + b) < c ) {
			System.out.println("A soma de A + B é menor do que C");
		}
		else {
			System.out.println("ERRO");
		}
		
		
		
	}   

}
