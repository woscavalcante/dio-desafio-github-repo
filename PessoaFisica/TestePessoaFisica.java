public class TestePessoaFisica{

	public static void main(String[] args){

		PessoaFisica pessoa = new PessoaFisica(1L, "Willian", "Oliveira", "222.222.222-22");

		System.out.println(pessoa.getId());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getCpf());

		pessoa.setId(5L);
		pessoa.setNome("Will");
		pessoa.setSobrenome("Olivier");
		pessoa.setCpf("555.555.555-55");


		System.out.println();
		System.out.println(pessoa.getId());
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getSobrenome());
		System.out.println(pessoa.getCpf());
	}
}