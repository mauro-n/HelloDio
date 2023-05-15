package banco.conta;
import banco.cliente.Pessoa;
import banco.tipos.TipoConta;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(Pessoa dono) {
		super(dono, TipoConta.POUPANCA);
	}
}
