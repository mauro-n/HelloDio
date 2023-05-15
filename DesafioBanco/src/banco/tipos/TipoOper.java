package banco.tipos;

public enum TipoOper {
	TRANSFERENCIA("TRANSFERENCIA"),
	RECEB_TRANSFERENCIA("RECEBIMENTO DE TRANSFERENCIA"),
	SAQUE("SAQUE"),
	DEPOSITO("DEPOSITO"),
	ERROR("ERROR");
	
	private String tipo;
	
	private TipoOper(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
}
