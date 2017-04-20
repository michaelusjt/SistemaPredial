package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import service.EmpresaService;
import model.Empresa;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmpresaTest {
	//Usuario usuario, copia;
	//UsuarioService usuarioService;
	
	Empresa empresa, copiar;
	EmpresaService empresaService;
	static int id = 0;

	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se tamb√©m que sobrecarregou o equals na classe
	 * Cliente. 
	 * Certifique-se que a fixture cliente1 foi criada no banco.
	 * Al√©m disso, a ordem de execu√ß√£o dos testes √© importante; por
	 * isso a anota√ß√£o FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("setup");
		/*usuario = new Usuario();
		usuario.setId(id);
		usuario.setNome("Batista Cepelos");
		usuario.setCpf("10203040506");
		usuario.setRg("111111111");
		usuario.setEndereco("Rua X");
		usuario.setDataDeNascimento("05/12/1990");
		usuario.setNomeEmpresa("Infotec");
		copia = new Usuario();
		copia.setId(id);
		copia.setNome("Batista Cepelos");
		copia.setCpf("10203040506");
		copia.setRg("111111111");
		copia.setEndereco("Rua X");
		copia.setDataDeNascimento("05/12/1990");
		copia.setNomeEmpresa("Infortec");
		usuarioService = new UsuarioService();
		System.out.println(usuario);
		System.out.println(copia);
		System.out.println(id);*/
		
		empresa = new Empresa();
		empresa.setId(id);
		empresa.setCnpj("121212121212121");
		empresa.setRazaoSocial("Grande Empresa");
		empresa.setConjunto("11");
		empresa.setHorarioDeFuncionamento("8");
		empresa.setTemperaturaDoArCondicionado("23∫");
		empresa.setHorarioDoArCondicionado("Infotec");
		copiar = new Empresa();
		copiar.setId(id);
		copiar.setCnpj("121212121212121");
		copiar.setRazaoSocial("Grande Empresa");
		copiar.setConjunto("11");
		copiar.setHorarioDeFuncionamento("8");
		copiar.setTemperaturaDoArCondicionado("23∫");
		copiar.setHorarioDoArCondicionado("Infotec");
		empresaService = new EmpresaService();
		System.out.println(empresa);
		System.out.println(copiar);
		System.out.println(id);
	}
	
	@Test
	public void teste00Carregar() {        //PARADA DAS ALTERA«’ES
		System.out.println("carregar");
		//para funcionar o usuario 1 deve ter sido carregado no banco por fora
		/*Usuario fixture = new Usuario();
		fixture.setId(1);
		fixture.setNome(null);
		fixture.setCpf(null);
		fixture.setRg(null);
		fixture.setEndereco(null);
		fixture.setDataDeNascimento(null);
		fixture.setNomeEmpresa(null);
		UsuarioService novoService = new UsuarioService();
		Usuario novo = novoService.carregar(1);
		assertEquals("testa inclusao", novo, fixture);*/
		
		Empresa empresa = new Empresa();
		
		empresa.setId(id);
		empresa.setCnpj(null);
		empresa.setRazaoSocial(null);
		empresa.setConjunto(null);
		empresa.setHorarioDeFuncionamento(null);
		empresa.setTemperaturaDoArCondicionado(null);
		empresa.setHorarioDoArCondicionado(null);
		EmpresaService empresaService = new EmpresaService();
		Empresa nova = empresaService.carregar(1);
		assertEquals("testa inclusao", nova, empresa);
	}

	@Test
	public void test01Criar() {
		/*System.out.println("criar");
		id = usuarioService.criar(usuario);
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", usuario, copia);*/
		
		System.out.println("criar");
		id = empresaService.criar(empresa);
		System.out.println(id);
		copiar.setId(id);
		assertEquals("testa criacao", empresa, copiar);
	}

	@Test
	public void test02Atualizar() {
		/*System.out.println("atualizar");
		usuario.setCpf("99999999999");
		copia.setCpf("99999999999");		
		usuarioService.atualizar(usuario);
		usuario = usuarioService.carregar(usuario.getId());
		assertEquals("testa atualizacao", usuario, copia);*/
		
		System.out.println("atualizar");
		empresa.setCnpj("1111111111");
		copiar.setCnpj("1111111111");		
		empresaService.atualizar(empresa);
		empresa = empresaService.carregar(empresa.getId());
		assertEquals("testa atualizacao", empresa, copiar);
	}

	@Test
	public void test03Excluir() {
		/*System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setCpf(null);
		copia.setRg(null);
		copia.setEndereco(null);
		copia.setDataDeNascimento(null);
		copia.setNomeEmpresa(null);
		usuarioService.excluir(id);
		usuario = usuarioService.carregar(id);
		assertEquals("testa exclusao", usuario, copia);*/
		
		System.out.println("excluir");
		copiar.setId(-1);
		copiar.setCnpj(null);
		copiar.setRazaoSocial(null);
		copiar.setConjunto(null);
		copiar.setHorarioDeFuncionamento(null);
		copiar.setTemperaturaDoArCondicionado(null);
		copiar.setHorarioDoArCondicionado(null);
		empresaService.excluir(id);
		empresa = empresaService.carregar(id);
		assertEquals("testa exclusao", empresa, copiar);
	}
	
	
}