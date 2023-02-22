package br.com.escuderodev.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CadastroDeEmpresaServlet
 */
public class CadastroDeEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa.");
		String nomeDaEmpresa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>Empresa " + nomeDaEmpresa + " cadastrada com sucesso!</body></html>");
	}
}
