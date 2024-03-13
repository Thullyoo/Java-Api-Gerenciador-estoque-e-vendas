CREATE TABLE vendas(
    id TEXT PRIMARY KEY NOT NULL,
    valor INT NOT NULL,
    id_produto TEXT REFERENCES produtos(id) NOT NULL,
    data TEXT NOT NULL,
    horario TEXT NOT NULL,
    meio_pagamento TEXT NOT NULL,
    observacao TEXT
);