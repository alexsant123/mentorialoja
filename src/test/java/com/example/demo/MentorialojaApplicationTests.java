package com.example.demo;

import mentorialoja.controller.AcessoController;
import mentorialoja.model.Acesso;
import mentorialoja.repository.AcessoRepository;
import mentorialoja.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.DefaultMockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest(classes = mentorialojaapp.class )
class MentorialojaApplicationTests {

	@Autowired
	private AcessoService acessoService;

	@Autowired
	private AcessoController acessoController;

	@Autowired
	private AcessoRepository acessoRepository;

	@Autowired
	private WebApplicationContext wac;


	@Test
	public void testRestApiCadastroAcesso(){
		DefaultMockMvcBuilder builder= MockMvcBuilders.webAppContextSetup(this.wac);


	}




	@Test
	void TestCadastraAcesso() {

		Acesso acesso=new Acesso();
		acesso.setDescricao("ROLE_DEV_ADMIN");
		acessoRepository.save(acesso);
	}

}
