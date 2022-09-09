package br.edu.universidadedevassouras.SCP.service;

import br.edu.universidadedevassouras.SCP.Repository.PessoaDAO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("admin","$2a$12$6flQYX2ArQdVNHC5X33ze.kfYzh3LqhTO/9QATg7fzXLFiwsWNKFu", new ArrayList<>());
    }
}
