package iphone;

import internetBrowser.InternetBrowser;
import ipod.Ipod;
import phone.Phone;

public class Iphone implements InternetBrowser, Phone, Ipod {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando música");
		
	}

	@Override
	public void chamar() {
		System.out.println("Chamando número");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página");
		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
		
	}


}
