package com.example.gerenciadorvendas.model;

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
    Integer preco;
    String cor;
    Integer estoque;
}
