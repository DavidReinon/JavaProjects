package Exercicis;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce el segundo numero: ");
		int num2 = Integer.parseInt(teclado.nextLine());
		System.out.println(num1 + num2);
		teclado.close();

	}

}
