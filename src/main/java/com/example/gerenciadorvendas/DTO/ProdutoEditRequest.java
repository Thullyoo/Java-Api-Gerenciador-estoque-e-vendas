package com.example.gerenciadorvendas.DTO;

import jakarta.validation.constraints.NotNull;

public record ProdutoEditRequest(

        @NotNull
        String id,

        String nome,

        Integer preco,

        String cor,

        Integer estoque

) {
}
