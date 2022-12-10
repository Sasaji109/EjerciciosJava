package ejemplogithub;

import java.util.Scanner;

public class EjemploGitHub {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
		System.out.println("Menú de métodos String");
		System.out.println("1. Uppercase\n2. Compare to\n3. Equals\n");
		int num;
		
		do {
			num = teclado.nextInt();
			switch (num) {
	    		case 1:  
	    			System.out.println("Método Uppercase");
	    			Ej1();
	    			break;
	    		case 2:  
	    			System.out.println("Método Compare To");
	    			Ej2();
	    			break;
	    		case 3:  
	    			System.out.println("Método Equals");
	    			Ej3();
	    			boolean respuesta = Ej3();
	    			if (respuesta == true)
	    				System.out.println("las palabras son iguales");
	    			else 
	    				System.out.println("son distintas");
	    			break;
	    		default: 
	    			System.out.println("El número que ha introducido es incorrecto");
	    			break;
			}
		} while (num !=4);
		
	}


	public static void Ej1() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre = teclado.nextLine();
		System.out.println(nombre.toUpperCase());
	}
	
	public static void Ej2() {
		
		Scanner teclado = new Scanner(System.in);
		String[] palabras = new String[4];
		System.out.println("Introduce 4 palabras");
		
		for (int i = 0; i < palabras.length; i++) {
			palabras[i] = teclado.nextLine();
		}
		
		for (int i = 0; i < palabras.length-1; i++) {
			for (int j = 0; j < palabras.length; j++) {
				if (palabras[i].compareTo(palabras[i+1])>0) {
					String aux = palabras[i];
					palabras[i] = palabras[i+1];
					palabras[i+1] = aux;
				}
			}
		} 
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
	}

	public static boolean Ej3() {	
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce dos palabras");
		String cadena1 = lector.next();
		String cadena2 = lector.next();
		System.out.println("Iguales:" + cadena1.equals(cadena2));
		return cadena1.equals(cadena2);
		}
    
}
