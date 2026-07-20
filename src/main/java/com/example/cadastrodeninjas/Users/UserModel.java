package com.example.cadastrodeninjas.Users;


import com.example.cadastrodeninjas.Projects.ProjectModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity //decorador que tranforma a classe em uma entidade para o banco de dados
@Table(name = "tb_user") //Decorador que permite renomear a tabela e adicionar algumas propriedades. Nesse caso, é descartável
@NoArgsConstructor //Anotação do lombok que cria
@AllArgsConstructor //Anotação do lombok que cria um construtor com todos os argumentos
@Data //Anotação do lombok que cria todos os setters e getters
public class UserModel {

    @Id //Faz com que o Id seja identificado e deixe de ser tratado como atributo comum da classe.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Permite adicionar uma estrategia de atribuição de valor. Nesse caso, será o autoincremento.
    private Long id;
    private String name;
    private String email;
    private int age;
    private String role;

    @ManyToMany //Vários usuários podem ter vários projetos
    @JoinTable(//O model que vai ser a referencia na relação entre tabelas deve receber algum tipo de join
            name = "user_project",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<ProjectModel> projects;
}
