import java.util.Scanner;
/**
 * Contador
 * <p>Classe para resolu��o do desafio de controle de fluxo e tratamento
 * de exece��es no Java</p>
 * @author mauro-n
 * @since 07/05/2023
 * 
 */
public class Contador {
	/**
	 * Solicita dois inteiros e chama a o m�todo contar;
	 * @param args No-params
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro par�metro: ");
		int first = input.nextInt();
		
		System.out.println("Insira o segundo par�metro: ");
		int second = input.nextInt();
		
		try {
			contar(first, second);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			e.getErrorMsg();
		}
	};
	/**
	 * Imprime contagem de 0 at� a diferen�a entre o primeiro e segundo par�metro; <br>
	 * Se voc� passar os n�meros 12 e 30, logo teremos uma intera��o (for) com 18 ocorr�ncias.
	 * @param first Primeiro inteiro para subtra��o
	 * @param second Segundo inteiro para subtra��o
	 * @throws ParametrosInvalidosException O primeiro inteiro deve ser menor que o segundo.
	 */
	public static void contar(int first, int second) throws ParametrosInvalidosException{
		if (first > second) {
			throw new ParametrosInvalidosException("O primeiro valor deve ser menor que o segundo!");
		};
		
		for (int i = 0; i < (second - first); i++ ) {
			System.out.println("Imprimindo o n�mero: " + i);
		};
		
	};
}

