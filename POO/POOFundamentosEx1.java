package POO;

public class POOFundamentosEx1 {
	
/*
	Utilizando os conceitos de Classe, Objetos e Métodos da POO,
	crie a Classe Cliente com os seus respectivos Métodos e Atributos. Na sequência,
	crie uma Classe chamada TestaCliente, instancie 2 Objetos da Classe Cliente e
	apresente as informações destes 2 Objetos no console. 
		
 */
	
	//declaração dos atributos da classe
	private String nomeCliente;
	private String endereco;
	private String telefone;
	private String cpf;
	private String nascimento;
	
	//criação de método construtor
	public POOFundamentosEx1(String nomeCliente, String endereco, String telefone, String cpf, String nascimento) {
		super();
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.nascimento = nascimento;
	}

	public String getnomeCliente() {
		return nomeCliente;
	}

	public void setnomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public void imprimir() {
		System.out.println("\nNome do Cliente: "+nomeCliente);
		System.out.println("\nEndereço: "+endereco);
		System.out.println("\nTelefone: "+telefone);
		System.out.println("\nCPF: "+cpf);
		System.out.println("\nData de Nascimento: "+nascimento);
	}
		
	
}
