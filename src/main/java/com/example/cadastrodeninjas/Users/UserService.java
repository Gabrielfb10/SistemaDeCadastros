package com.example.cadastrodeninjas.Users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Declara que é uma camda de serviõ
public class UserService {

    private UserRepository userRepository; //Cria uma instância do repository
    public UserService(UserRepository userRepository){ //Inicializa o repository dentro do service, o que permite usar o Jpa do Repository.
        this.userRepository = userRepository;
    }

    public List<UserModel> allUserSearch(){
        return userRepository.findAll();
    }

    public UserModel userSearch(Long id){
        Optional<UserModel> user = userRepository.findById(id); //O optional é usado quando existe há chance do elemento não existir
        return user.orElse(null); //o metodo orElse é usado quando há chance do elemento não existir
    }

    public UserModel userCreate(UserModel user){
        return userRepository.save(user);
    }
}
