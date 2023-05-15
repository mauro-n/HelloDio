package banco.tipos;

public enum TipoConta {
	CORRENTE("CC"),
	POUPANCA("CP");
	
	private String tipo;
	
	private TipoConta(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
