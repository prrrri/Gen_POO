package POO;

import java.text.NumberFormat;

public class Empregado {

	//declaração dos atributos da classe
	private String nome;
	private double salario;
	
	//declaração do construtor da classe
	public Empregado(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	//declaração dos gets e sets da classe
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//declaração dos métodos específicos da classe
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();//método para pegar a moeda do país
		nf.setMinimumFractionDigits(2);//método para estipular a quantidade de casas decimais
		String formatoMoeda = nf.format(salario);//método para formatar o salário
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println(nome+ " "+"Salário: "+this.formatarMoeda());
		
	}
	
	
}