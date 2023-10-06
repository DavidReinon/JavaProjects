package Exercicis;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce el primer numero: ");
		int num1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Introduce el segundo numero: ");
		int num2 = Integer.parseInt(teclado.nextLine());
		if (num1 > num2) {
			System.out.println("EL numero mas grande es: " + num1);
			System.out.println("EL numero mas pequeño es: " + num2);
			teclado.close();
			return;
		}
		if (num2 > num1) {
			System.out.println("EL numero mas grande es: " + num2);
			System.out.println("EL numero mas pequeño es: " + num1);
			teclado.close();
			return;
		}
		
		System.out.println("Los numeros son iguales: " + num1 + " y " + num2);
		teclado.close();

	}

}
