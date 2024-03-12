package com.example.gerenciadorvendas.repository;

import com.example.gerenciadorvendas.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Integer> {
}
