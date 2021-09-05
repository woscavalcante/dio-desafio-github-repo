import java.lang.Math;
import java.util.Scanner;

public class TestesMatematicos{
	
	public static boolean testeDeMultiplicacao(){
		boolean resultado = false;
		int multiplicador, multiplicando, resposta, multiplicacao;

		multiplicando = (int)(Math.random() *10 ) + 1;
		multiplicador = (int)(Math.random() *10 ) + 1;

		System.out.println("Quanto e " + multiplicando + " vezes " + multiplicador + " ?");

		Scanner scanner = new Scanner(System.in);
		resposta = scanner.nextInt();

		multiplicacao = multiplicando * multiplicador;

		if(resposta == multiplicacao){
			System.out.println("Acertou!!");
			resultado = true;
		} else {
			System.out.println("Errou!! A resposta correta e " + multiplicacao);
		}


		return resultado;
	}


	public static boolean testeDeSoma(){
		boolean resultado = false;
		int numeroA, numeroB, resposta, soma;

		numeroA = (int)(Math.random() *10 ) + 1;
		numeroB = (int)(Math.random() *10 ) + 1;

		System.out.println("Quanto e " + numeroA + " mais " + numeroB + " ?");

		Scanner scanner = new Scanner(System.in);
		resposta = scanner.nextInt();

		soma = numeroA + numeroB;

		if(resposta == soma){
			System.out.println("Acertou!!");
			resultado = true;
		} else {
			System.out.println("Errou!! A resposta correta e " + soma);
		}


		return resultado;
	}


	public static void main(String[] args){

		testeDeMultiplicacao();

		System.out.println();

		testeDeSoma();
		
	}
}