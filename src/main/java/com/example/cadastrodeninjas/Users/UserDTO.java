package com.example.cadastrodeninjas.Users;

import com.example.cadastrodeninjas.Projects.ProjectModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor //Anotação do lombok que cria
@AllArgsConstructor //Anotação do lombok que cria um construtor com todos os argumentos
@Data //Anotação do lombok que cria todos os setters e getters
public class UserDTO {
//DTO (Data Transfer Object) é mais uma camada entre o Entity (ligado diretamente ao DB) e o usuário. o DTO não possui ligação com
//DB, possui apenas o nomes dos campos que o Entity possui, isso permite trabalhar com as informações sem expor o banco de dados. Mas
//para que os atributos do DTO se relacionem com os dados do banco, é preciso mapear as informações através do Mapper.
    private Long id;
    private String name;
    private String email;
    private String phone;
    private int age;
    private String role;
    private List<ProjectModel> projects;
}


