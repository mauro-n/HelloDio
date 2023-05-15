package banco.conta;
import java.time.LocalDateTime;
import banco.tipos.*;
import banco.cliente.Pessoa;
import banco.Banco;

public abstract class Conta {
	
	private String banco = Banco.getNome();
	private int numero;
	private int agencia = 13;
	private Pessoa dono;
	private double saldo = 0;
	private TipoConta tipo;
	private LocalDateTime ativaDesde;
	
	public Conta(Pessoa dono, TipoConta tipo) {
		this.numero = ++(Banco.totalContas);
		this.dono = dono;
		this.dono.addConta(this);
		this.tipo = tipo;
		this.ativaDesde = LocalDateTime.now();
		Banco.addConta(this);
	}
	
	public Comprovante sacar(double valor) {
		if (this.saldo < valor) {
			return gerarComprovante(TipoOper.ERROR, "Você não possui saldo suficiente para sacar o valor selecionado");
		}
		this.saldo -= valor;
		return gerarComprovante(TipoOper.SAQUE, valor);
	}
	
	public Comprovante depositar(double valor) {
		this.saldo += valor;
		return gerarComprovante(TipoOper.DEPOSITO, valor);
	}
	
	public Comprovante transferir(double valor, Conta contaDestino) {
		if (valor > this.saldo) {
			return gerarComprovante(TipoOper.ERROR, "O valor a ser transferido é maior que o valor em conta");
		}
		
		Comprovante comprova = gerarComprovante(TipoOper.TRANSFERENCIA, this, contaDestino, valor);
		
		contaDestino.receberTransferencia(valor, this);
		
		this.saldo -= valor;
		
		return comprova;
	}
	
	public Comprovante receberTransferencia(double valor, Conta origem) {
		this.saldo += valor;
		return gerarComprovante(TipoOper.RECEB_TRANSFERENCIA, origem, this, valor);
	};
	
	private Comprovante gerarComprovante(TipoOper oper, Conta origem, Conta destinatario, double valor) {
		Comprovante aComprovante = new Comprovante(oper, origem, destinatario, valor);
		Banco.addComprovante(aComprovante);
		return aComprovante;
	}
	
	private Comprovante gerarComprovante(TipoOper oper, double valor) {
		Comprovante aComprovante = new Comprovante(oper, this, valor);
		Banco.addComprovante(aComprovante);
		return aComprovante;
	}
	
	private Comprovante gerarComprovante(TipoOper oper, String descricao) {
		Comprovante aComprovante = new Comprovante(oper, descricao);
		Banco.addComprovante(aComprovante);
		return aComprovante;
	}
	
	public String getSaldo() {
		return String.format("Seu saldo é: %.2f", this.saldo);
	}
	
	public String getNumero() {
		return String.format("%04d", this.numero);
	}
	
	public String toString() {
		
		return String.format(
				"%n===== Conta número: %04d =====%n"
				+ "Tipo de conta: %s%n"
				+ "Agencia: %d%n"
				+ "Properietário: %s%n"
				+ "Ativa desde: %s%n",
				this.numero,
				this.tipo,
				this.agencia,
				this.dono.getNome(),
				this.ativaDesde);
	}

	public String getBanco() {
		return this.banco;
	}

	public Pessoa getDono() {
		return this.dono;
	}
}
