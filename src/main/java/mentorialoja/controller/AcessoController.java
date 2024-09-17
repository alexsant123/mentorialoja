package mentorialoja.controller;

import mentorialoja.model.Acesso;
import mentorialoja.repository.AcessoRepository;
import mentorialoja.service.AcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


    @Controller
    @RestController
    public class AcessoController {

        @Autowired
        private AcessoService acessoService;

        @Autowired
        private AcessoRepository acessoRepository;

        @ResponseBody /*Poder dar um retorno da API*/
        @PostMapping("mentorialoja/salvarAcesso") /*Mapeando a url para receber JSON*/
        public ResponseEntity<Acesso> salvarAcesso(@RequestBody Acesso acesso) {

            Acesso acessoSalvo = acessoService.save(acesso);

            return new ResponseEntity<Acesso>(acessoSalvo, HttpStatus.OK);
        }


    }