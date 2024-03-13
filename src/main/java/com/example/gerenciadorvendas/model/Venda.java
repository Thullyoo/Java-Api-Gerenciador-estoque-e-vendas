package com.example.gerenciadorvendas.model;

import com.example.gerenciadorvendas.DTO.VendaRequest;
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
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Integer valor;
    private String id_produto;
    private String observacao;
    private String data;
    private String meio_pagamento;
    private String horario;

    public Venda(VendaRequest request){
        this.data = request.data();
        this.horario = request.horario();
        this.id_produto = request.id_produto();
        this.observacao = request.observacao();
        this.meio_pagamento = request.meio_pagamento();
        this.valor = request.valor();
    }
}

