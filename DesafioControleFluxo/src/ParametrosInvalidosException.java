/**
 * Trata erros de parâmetros inválidos para a classe Contador
 * @author mauro-n
 *@since 07/05/2023
 */
public class ParametrosInvalidosException extends Exception {
	/**
	 * O errorMsg é o atributo que armazena a mensagem de erro do
	 * último erro encontrado.
	 */
	private String errorMsg = "";
	/**
	 * Monta a mensagem de erro errorMsg.
	 * @param error String que especifíca o erro do programa.
	 */
	public ParametrosInvalidosException(String error) {
		this.errorMsg = "Parâmetros Inválidos: ";
		this.errorMsg += error;
	}
	
	public String getErrorMsg() {
		System.out.println(this.errorMsg);
		return this.errorMsg;
	}
}
