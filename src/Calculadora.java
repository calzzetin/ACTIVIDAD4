import java.util.Scanner;  

public class Calculadora {

	public static void main(String[] args) {
		/* El usuario introduce datos*/
		Scanner sc= new Scanner(System.in);
		System.out.print("Escribe la primera cifra: ");  
		int a= sc.nextInt();  
		System.out.print("Escribe la segunda cifra: ");  
		int b= sc.nextInt();  

		/* Mostramos los resultados en pantalla*/
		System.out.println("Los resultados de las operaciones son los siguientes: ");  
		mostrar(sumar(a, b));
		mostrar(restar(a, b));
		mostrar(multiplicar(a, b));
		mostrar(dividir(a, b));
	}
	
	/* Método suma */
	static String sumar(int numero1, int numero2) {
		return numero1 + "+" + numero2 + " = " + (numero1+numero2);
	}
	
	/* Método resta */
	static String restar(int numero1, int numero2) {
		return numero1 + "-" + numero2 + " = " + (numero1-numero2);
	}
	
	/* Método multiplicación */
	static String multiplicar(int numero1, int numero2) {
		return numero1 + "x" + numero2 + " = " + (numero1*numero2);
	}
	
	/* Método división */
	static String dividir(int numero1, int numero2) {
		return numero1 + "/" + numero2 + " = " + ((float)numero1/(float)numero2);
	}
	
	/* Método para mostar textos */
	static void mostrar(String texto) {
		System.out.println(texto);
	}

}
