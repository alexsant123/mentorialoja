package com.example.demo;

import junit.framework.TestCase;
import mentorialoja.service.PessoaUserDetailsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

@Profile("test")
@SpringBootTest(classes=mentorialojaapp.class)
public class TestePessoaUsuario extends TestCase{

  private PessoaUserDetailsService pessoaUserDetailsService;
}
