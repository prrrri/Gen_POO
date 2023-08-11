package POO;

public class PessoaFisica extends POOFundamentosEx1 {//<< vai herdar as infos dessa superclasse
	
	//criar atributos 
	
	private String rg;
	private String filiacao;
	public PessoaFisica(String nomeCliente, String endereco, String telefone, String cpf, String nascimento, String rg,
			String filiacao) {
		super(nomeCliente, endereco, telefone, cpf, nascimento);
		this.rg = rg;
		this.filiacao = filiacao;
	}
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}
	
	//puxar as informações do get, que são públicas
	public void imprimirInfo() {//modo visualizar
		System.out.println("\nNome do Cliente: "+getnomeCliente());
		System.out.println("\nEndereço: "+getEndereco());
		System.out.println("\nTelefone: "+getTelefone());
		System.out.println("\nCPF: "+getCpf());
		System.out.println("\nData de Nascimento: "+getNascimento());
		System.out.println("\nRG: "+rg);
		System.out.println("\nFiliação: "+filiacao);
	}
	
}
