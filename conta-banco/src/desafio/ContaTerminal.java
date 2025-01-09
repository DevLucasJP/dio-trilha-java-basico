package desafio;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String nomeCliente;
		int numeroConta;
		String agencia;
		double saldo;

		System.out.println("Digite o seu nome: ");
		nomeCliente = scan.nextLine();

		System.out.println("Digite o número da sua conta: ");
		numeroConta = scan.nextInt();
		scan.nextLine();

		System.out.println("Digite o número da agência: ");
		agencia = scan.nextLine();

		System.out.println("Digite o seu saldo: ");
		saldo = scan.nextDouble();

		System.out.println("Olá, " + nomeCliente + ", obrigado(a) por criar uma conta em nosso banco. Sua agência é "
				+ agencia + ", número da conta é " + numeroConta + " e seu saldo de R$ " + saldo
				+ " já está disponível para saque!");

		scan.close();
	}
}
