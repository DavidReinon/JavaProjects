package Exercicis;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Integer acc = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce el numero " + (i+1) + ":");
			acc += Integer.parseInt(teclado.nextLine());
		}
		System.out.println("La suma total de los numeros es: " + acc);
		teclado.close();

	}

}
