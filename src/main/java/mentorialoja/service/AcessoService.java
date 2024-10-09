package mentorialoja.service;

import mentorialoja.model.Acesso;
import mentorialoja.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService {
    @Autowired
    private AcessoRepository acessoRepository;



    public Acesso save(Acesso acesso) {


        return acessoRepository.save(acesso);
    }


}
