package Exercicis;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Hola " + nombre);
		teclado.close();

	}

}
