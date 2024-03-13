package com.example.gerenciadorvendas.DTO;

import jakarta.validation.constraints.NotNull;

public record VendaRequest(
        @NotNull
        Integer valor,
        @NotNull
        String id_produto,
        String observacao,
        @NotNull
        String data,

        @NotNull
        String meio_pagamento,
        @NotNull
        String horario
) {
}
