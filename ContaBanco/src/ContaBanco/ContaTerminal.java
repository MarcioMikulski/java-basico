package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor digite o número da sua conta :");
        int numeroConta = sc.nextInt();
        
        
        System.out.println("Por favor digite o seu nome: ");
        sc.nextLine();
        String nomeCliente = sc.nextLine();
        
        System.out.println("Por favor Digite o seu saldo ");
        double saldo = sc.nextDouble();
        System.out.println("-------------------------------------------");
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque.%n", 
                nomeCliente, agencia, numeroConta, saldo);

sc.close();
	}

}
