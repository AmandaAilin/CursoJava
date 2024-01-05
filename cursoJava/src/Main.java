import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// ExFixacao();
		// Ex01();
		// Ex02();
		// Ex03();
		// Ex04();
		// Ex05();
		// Ex06();
		// Telefonia();
		// Programa();
		// EX07();
		// EX08();
		// EX09();
		// EX10();
		// EX11();
		// EX12();
		// EX13();
		// EX14();
		Terreno();
	}

	/*
	 * Exercício de fixação: Em um novo programa, inicie as seguintes variáveis
	 * 
	 * String product1 = "Computer"; String product2 = "Office desk"; int age = 30;
	 * int code = 5290; char gender = 'F'; double price1 = 2100.0; double price2 =
	 * 650.50; double measure = 53.234567;
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
	 * Ex01: Faça um programa para ler dois valores inteiros, e depois mostrar na
	 * tela a soma desses números com uma mensagem explicativa, conforme exemplos.
	 */
	public static void Ex01() {
		Scanner sc = new Scanner(System.in);
		int a, b, soma;
		a = sc.nextInt();
		b = sc.nextInt();
		soma = a + b;

		System.out.println("SOMA = " + soma);
		sc.close();
	}

	/*
	 * Ex02: Faça um programa para ler o valor do raio de um círculo, e depois
	 * mostrar o valor da área deste círculo com quatro casas decimais conforme
	 * exemplos. Fórmula da área: area = π . raio^2 Considere o valor de π = 3.14159
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
	 * Ex03: Fazer um programa para ler quatro valores inteiros A, B, C e D. A
	 * seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e
	 * D segundo a fórmula: DIFERENCA = (A * B - C * D).
	 */

	public static void Ex03() {
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
	 * Ex04: Fazer um programa que leia o número de um funcionário, seu número de
	 * horas trabalhadas, o valor que recebe por hora e calcula o salário desse
	 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
	 * casas decimais.
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
	 * Ex05: Fazer um programa para ler o código de uma peça 1, o número de peças 1,
	 * o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2
	 * e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
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
	 * Ex06: Fazer um programa que leia três valores com ponto flutuante de dupla
	 * precisão: A, B e C. Em seguida, calcule e mostre: a) a área do triângulo
	 * retângulo que tem A por base e C por altura. b) a área do círculo de raio C.
	 * (pi = 3.14159) c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B. e) a área do retângulo que tem lados A
	 * e B.
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

	// Estrutura condicional
	/*
	 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito
	 * a 100 minutos de telefone. Cada minuto que exceder a franquia de 100 minutos
	 * custa R$ 2.00. Fazer um programa para ler a quantidade de minutos que uma
	 * pessoa consumiu, daí mostrar o valor a ser pago.
	 */
	public static void Telefonia() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();
		double conta = 50.0;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor a pagar = R$ %.2f%n", conta);
		sc.close();
	}

	/*
	 * switch-case Fazer um programa para ler um valor inteiro de 1 a 7
	 * representando um dia da semana sendo 1=domingo, 2=segunda, e assim por
	 * diante). Escrever na tela o dia da semana correspondente, conforme exemplos.
	 */

	public static void Programa() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "valor invalido";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}

	/*
	 * Ex07: Fazer um programa para ler um número inteiro, e depois dizer se este
	 * número é negativo ou não.
	 */

	public static void EX07() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}

		sc.close();
	}

	/*
	 * Ex08: Fazer um programa para ler um número inteiro e dizer se este número é
	 * par ou ímpar.
	 */

	public static void EX08() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

	/*
	 * Ex09: Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
	 * mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores
	 * lidos são múltiplos entre si. Atenção: os números devem poder ser digitados
	 * em ordem crescente ou decrescente.
	 * 
	 */

	public static void EX09() {
		Scanner sc = new Scanner(System.in);
		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();
		if (A % B == 0 || B % A == 0) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}

		sc.close();

	}

	/*
	 * Ex10: Leia a hora inicial e a hora final de um jogo. A seguir calcule a
	 * duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em
	 * outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
	 */

	public static void EX10() {

		Scanner sc = new Scanner(System.in);

		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();

		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();
	}

	/*
	 * Ex11: Com base na tabela abaixo, escreva um programa que leia o código de um
	 * item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a
	 * pagar.
	 * 
	 * Codigo / especificação / preço 1 cachorro quente R$4.00 2 x-salada R$4.50 3
	 * x-bacon R$5.00 4 torrada simples R$2.00 5 Refrigerante R$1.50
	 */

	public static void EX11() {
		Scanner sc = new Scanner(System.in);
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double total;
		if (codigo == 1) {
			total = quantidade * 4.00;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.00;
		} else if (codigo == 4) {
			total = quantidade * 2.00;
		} else {
			total = quantidade * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();
	}

	/*
	 * Ex12: Você deve fazer um programa que leia um valor qualquer e apresente uma
	 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50],
	 * (50,75],(75,100]) este valor se encontra. Obviamente se o valor não estiver
	 * em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de
	 * intervalo”.
	 */

	public static void EX12() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		if (numero < 0.0 || numero > 100.0) {
			System.out.println("Fora de intervalo");
		} else if (numero <= 25.0) {
			System.out.println("Intervalo [0,25]");
		} else if (numero <= 50.0) {
			System.out.println("Intervalo (25,50]");
		} else if (numero <= 75.0) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}

		sc.close();

	}

	/*
	 * Ex13: Leia 2 valores com uma casa decimal (x e y), que devem representar as
	 * coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao
	 * qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem
	 * (x = y = 0). Se o ponto estiver na origem, escreva a mensagem “Origem”. Se o
	 * ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
	 * situação.
	 */

	public static void EX13() {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("Eixo Y");
		} else if (y == 0.0) {
			System.out.println("Eixo X");
		} else if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}

		sc.close();
	}

	/*
	 * Ex14: Em um país imaginário denominado Lisarb, todos os habitantes ficam
	 * felizes em pagar seus impostos, pois sabem que nele não existem políticos
	 * corruptos e os recursos arrecadados são utilizados em benefício da população,
	 * sem qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$. Leia
	 * um valor com duas casas decimais, equivalente ao salário de uma pessoa de
	 * Lisarb. Em seguida, calcule e mostre o valor que esta pessoa deve pagar de
	 * Imposto de Renda, segundo a tabela abaixo.
	 * 
	 * |-------------------------------|---------------------| | Renda | Imposto de
	 * Renda | |-------------------------------|---------------------| | de 0.0 a
	 * R$2000.00 | Isento | | de R$2000.01 até R$3000.00 | 8% | | de R$3000.01 até
	 * R$4500.00 | 18% | | acima de R$4500.00 | 28% |
	 * |-----------------------------------------------------|
	 * 
	 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas
	 * sobre R$ 1000.00, pois a faixa de salário que fica de R$ 0.00 até R$ 2000.00
	 * é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é de 8%
	 * sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O
	 * valor deve ser impresso com duas casas decimais.
	 */

	public static void EX14() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double imposto;
		if (salario <= 2000.0) {
			imposto = 0.0;
		} else if (salario <= 3000.0) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500.0) {
			imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imposto);
		}

		sc.close();
	}

	//Como executar o debug do Eclipse
	
	public static void Terreno() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		sc.close();
	}

}
