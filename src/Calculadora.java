import java.util.Scanner;  

public class Calculadora {

	public static void main(String[] args) {

		/* El usuario introduce datos*/
		Scanner sc= new Scanner(System.in);
		System.out.print("Escribe la primera cifra: ");  
		int a= sc.nextInt();  
		System.out.print("Escribe la segunda cifra: ");  
		int b= sc.nextInt();  

		/* Realizamos las operaciones y asignamos una variable a cada una de ellas */
		int miSuma = a+b;
		int miResta = a-b;
		int miMultiplicacion = a*b;
		float miDivision = (float)a/(float)b;

	}

}



