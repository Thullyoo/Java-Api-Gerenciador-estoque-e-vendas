package com.example.gerenciadorvendas.model;

import com.example.gerenciadorvendas.DTO.ProdutoEditRequest;
import com.example.gerenciadorvendas.DTO.ProdutoRequest;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "produtos")
@Entity(name = "produtos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String nome;
    Integer preco;
    String cor;
    Integer estoque;

    public Produto(ProdutoRequest produtoRequest){
        this.nome = produtoRequest.nome();
        this.cor = produtoRequest.cor();
        this.estoque = produtoRequest.estoque();
        this.preco = produtoRequest.preco();
    }

    public Produto(ProdutoEditRequest produtoEditRequest){
        this.preco = produtoEditRequest.preco();
        this.estoque = produtoEditRequest.estoque();
        this.cor = produtoEditRequest.cor();
        this.nome = produtoEditRequest.nome();
    }

}
