package ejercicios2;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// contador de digitos
		//separar los digitos en un array
		//contar
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero:");
		int num = scanner.nextInt();
		
		String numero = String.valueOf(num);
		char[] digitos = numero.toCharArray();

		System.out.print(digitos.length);
	}

}
