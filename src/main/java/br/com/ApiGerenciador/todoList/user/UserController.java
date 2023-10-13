package br.com.ApiGerenciador.todoList.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/creat")
    public void creat (@RequestBody UserModel userModel){
        System.out.println(userModel.name);

    }




}
