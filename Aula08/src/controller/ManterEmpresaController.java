package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Empresa;
import service.EmpresaService;

/**
 * Servlet implementation class ManterEmpresaController
 */
@WebServlet("/ManterEmpresa.do")
public class ManterEmpresaController extends HttpServlet {
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
      
        String pcnpj = request.getParameter("cnpj");
    	String prazaoSocial = request.getParameter("razaoSocial");
    	String pconjunto = request.getParameter("conjunto");
    	String phorarioDeFuncionamento = request.getParameter("horarioDeFuncionamento");
    	String ptemperaturaDoArCondicionado = request.getParameter("temperaturaDoArCondicionado");
    	String phorarioDoArCondicionado = request.getParameter("horarioDoArCondicionado");
        
        //instanciar o javabean
        Empresa empresa = new Empresa();
        empresa.setCnpj(pcnpj);
        empresa.setRazaoSocial(prazaoSocial);
        empresa.setConjunto(pconjunto);
        empresa.setHorarioDeFuncionamento(phorarioDeFuncionamento);
        empresa.setTemperaturaDoArCondicionado(ptemperaturaDoArCondicionado);
        empresa.setHorarioDoArCondicionado(phorarioDoArCondicionado);
        
        
        
        //instanciar o service
        EmpresaService es = new EmpresaService();
        es.criar(empresa);
        empresa = es.carregar(empresa.getId());
       // es.excluir(empresa);
       // empresa = es.excluir(empresa.getId());
        
        //enviar para o jsp
        request.setAttribute("empresa", empresa);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("Empresa.jsp");
        view.forward(request, response);
        
    }
    
}