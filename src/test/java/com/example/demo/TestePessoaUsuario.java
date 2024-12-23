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
    pessoaJuridica.setNome("Alex fernando");
    pessoaJuridica.setEmail("testesalvarpj@gmail.com");
    pessoaJuridica.setTelefone("45999795800");
    pessoaJuridica.setInscEstadual("65556565656665");
    pessoaJuridica.setInscMunicipal("55554565656565");
    pessoaJuridica.setNomeFantasia("54556565665");
    pessoaJuridica.setRazaoSocial("4656656566");


    pessoaController.salvarPj(pessoaJuridica);


  }


}
