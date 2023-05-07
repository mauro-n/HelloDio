import java.util.Scanner;
/**
 * Contador
 * <p>Classe para resolução do desafio de controle de fluxo e tratamento
 * de execeções no Java</p>
 * @author mauro-n
 * @since 07/05/2023
 * 
 */
public class Contador {
	/**
	 * Solicita dois inteiros e chama a o método contar;
	 * @param args No-params
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o primeiro parâmetro: ");
		int first = input.nextInt();
		
		System.out.println("Insira o segundo parâmetro: ");
		int second = input.nextInt();
		
		try {
			contar(first, second);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
			e.getErrorMsg();
		}
	};
	/**
	 * Imprime contagem de 0 até a diferença entre o primeiro e segundo parâmetro; <br>
	 * Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências.
	 * @param first Primeiro inteiro para subtração
	 * @param second Segundo inteiro para subtração
	 * @throws ParametrosInvalidosException O primeiro inteiro deve ser menor que o segundo.
	 */
	public static void contar(int first, int second) throws ParametrosInvalidosException{
		if (first > second) {
			throw new ParametrosInvalidosException("O primeiro valor deve ser menor que o segundo!");
		};
		
		for (int i = 0; i < (second - first); i++ ) {
			System.out.println("Imprimindo o número: " + i);
		};
		
	};
}

