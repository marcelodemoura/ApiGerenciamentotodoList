package br.com.ApiGerenciador.todoList.repository;

import br.com.ApiGerenciador.todoList.user.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IUserRepository extends JpaRepository <UserModel, UUID>{
    UserModel findByUsername(String username);
}
