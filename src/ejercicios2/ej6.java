package ejercicios2;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// fibonacci
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el numero:");
		int num = scanner.nextInt();
		
		int num1 = 1;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 0;i<num-2;i++) {
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;			
			System.out.println(num3);
		}
		
	}

}
