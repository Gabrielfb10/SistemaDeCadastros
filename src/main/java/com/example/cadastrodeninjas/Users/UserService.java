package com.example.cadastrodeninjas.Users;

import org.springframework.stereotype.Service;

import java.util.List;

@Service //Declara que é uma camda de serviõ
public class UserService {

    private UserRepository userRepository; //Cria uma instância do repository
    public UserService(UserRepository userRepository){ //Inicializa o repository dentro do service, o que permite usar o Jpa do Repository.
        this.userRepository = userRepository;
    }

    public List<UserModel> allUserSearch(){
        return userRepository.findAll();
    }
}
