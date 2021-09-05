public class ProvaDeMatematica{

	public static void main(String[] args){
		int respostasCorretas = 0;
		System.out.println("Esta é uma prova de matemática.");

		for(int i=0; i < 5; i++){
			boolean acertou = TestesMatematicos.testeDeMultiplicacao();
			if(acertou){
				respostasCorretas++;
			}

			boolean acertouSoma = TestesMatematicos.testeDeSoma();
			if(acertouSoma){
				respostasCorretas++;
			}
		}

	System.out.print("\nVoce acertou " + respostasCorretas + " de 10 questoes.");
	}
}