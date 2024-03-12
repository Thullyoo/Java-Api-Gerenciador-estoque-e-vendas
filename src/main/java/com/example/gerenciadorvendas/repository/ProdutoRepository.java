package com.example.gerenciadorvendas.repository;

import com.example.gerenciadorvendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
