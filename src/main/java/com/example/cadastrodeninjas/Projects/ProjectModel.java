package com.example.cadastrodeninjas.Projects;

import com.example.cadastrodeninjas.Users.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_projects")
@NoArgsConstructor //Anotação do lombok que cria
@AllArgsConstructor //Anotação do lombok que cria um construtor com todos os argumentos
@Data //Anotação do lombok que cria todos os setters e getters
public class ProjectModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String customerName;

    private String category;

    private int difficulty;

    @ManyToMany(mappedBy = "projects") //Varios projetos poderão receber vários usuários. A tabela que se releciona com outra e não é referência deve receber o nome de onde vem a relação.
    private List<UserModel> users;

}
