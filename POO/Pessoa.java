package POO;

public class Pessoa {
	
	//essa classe não tem um main. será a superclasse

	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	//criando método construtor
	public Pessoa(String nome, String endereco, String cpf, int telefone, int idade) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
		this.idade = idade;
	}

	//getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//validando a quantidade de números do cpf
	public void validarCpf() {
		if(getCpf().length() != 11) {
			System.out.println("\n--CPF Inválido!!!");
		} else {
			System.out.println("\n--CPF Válido!!!");
		}
	}
	
	
}
