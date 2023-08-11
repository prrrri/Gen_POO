package POO;

public class POOFundamentosEx1Teste {

	public static void main(String[] args) {
	
		POOFundamentosEx1[] lista = new POOFundamentosEx1[4];
		
		lista[0] = new POOFundamentosEx1 ("Hotinael Sousa","Avenida Vila Ema 3022 apto 22","(11) 93345-8675","846.249.447-02","02/07/1992");
		lista[1] = new POOFundamentosEx1 ("Andreza Barreto","Rua da Mooca 223 apto 17","(11) 94356-1238","201.546.824-99","04/05/1994");
		lista[2] = new POOFundamentosEx1 ("Luan Gimenez","Rua Orfanato 66","(11) 99199-2157","203.741.256-32","20/05/1994");
		lista[3] = new POOFundamentosEx1 ("Daniel Fernando","Avenida São Caetano 13 apto 57","(11) 96339-2185","302.147.256-33","02/02/1992");
		
		for(POOFundamentosEx1 roda:lista) {
			roda.imprimir();
		}
		
		System.out.println("*******************************************************");
	
	PessoaFisica[] listaPessoas = new PessoaFisica[2];
	
	listaPessoas[0] = new PessoaFisica ("Israel Anacleto","Rua do Acre 14","(11) 94125-4596","05/01/2003", "147.523.478-01","45.603.414-4","Josefa Sousa");
	listaPessoas[1] = new PessoaFisica ("Maria Clara Santos","Avenida Alemanha 20","(11) 95236-4785","10/14/1996","203.145.852-14","14.123.502-4","Maria Marcolina Barreto");

	for(PessoaFisica roda1:listaPessoas) {
		roda1.imprimirInfo();	
	}
	
	PessoaJuridica[] listaPJ = new PessoaJuridica[2];
	
	listaPJ[0] = new PessoaJuridica ("Biscoitos LTDA.","Rua do Carmo 777","(11) 2541-1456","143.258.456-04","20/05/1994","14.236.456/0001-44","Biscoitos Felizes");
	listaPJ[1] = new PessoaJuridica ("Cervejinhas SA.","Rua do Macaco 27","(11) 4478-1456","142.145.132-02","14/14/1992","17.136.456/0001-11","Cantinho do Nordeste");
	
	for(PessoaJuridica roda2:listaPJ) {
	roda2.imprimirInfo();
	}
	
	}
}