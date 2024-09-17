package com.example.demo;

import mentorialoja.model.Acesso;
import mentorialoja.repository.AcessoRepository;
import mentorialoja.service.AcessoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = mentorialojaapp.class )
class MentorialojaApplicationTests {

	@Autowired
	private AcessoService acessoService;
	@Autowired
	private AcessoRepository acessoRepository;

	@Test
	void TestCadastraAcesso() {

		Acesso acesso=new Acesso();
		acesso.setDescricao("ROLE_DEV_ADMIN");
		acessoRepository.save(acesso);
	}

}
