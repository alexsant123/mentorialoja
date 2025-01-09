package com.example.demo;

import junit.framework.TestCase;
import mentorialoja.controller.PessoaController;
import mentorialoja.model.PessoaJuridica;
import mentorialoja.service.PessoaUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;

import java.util.Calendar;

@Profile("test")
@SpringBootTest(classes = mentorialojaapp.class)
public class TestePessoaUsuario extends TestCase {


  @Autowired
  private PessoaController pessoaController;


  @Test
  public void testCadPessoaFisica() throws ExceptionMentoriaJava {


    PessoaJuridica pessoaJuridica = new PessoaJuridica();
    pessoaJuridica.setCnpj("" + Calendar.getInstance().getTimeInMillis());
    pessoaJuridica.setNome("YTJGH");
    pessoaJuridica.setEmail("lanRD5Y6TUYF@gmail.com");
    pessoaJuridica.setTelefone("YK");
    pessoaJuridica.setInscEstadual("JHGJGH");
    pessoaJuridica.setInscMunicipal("445JHJH153415");
    pessoaJuridica.setNomeFantasia("JHGGG");
    pessoaJuridica.setRazaoSocial("JHHYTG");

    pessoaController.salvarPj(pessoaJuridica);


  }


}
