package com.example.demo;

import junit.framework.TestCase;
import mentorialoja.service.PessoaUserService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest(classes=mentorialojaapp.class)
public class TestePessoaUsuario extends TestCase{

  private PessoaUserService pessoaUserService;
}
