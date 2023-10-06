package Exercicis;

import java.util.Scanner;

public class ej8ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 12: ");
		String respuesta = teclado.next();

		if (!esEntero(respuesta)) {
			System.out.print("Debes de ingresar un numero");
			teclado.close();
			return;
		}

		Integer numero = Integer.parseInt(respuesta);
		if (numero < 1 || numero > 12) {
			System.out.println("El numero debe de estar entre 1 y 12");
			teclado.close();
			return;
		}
		String mes;
		switch (numero) {
		case 1:
			mes = "Enero";
			break;
		case 2:
			mes = "Febrero";
			break;
		case 3:
			mes = "Marzo";
			break;
		case 4:
			mes = "Abril";
			break;
		case 5:
			mes = "Mayo";
			break;
		case 6:
			mes = "Junio";
			break;
		case 7:
			mes = "Julio";
			break;
		case 8:
			mes = "Agosto";
			break;
		case 9:
			mes = "Septiembre";
			break;
		case 10:
			mes = "Octubre";
			break;
		case 11:
			mes = "Noviembre";
			break;
		case 12:
			mes = "Diciembre";
			break;
		default:
			mes = "No existe mes para el numero";
			break;
		}
		System.out.println("El mes es: " + mes);
		teclado.close();

	}

	public static boolean esEntero(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
