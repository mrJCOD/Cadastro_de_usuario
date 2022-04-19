package br.com.cadastro;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novoUsuario")
public class NovoUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Usuario Cadastrado com sucesso!! Ihuuuu :)");
		String nomeUsuario = request.getParameter("nome");
		String wpp = request.getParameter("wpp");
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(nomeUsuario);
		usuario.setWpp(wpp);
		
		//SIMULAR CONEXAO COM O BANCO DE DADOS	
		
		Banco banco = new Banco();
		
		banco.adiciona(usuario);
		
		request.setAttribute("usuarios", usuario.getNome());
		request.setAttribute("Whatapp", usuario.getWpp());
		
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Cadastrado com Sucesso!! IHUUUU :)</h1></body></html>");
		
		
		
		
	}

}
