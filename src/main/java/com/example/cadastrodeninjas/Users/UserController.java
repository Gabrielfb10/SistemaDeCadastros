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
    public UserDTO userCreate(@RequestBody UserDTO userDTO){
        return userService.userCreate(userDTO);
    }

    //Buscar usuario (READ)
    @GetMapping("/{id}")
    public UserDTO userSearch(@PathVariable Long id){ //Decorador usado para usar variaveis recebidas pela url
        return userService.userSearch(id);
    }

    //Mostrar todos os usuario (READ)
    @GetMapping("/all")
    public List<UserDTO> allUserSearch(){
        return userService.allUserSearch();
    }

    //Atualizar usuario (UPDATE)
    @PutMapping("/update/{id}")
    public UserDTO userUpdate(@PathVariable Long id, @RequestBody UserDTO userUpdated){
        return userService.userUpdate(id, userUpdated);
    }

    //Deletar usuario (DELETE)
    @DeleteMapping("/delete/{id}")
    public String userDelete(@PathVariable Long id){
        userService.userDelete(id);
        return "Usuário deletado com sucesso";
    }


}
