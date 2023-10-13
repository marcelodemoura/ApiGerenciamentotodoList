package br.com.ApiGerenciador.todoList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gerenciador")
public class GerenciadorController {

    @GetMapping("/")
    public String GerenciadorController(){
        return "Funcionou";
    }

}
