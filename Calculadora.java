import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Calculadora calculadora2 = new Calculadora();
		
		calculadora2.calculo();

	}

	private void calculo() {

		System.out.println("Soma");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v1 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v2 = scan.nextInt();
		
		int resultado = Math.addExact(v1, v2);
		System.out.println("O resultado da soma é: "+ resultado);
		
		
		System.out.println("\nSubtrai");
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v3 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v4 = scan.nextInt();
		
		int resultado1 = Math.subtractExact(v3, v4);
		System.out.println("O resultado da subtração é: " + resultado1);
		
		
		System.out.println("\nMultiplica");
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v5 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v6 = scan.nextInt();
		
		int resultado2 = Math.multiplyExact(v5, v6);
		System.out.println("O resultado da multiplicação é: "+ resultado2);
		
		
		System.out.println("\nDivide");
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v7 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v8 = scan.nextInt();
		
		int resultado3 = Math.floorDiv(v7, v8);
		System.out.println("O resultado da divisão é: "+ resultado3);
		
		
		System.out.println("\nPotencia");
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v9 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v10 = scan.nextInt();
		
		int resultado4 = (int) Math.pow(v9, v10);
		System.out.println("O resultado da pôtencia é: "+ resultado4);
		
		
		System.out.println("\nRaiz Quadrada");
		Scanner scan6 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v11 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v12 = scan.nextInt();
		
		double resultado5 = Math.sqrt(v11);
		double resultado6 = Math.sqrt(v12);
		System.out.println("O resultado da 1° raiz qaudrada é: "+ resultado5);
		System.out.println("O resultado da 2° raiz quadrada é: "+ resultado6);
		
		
		System.out.println("\nRaiz Cúbica");
		Scanner scan7 = new Scanner(System.in);
		System.out.println("Digite o 1° valor: ");
		int v13 = scan.nextInt();
		System.out.println("Digite o 2° valor: ");
		int v14 = scan.nextInt();
		
		double resultado7 = Math.cbrt(v13);
		double resultado8 = Math.cbrt(v14);
		System.out.println("O resultado da 1° raiz cubica é: "+ resultado7);
		System.out.println("O resultado da 2° raiz cubica é: "+ resultado8);
		
		
	}

}
