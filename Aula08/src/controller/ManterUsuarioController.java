package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import service.UsuarioService;

/**
 * Servlet implementation class ManterUsuarioController
 */
@WebServlet("/ManterUsuario.do")
public class ManterUsuarioController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
    
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        String pnome = request.getParameter("nome");
    	String pcpf = request.getParameter("cpf");
    	String prg = request.getParameter("rg");
    	String pendereco = request.getParameter("endereco");
    	String pdataDeNascimento = request.getParameter("dataDeNascimento");
    	String pnomeEmpresa = request.getParameter("nomeEmpresa");
        
        //instanciar o javabean
        Usuario usuario = new Usuario();
        usuario.setNome(pnome);
        usuario.setCpf(pcpf);
        usuario.setRg(prg);
        usuario.setEndereco(pendereco);
        usuario.setDataDeNascimento(pdataDeNascimento);
        usuario.setNomeEmpresa(pnomeEmpresa);
        
        
        
        //instanciar o service
        UsuarioService us = new UsuarioService();
        us.criar(usuario);
        usuario = us.carregar(usuario.getId());
       // es.excluir(empresa);
       // empresa = es.excluir(empresa.getId());
        
        //enviar para o jsp
        request.setAttribute("usuario", usuario);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("Usuario.jsp");
        view.forward(request, response);
        
    }
    
}
