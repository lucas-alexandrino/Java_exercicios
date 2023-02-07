package exercicios_java;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salarioBruto,addNoturno,horasExt,descontos;
		
		Scanner leia =new Scanner (System.in);
		
		System.out.println("\n Digite seu salario bruto:");
		salarioBruto=leia.nextFloat();
		System.out.println("\n Digite seu adicional noturno:");
		addNoturno=leia.nextFloat();
		System.out.println("\n Digite suas horas extras:");
		horasExt=leia.nextFloat();
		System.out.println("\n Digite seus descontos:");
		descontos=leia.nextFloat();
		
		float salarioLiquido = salarioBruto + addNoturno +(horasExt * 5) - descontos;
		
		
		System.out.printf("\n Salario liquido: %.2f",salarioLiquido);
		
	}

}
