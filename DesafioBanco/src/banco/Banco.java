package banco;
import banco.conta.Conta;
import java.util.ArrayList;
import banco.conta.Comprovante;

public class Banco {
	private static String nome = "Dio Digital Banking";
	private static ArrayList<Conta> contas = new ArrayList<>();
	private static ArrayList<Comprovante> comprovantes = new ArrayList<>();
	public static int totalContas = 0;
	
	public static void getContas() {
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}
	
	public static void addConta(Conta conta) {
		contas.add(conta);
	}

	public static void getComprovantes() {
		for (Comprovante c : comprovantes) {
			System.out.println(c);
		}
	}

	public static void addComprovante(Comprovante comprovante) {
		comprovantes.add(comprovante);
	}

	public static void getClientes() {
		for (Conta conta : contas) {
			System.out.println(conta.getDono().toString());
		}
	}

	public static String getNome() {
		return nome;
	}
}
