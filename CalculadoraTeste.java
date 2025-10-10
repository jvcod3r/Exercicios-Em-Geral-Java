package Projetos;
import java.util.Scanner;

public class CalculadoraTeste {

	public static void main(String[] args) {
		int resposta = 1; 
		Scanner sc = new Scanner(System.in);
		Calculadora c = new Calculadora();
		
		
		while(resposta == 1)
		{
			System.out.println("\nBem-vindo à Calculadora 2.0");
			System.out.println("----------------------------");

			System.out.println("Indique a operação desejada:");
			System.out.println("------------------------------");

			System.out.println("1-Somar \n2-Subtrair\n3-Multiplicar\n4-Dividir"
					+ "\n5-Calcular Porcentagem\n6-Raiz Quadrada\n7-Calcular Fatorial\n");
			int op = sc.nextInt();

			double valA;
			double valB;

			switch (op) {

				case 1:
					System.out.println("Insira o primeiro valor: ");
					valA = sc.nextDouble();
					System.out.println("Insira o segundo valor: ");
					valB = sc.nextDouble();
					System.out.printf("%.2f + %.2f = %.2f%n", valA, valB, c.somar(valA, valB));
					break;

				case 2:
					System.out.println("Insira o primeiro valor: ");
					valA = sc.nextDouble();
					System.out.println("Insira o segundo valor: ");
					valB = sc.nextDouble();
					System.out.printf("%.2f - %.2f = %.2f%n", valA, valB, c.subtrair(valA, valB));
					break;

				case 3:
					System.out.println("Insira o primeiro valor: ");
					valA = sc.nextDouble();
					System.out.println("Insira o segundo valor: ");
					valB = sc.nextDouble();
					System.out.printf("%.2f * %.2f = %.2f%n", valA, valB, c.multiplicar(valA, valB));
					break;

				case 4:
					System.out.println("Insira o dividendo: ");
					valA = sc.nextDouble();
					System.out.println("Insira o divisor: ");
					valB = sc.nextDouble();
					System.out.printf("%.2f / %.2f = %.2f%n", valA, valB, c.dividir(valA, valB));
					break;

				case 5:
					System.out.println("Insira o valor total: ");
					valA = sc.nextDouble();
					System.out.println("Insira a porcentagem (apenas números, ex: 15): ");
					valB = sc.nextDouble();
					System.out.printf("%.2f%% de %.2f = %.2f%n", valB, valA, c.porcent((int)valA, valB));
					break;

				case 6:
					System.out.println("Insira o valor que deseja descobrir a raiz quadrada: ");
					valA = sc.nextDouble();
					System.out.printf("A raiz quadrada de %.2f = %.4f%n", valA, (double)c.raiz((int)valA));
					break;

				case 7:
					System.out.println("Insira o valor inteiro que deseja calcular o fatorial: ");
					int numFatorial = sc.nextInt();
					System.out.printf("O fatorial de %d! = %d%n", numFatorial, c.fatorial(numFatorial));
					break;

				default:
					System.out.println("Insira uma opção válida!");
					break;
			}
			
			
			System.out.println("\n------------------------------");
			System.out.println("Deseja continuar usando a Calculadora? \n1-SIM\n2-NÃO (ou qualquer outro número)");
			resposta = sc.nextInt();
		} 
		
		System.out.println("Obrigado por usar a calculadora!");
		sc.close();
	}
}