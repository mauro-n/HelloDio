package banco;
import banco.cliente.Pessoa;
import banco.conta.*;

public class Main {
	public static void main (String[] args) {
		Pessoa cliente1 = new Pessoa("Mario Augusto");		
		Pessoa cliente2 = new Pessoa("Louro José");
		
		Conta conta1 = new ContaCorrente(cliente1);
		Conta conta2 = new ContaCorrente(cliente2);

		conta1.depositar(100.0);
		conta1.transferir(50.0, conta2);

		Banco.getComprovantes();
		
		//Banco.getClientes();
		//Banco.getContas();
		//System.out.println(Banco.totalContas);
	}
}
