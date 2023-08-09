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

	}

}
