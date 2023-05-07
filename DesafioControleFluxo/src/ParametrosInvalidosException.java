/**
 * Trata erros de par�metros inv�lidos para a classe Contador
 * @author mauro-n
 *@since 07/05/2023
 */
public class ParametrosInvalidosException extends Exception {
	/**
	 * O errorMsg � o atributo que armazena a mensagem de erro do
	 * �ltimo erro encontrado.
	 */
	private String errorMsg = "";
	/**
	 * Monta a mensagem de erro errorMsg.
	 * @param error String que especif�ca o erro do programa.
	 */
	public ParametrosInvalidosException(String error) {
		this.errorMsg = "Par�metros Inv�lidos: ";
		this.errorMsg += error;
	}
	
	public String getErrorMsg() {
		System.out.println(this.errorMsg);
		return this.errorMsg;
	}
}
