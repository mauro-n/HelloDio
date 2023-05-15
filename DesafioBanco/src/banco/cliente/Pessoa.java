package banco.cliente;
import java.util.ArrayList;
import banco.conta.Conta;
import java.time.LocalDateTime;

public class Pessoa {
	private String nome;
	private ArrayList<Conta> contas = new ArrayList<>();
	private LocalDateTime cadastradoDesde;
	
	public Pessoa(String nome) {
		this.nome = nome;
		this.cadastradoDesde = LocalDateTime.now();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getContas() {
		
		if (contas.size() == 0) {
			return "Este cliente não possui contas cadastradas";
		}				
		return contas.toString();
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public LocalDateTime getCadastradoDesde() {
		return this.cadastradoDesde;
	}
	
	public String toString() {
		return String.format(
				"%nNome: %s%n"
				+ "Entrou em: %s",
				this.nome,
				this.cadastradoDesde);
	}
}
