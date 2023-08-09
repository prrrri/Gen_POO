package POO;

public class EmpregadoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empregado[] lista = new Empregado[3];
		
		lista[0] = new Empregado("Mauricio Freire",10000);
		lista[1] = new Empregado("Thamires Ribeiro Cruz",20000);
		lista[2] = new Empregado("Matheus Bergamo",35000);
		
		for(Empregado roda:lista) {
			roda.imprimir();
		}
		
		System.out.println("*******************************************************");
		
		for(Empregado roda:lista) {
			roda.aumentarSalario(10);
			roda.imprimir();
		}
	}

}