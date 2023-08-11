package POO;

public class Empregado1 extends Pessoa{
	
	//subclasse. também não tem main, vai herdar da classe Pessoa.java o que precisar
	
	//CRIEI ATRIBUTOS DA SUBCLASSE
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	//parâmetros de cada classe pessoa
	public Empregado1 (String nome, String endereco,String cpf, int telefone,
			int idade,int codigoSetor, float salarioBase, float imposto) {
		//indicar quem vem da superclasse
		super(nome,endereco,cpf,telefone,idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	//chamando o nome do private campo nome da classe Pessoa, então não passa diretamente.
	//solução: puxar do getNome, que é public
	public void imprimirInfo() {
		System.out.println("\nNome do empregado: "+getNome()
		+"\nCPF: "+getCpf()
		+"\nIdade: "+getIdade()
		+"\nTelefone: "+getTelefone()
		+"\nEndereço: "+getEndereco()
		+"\nCódigo do setor: "+codigoSetor
		+"\nSalário base: "+salarioBase
		+"\nValor em porcentagem (sem o %) de imposto a ser retido: "+imposto);
	}
	
	public void calcularSalario () {
		var salarioTotal = salarioBase - (salarioBase *(imposto/100));
		System.out.println("\nO salário total a ser recebido pelo empregado "+getNome()+
				" é igual a: R$"+salarioTotal);
	}
	
}