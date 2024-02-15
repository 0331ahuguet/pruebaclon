package ejercicios2;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// contador vocales
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine().toLowerCase();
        char[] caracteres = frase.toCharArray();
        int n = caracteres.length-1;
        
        char vocales[] = {'a','e','i','o','u'};
        
        int cont_v = 0;
        
        for(int i = 0; i <=n ; i++){
        	boolean esVocal = false;
        	for (int j = 0; j<vocales.length; j++){
        		if(caracteres[i] == vocales[j]){
        			esVocal = true;
        		}
        	}
        	if(esVocal){
        		cont_v++;
        	}
        }
        
        System.out.println("Hay "+cont_v+" vocales");
  }

}
