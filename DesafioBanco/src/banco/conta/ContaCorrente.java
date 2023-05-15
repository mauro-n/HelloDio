package banco.conta;
import banco.cliente.Pessoa;
import banco.tipos.TipoConta;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(Pessoa dono) {
		super(dono, TipoConta.CORRENTE);		
	}
}
