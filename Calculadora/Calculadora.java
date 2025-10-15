package Projetos;

public class Calculadora {

	public double somar(double numA , double numB) {
		return numA + numB;
		
	}
	
	public double subtrair(double numA , double numB){
		return numA - numB;
	}
	
	public double multiplicar(double numA , double numB){
		
		return numA * numB;
	} 
	
	public double dividir(double numA , double numB) {
		if(numA == 0 || numB == 0) {
			System.out.println("Não é possível dividir por 0!");
		}
		
		return numA / numB;
		
		 }
	public double porcent(int numA , double FatorPercent) {
		FatorPercent /= 100;
		return numA * FatorPercent;
	}
	public double raiz(int numA) {
		return  Math.sqrt(numA);
	}
	public long fatorial(int numA) {
		int temp;
		for(int i = numA - 1; i > 0; i--) {
			temp = numA * i;
			numA = temp;
		}
		return numA;
		
	}
		
	
	
}


