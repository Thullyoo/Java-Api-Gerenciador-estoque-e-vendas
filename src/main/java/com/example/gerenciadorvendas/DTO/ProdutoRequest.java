package com.example.gerenciadorvendas.DTO;

import jakarta.validation.constraints.NotNull;

public record ProdutoRequest(
        @NotNull
        String nome,
        @NotNull
        Integer preco,
        @NotNull
        String cor,
        @NotNull
        Integer estoque

) {
}
