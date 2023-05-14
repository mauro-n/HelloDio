package iphone;

import internetBrowser.InternetBrowser;
import ipod.Ipod;
import phone.Phone;

public class Iphone implements InternetBrowser, Phone, Ipod {

	@Override
	public void tocarMusica() {
		System.out.println("Tocando m�sica");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando m�sica");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando m�sica");
		
	}

	@Override
	public void chamar() {
		System.out.println("Chamando n�mero");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo liga��o");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
		
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo p�gina");
		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando p�gina");
		
	}


}
