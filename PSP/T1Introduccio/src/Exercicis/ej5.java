package Exercicis;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num1, num2;
		do {
			System.out.print("Introduce el primer numero: ");
			num1 = Integer.parseInt(teclado.nextLine());
			System.out.print("Introduce el segundo numero: ");
			num2 = Integer.parseInt(teclado.nextLine());
		} while (num1 != num2);
		System.out.println("Los numeros son iguales. Bucle finalizado");
		teclado.close();

	}

	

}
