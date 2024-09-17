package mentorialoja.service;

import mentorialoja.model.Usuario;
import mentorialoja.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class implementacaoUserDetailsService implements UserDetailsService {

   private UsuarioRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario= userRepository.findUserByLogin(username);

        if(usuario==null){
            throw new UsernameNotFoundException("usuario não encontrado !");
        }
        return new User(usuario.getLogin(),usuario.getPassword(), usuario.getAuthorities());
    }
}
