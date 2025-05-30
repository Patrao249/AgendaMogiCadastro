package com.agendamogi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contato {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
}