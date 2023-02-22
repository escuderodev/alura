package br.com.escuderodev.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.processing.SupportedSourceVersion;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/home")
public class PrimeiroServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p>Ola! Voce esta acessando o meu primeiro Servlet.</p>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Deu certo!");

	}
}
