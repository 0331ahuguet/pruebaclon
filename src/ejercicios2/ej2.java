package ejercicios2;
import java.util.Arrays;
import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		//ordenar numeros
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de numeros que quieras ordenar:");
		int num = scanner.nextInt();
		int[] num_des = new int[num];
		
		for(int i = 0; i<num;i++) {
			System.out.print("Ingresa el numero:");
			int numero = scanner.nextInt();
			
			num_des[i] = numero;
		}
		Arrays.sort(num_des);
		System.out.println( Arrays.toString( num_des ) );
	}

}
