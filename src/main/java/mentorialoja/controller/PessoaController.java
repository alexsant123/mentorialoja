package mentorialoja.controller;

import com.example.demo.ExceptionMentoriaJava;
import mentorialoja.model.PessoaFisica;
import mentorialoja.model.PessoaJuridica;
import mentorialoja.repository.PesssoaRepository;
import mentorialoja.service.PessoaUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @Autowired
    private PesssoaRepository pesssoaRepository;

    @Autowired
    private PessoaUserService pessoaUserService;

    /*end-point é microsservicos é um API*/
    @ResponseBody
    @PostMapping(value = "**/salvarPj")
    public ResponseEntity<PessoaJuridica> salvarPj(@RequestBody PessoaJuridica pessoaJuridica) throws ExceptionMentoriaJava {

        if (pessoaJuridica == null) {
            throw new ExceptionMentoriaJava("Pessoa juridica nao pode ser NULL ou vazio");
        }


        if (pessoaJuridica.getCnpj() == null || pessoaJuridica.getCnpj().trim().isEmpty() || pessoaJuridica.getInscEstadual() == null || pessoaJuridica.getInscEstadual().trim().isEmpty() || (pessoaJuridica.getInscMunicipal() != null && pessoaJuridica.getInscMunicipal().trim().isEmpty()) || pessoaJuridica.getNomeFantasia() == null || pessoaJuridica.getNomeFantasia().trim().isEmpty() || pessoaJuridica.getRazaoSocial() == null || pessoaJuridica.getRazaoSocial().trim().isEmpty() || (pessoaJuridica.getCategoria() != null && pessoaJuridica.getCategoria().trim().isEmpty())) {

            throw new IllegalArgumentException("Campos obrigatórios não podem ser vazios ou apenas espaços");
        }
            if (pessoaJuridica.getId() == null && pesssoaRepository.existeCnpjCadastrado(pessoaJuridica.getCnpj()) != null) {
                throw new ExceptionMentoriaJava("Já existe CNPJ cadastrado com o número: " + pessoaJuridica.getCnpj());
            }
            if (pessoaJuridica.getCnpj().isEmpty()) {
                throw new ExceptionMentoriaJava("nao pode ser vazio o cnpj" + pessoaJuridica.getCnpj());
            }

            pessoaJuridica = pessoaUserService.salvarPessoaJuridica(pessoaJuridica);

            return new ResponseEntity<PessoaJuridica>(pessoaJuridica, HttpStatus.OK);
        }


}
