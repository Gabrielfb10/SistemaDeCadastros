package com.example.cadastrodeninjas.Users;

import org.springframework.stereotype.Component;

@Component //Decorador para definir que o mapper é um componente.
public class UserMapper {
    public UserModel map(UserDTO userDto){
        UserModel userModel = new UserModel();
        userModel.setId(userDto.getId());
        userModel.setName(userDto.getName());
        userModel.setEmail(userDto.getEmail());
        userModel.setPhone(userDto.getPhone());
        userModel.setAge(userDto.getAge());
        userModel.setProjects(userDto.getProjects());

        return userModel;
    }

    public UserDTO map(UserModel userModel){
        UserDTO userDto = new UserDTO();
        userDto.setId(userModel.getId());
        userDto.setName(userModel.getName());
        userDto.setEmail(userModel.getEmail());
        userDto.setPhone(userModel.getPhone());
        userDto.setAge(userModel.getAge());
        userDto.setProjects(userModel.getProjects());

        return userDto;
    }
}
