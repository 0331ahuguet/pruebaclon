package ejercicios2;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String frase = scanner.nextLine().toLowerCase();
        String[] caracteres = frase.split(" ");
        int n = caracteres.length - 1;
        
        System.out.println("Ingresa la cadena que quieras buscar:");
        String cadena = scanner.nextLine().toLowerCase();
        
        boolean coincidencia = false;
        int cont = 0;
        
        for(int i = 0; i <=n ; i++){
        	String huevo = caracteres[i];
        		if(huevo.equals(cadena)){
        			coincidencia = true;
        			cont++;
        		}	
        }
        
        System.out.println("La palabra "+cadena+" aparece un total de"+cont+" veces");
}
}