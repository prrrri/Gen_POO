package POO;

public class PessoaJuridica extends POOFundamentosEx1 {//<< vai herdar as infos dessa superclasse
	
	//criar atributos 
	
	private String cnpj;
	private String nomeFantasia;
	
	public PessoaJuridica(String nomeCliente, String endereco, String telefone, String cpf, String nascimento, String rg,
			String filiacao) {
		super(nomeCliente, endereco, telefone, cpf, nascimento);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	//puxar as informações do get, que são públicas
	public void imprimirInfo() {//modo visualizar
		System.out.println("\nNome do Cliente: "+getnomeCliente());
		System.out.println("\nEndereço: "+getEndereco());
		System.out.println("\nTelefone: "+getTelefone());
		System.out.println("\nCPF: "+getCpf());
		System.out.println("\nData de Nascimento: "+getNascimento());
		System.out.println("\nCNPJ: "+cnpj);
		System.out.println("\nNome Fantasia: "+nomeFantasia);
	}
	
}
