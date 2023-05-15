package banco.conta;
import java.time.LocalDateTime;
import banco.tipos.*;

public class Comprovante {
	private LocalDateTime data;
	private TipoOper tipoOperacao;
	private String remetente = "Conta ";
	private String destinatario = "Conta ";
	private double valor;
	private String descricao;
	
	public Comprovante(TipoOper tipo, Conta remetente, Conta destinatario, double valor) {
		this.data = LocalDateTime.now();
		this.tipoOperacao = tipo;
		this.remetente += remetente.getNumero();
		this.destinatario += destinatario.getNumero();
		this.valor = valor;
	}
	
	public Comprovante(TipoOper tipo, Conta remetente, double valor) {
		this.data = LocalDateTime.now();
		this.tipoOperacao = tipo;
		this.remetente += remetente.getNumero();
		this.destinatario = null;
		this.valor = valor;
	}
	
	public Comprovante(TipoOper tipo, String descricao) {
		this.descricao = descricao;
	}
	
	public String toString() {
		
		if (this.tipoOperacao == TipoOper.ERROR) {
			return String.format("Erro ao realizar a operacao%n"
					+ "Detalhes: %s", this.descricao);
		}
		
		if (this.destinatario == null) {
			return String.format(
					"===== %s =====%n"
					+ "Em: %s%n"
					+ "Na: %s%n"
					+ "Valor: %.2f%n",
					this.tipoOperacao,
					this.data,
					this.remetente,
					this.valor
					);
		}
		
		return String.format(
				"===== %s =====%n"
				+ "Em: %s%n"
				+ "De: %s%n"
				+ "Para: %s%n"
				+ "Valor: %.2f%n",
				this.tipoOperacao,
				this.data,
				this.remetente,
				this.destinatario,
				this.valor
				);
	}

	public LocalDateTime getData() {
		return data;
	}

	public TipoOper getTipoOperacao() {
		return tipoOperacao;
	}

	public String getRemetente() {
		return remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public double getValor() {
		return valor;
	}
	
}
