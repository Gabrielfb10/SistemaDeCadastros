package com.example.cadastrodeninjas;


import jakarta.persistence.*;

@Entity //decorador que tranforma a classe em uma entidade para o banco de dados
@Table(name = "tb_user") //Decorador que permite renomear a tabela e adicionar algumas propriedades. Nesse caso, é descartável
public class UserModel {

    @Id //Faz com que o Id seja identificado e deixe de ser tratado como atributo comum da classe.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Permite adicionar uma estrategia de atribuição de valor. Nesse caso, será o autoincremento.
    private Long id;
    private String name;
    private String email;
    private int age;
    private String role;

    public UserModel(){

    }

    public UserModel(String name, String email, int age, String role){
        this.name = name;
        this.email = email;
        this.age = age;
        this.role = role;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getAge(){
        return age;
    }

    public void setIdade(int age){
        this.age = age;
    }

    public String getRole(){
        return role;
    }

    public void setRole(String role){
        this.role = role;
    }
}
