package mentorialoja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import   mentorialoja.model.Usuario;
import   mentorialoja.repository.UsuarioRepository;

import java.util.Arrays;


@Service
public class ImplementacaoUserDetailsService implements UserDetailsService {


    @Autowired
    private UsuarioRepository usuarioRepository;




        @Override
        public UserDetails loadUserByUsername (String username) throws UsernameNotFoundException {


            Usuario usuario = usuarioRepository.findUserByLogin(username);/* Recebe o login pra consulta */


            if (usuario == null) {
                throw new UsernameNotFoundException("Usuário não foi encontrado");
            }


            return new User(usuario.getLogin(), usuario.getPassword(), usuario.getAuthorities());
        }


    }

