package Exercicis;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Integer acc = 0;
		Integer[] numeros = new Integer[5];
		for (Integer num : numeros) {
			System.out.println("Introduce un numero:");
			acc += Integer.parseInt(teclado.nextLine());
		}
		System.out.println("La suma total de los numeros es: " + acc);
		teclado.close();

	}

}

