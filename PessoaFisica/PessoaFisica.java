public class PessoaFisica{
	private Long id;
	private String nome;
	private String sobrenome;
	private String cpf;

	public PessoaFisica(){

	}

	public PessoaFisica(Long id, String nome, String sobrenome, String cpf){
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}


	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getSobrenome(){
		return this.sobrenome;
	}

	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}

	public String getCpf(){
		return this.cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}
}