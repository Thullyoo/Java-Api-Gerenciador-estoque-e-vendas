package com.example.gerenciadorvendas.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity(name = "vendas")
@Table(name = "vendas")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer valor;
    String id_produto;
    String observacao;
    String data;
    String meio_pagamento;
    String horario;
}

