package com.example.cadastrodeninjas.Users;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service //Declara que é uma camda de serviõ
public class UserService {

    private UserRepository userRepository; //Cria uma instância do repository
    private UserMapper userMapper; // Cria uma instância do mapper
    public UserService(UserRepository userRepository, UserMapper userMapper){ //Inicializa o repository e o mapper dentro do service, o que permite usar o Jpa do Repository e a conversão de Entity para DTO do mapper.
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public List<UserDTO> allUserSearch(){
        List<UserModel> users = userRepository.findAll();

        return users.stream() // Stream<UserModel>
            .map(userMapper::map) // Stream<UserDTO>
            .collect(Collectors.toList());
    }

    public UserDTO userSearch(Long id){
        Optional<UserModel> user = userRepository.findById(id);//O optional é usado quando existe há chance do elemento não existir
        return user.map(userMapper::map).orElse(null); //o metodo orElse é usado quando há chance do elemento não existir
    }

    public UserDTO userCreate(UserDTO userDTO){ //Recebe o usuário como DTO
        UserModel user = userMapper.map(userDTO); //Converte o DTO para Entity
        UserModel userSaved = userRepository.save(user); //Salva o usuário Entity no banco de dados e retorna a Entity salva com o id.
        return userMapper.map(userSaved); //Devolve para o usuário os dados em DTO novamente. O mapper converte de Entity para DTO.
    }

    public void userDelete(Long id){
        userRepository.deleteById(id);
    }

    public UserDTO userUpdate(Long id, UserDTO userUpdated){
        if(!userRepository.existsById(id)){
            return null;
        }

        UserModel user = userMapper.map(userUpdated);
        user.setId(id);
        UserModel userResponse = userRepository.save(user);
        return userMapper.map(userResponse);
    }
}
