package br.com.cadastro;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Usuario> lista = new ArrayList<Usuario>();
	
	
	public void adiciona(Usuario usuario) {
		
		lista.add(usuario);
	}

}
