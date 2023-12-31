package br.com.ApiGerenciador.todoList.task;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tasks")
public class TaskModel {


    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String descricao;
    @Column(length = 50)
    private String title;
    private LocalDateTime startAt;

    private LocalDateTime endAt;
    private String prioridade;

    @CreationTimestamp
    private LocalDateTime createdAt;

    private UUID IdUser;


}
