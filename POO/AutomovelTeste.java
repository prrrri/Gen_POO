package POO;

public class AutomovelTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//instanciando um objeto da classe Automóvel
		
		Automovel auto1 = new Automovel("Clésio","Honda Civic","PDF123",2023);
		
		auto1.imprimirInfo();
		
		auto1.setNomeProprietario("Steffanie Manini");
		
		auto1.setPlaca("STE1A74");
		
		auto1.imprimirInfo();
	}

}