import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//ExFixacao();
		//Ex01();
		//Ex02();
		//Ex03();
		//Ex04();
		//Ex05();
		Ex06();
	}
	
	/*
	 * Exercício de fixação: Em um novo programa, inicie as seguintes variáveis
	 * 
	 * String product1 = "Computer"; 
	 * String product2 = "Office desk"; 
	 * int age = 30;
	 * int code = 5290; 
	 * char gender = 'F'; 
	 * double price1 = 2100.0; 
	 * double price2 = 650.50; 
	 * double measure = 53.234567;
	 */
	
	public static void ExFixacao() {
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		} 
	
	/*
	Ex01: Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números 
	com uma mensagem explicativa, conforme exemplos.
	*/
	public static void Ex01(){
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;
		
		System.out.println("SOMA = " + soma);
		sc.close();
	}
	
	/*
	Ex02: Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos.
    Fórmula da área: area = π . raio^2
    Considere o valor de π = 3.14159
    */
	
	public static void Ex02() {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		double R, A, pi = 3.14159;
		
		R = sc.nextDouble();
		
		A = pi * R * R;

		System.out.printf("A=%.4f%n", A);
		
		sc.close();
	}
	
	/*
	 Ex03: Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
     de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	*/
	
	public static void Ex03(){
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = A * B - C * D;
		System.out.println("Diferenca = " + Diferenca);
		
		sc.close();
	}
	
	/*
	Ex04: Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
    */
	
	public static void Ex04() {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		int numero, horas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas; 
		
		System.out.println("Number = " + numero);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}
	/*
	Ex05: Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago 
	*/
	
	public static void Ex05() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, qde1, qde2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qde1 = sc.nextInt();
		preco1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qde2 = sc.nextInt();
		preco2 = sc.nextDouble();
	    
	    total = qde1 * preco1 + qde2 * preco2;
	   
	    System.out.printf("Valor a pagar : R$ %.2f%n", total);
		sc.close();
	}
    /*
    Ex06: Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
          a) a área do triângulo retângulo que tem A por base e C por altura.
          b) a área do círculo de raio C. (pi = 3.14159)
          c) a área do trapézio que tem A e B por bases e C por altura.
          d) a área do quadrado que tem lado B.
          e) a área do retângulo que tem lados A e B.
    */
	public static void Ex06() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, pi = 3.14159, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = (A * C) / 2;
		circulo = pi * C * C;
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO = %.3f%n", triangulo);
		System.out.printf("CIRCULO = %.3f%n", circulo);
		System.out.printf("TRAPEZIO = %.3f%n", trapezio);
		System.out.printf("QUADRADO = %.3f%n", quadrado);
		System.out.printf("RETANGULO = %.3f%n", retangulo);
		
		sc.close();
	} 
	

}
