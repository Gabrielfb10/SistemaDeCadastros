package com.example.cadastrodeninjas.Users;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/boasVindas") //Decorador que cria o endpoint
    public String boasVindas(){
        return "Essa é a mensagem de boas vindas.";
    }

    //Criar usuario (CREATE)
    @PostMapping("/create")
    public UserModel userCreate(@RequestBody UserModel user){
        return userService.userCreate(user);
    }

    //Buscar usuario (READ)
    @GetMapping("/{id}")
    public UserModel userSearch(@PathVariable Long id){ //Decorador usado para usar variaveis recebidas pela url
        return userService.userSearch(id);
    }

    //Mostrar todos os usuario (READ)
    @GetMapping("/all")
    public List<UserModel> allUserSearch(){
        return userService.allUserSearch();
    }

    //Atualizar usuario (UPDATE)
    @PutMapping("/update/{id}")
    public String userUpdate(){
        return "Usuário alterado com sucesso";
    }

    //Deletar usuario (DELETE)
    @DeleteMapping("/delete/{id}")
    public String userDelete(){
        return "Usuário deletado com sucesso";
    }
}
