package desafioDioBanco;

public class Main {

	public static void main(String[] args) {
		Cliente marcio = new Cliente();
		marcio.setNome("Marcio Mikulski");
		marcio.setEndereco("Travessa Arnaldo Lopes da Silva, 944");
		
		//System.out.println(marcio.getNome());
		
		
		Conta cc = new ContaCorrente(marcio);
		Conta poupanca = new ContaPoupanca(marcio);
		cc.depositar(100);
		cc.sacar(10);
		
		
		poupanca.depositar(50);
		
		cc.transferir(30, poupanca);
		
				
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}
