import java.util.Scanner;  

public class Calculadora {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.print("Escribe la primera cifra: ");  
		int a= sc.nextInt();  
		System.out.print("Escribe la segunda cifra: ");  
		int b= sc.nextInt();  

		int miSuma = a+b;
		int miResta = a-b;
		int miMultiplicacion = a*b;
		float miDivision = (float)a/(float)b;

	}

}
