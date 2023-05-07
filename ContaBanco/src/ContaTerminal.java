/**
 * <h1>ContaTerminal</h1>
 * <p>
 * A classe ContaTerminal tem como objetivo solucionar o desafio
 * da DIO para demonstrar conhecimento da sintaxe básica JAVA.
 * </p>
 * @author mauro-n
 * @since 07/05/2023
 */
import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
	/**
	 * Programa vai solicitar nome String, numeroConta int, agencia String
	 * e saldo double. Então imprime uma string formatada mostrando os dados.
	 * @param args sem args.
	 */
	public static void main(String[] args) {		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldo;
		Scanner stringInput = new Scanner(System.in).useLocale(Locale.of("br"));
		Scanner numericInput = new Scanner(System.in);
		
		System.out.println("Por favor, Insira seu nome: ");
		nomeCliente = stringInput.nextLine();
		
		System.out.println("Por favor, Insira seu número de conta: ");
		numeroConta = numericInput.nextInt();
		
		System.out.println("Por favor, Insira sua Agencia: ");
		agencia = stringInput.nextLine();
		
		System.out.println("Por favor, Insira seu saldo: ");
		saldo = numericInput.nextDouble();
		
		System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco%n"
				+ "sua agência é %s, conta %s e seu saldo %.2f já está disponivel"
				+ " para saque.", nomeCliente, agencia, numeroConta, saldo);
	}
}
