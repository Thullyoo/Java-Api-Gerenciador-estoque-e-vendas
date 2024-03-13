package com.example.gerenciadorvendas.services;

import com.example.gerenciadorvendas.DTO.ProdutoRequest;
import com.example.gerenciadorvendas.model.Produto;
import com.example.gerenciadorvendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


    public void adicionarProduto(ProdutoRequest produto){
        Produto novoProduto = new Produto(produto);
        repository.save(novoProduto);
    }

    public List<Produto> verProdutos(){
        List<Produto> produtos = repository.findAll();
        return produtos;
    }

}
