package com.example.gerenciadorvendas.controllers;

import com.example.gerenciadorvendas.DTO.ProdutoRequest;
import com.example.gerenciadorvendas.model.Produto;
import com.example.gerenciadorvendas.services.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    @Transactional
    public ResponseEntity adicionarProduto(@RequestBody @Valid ProdutoRequest request) throws Exception{
        try {
            produtoService.adicionarProduto(request);
            return ResponseEntity.ok("Produto adicionado");
        }catch (Exception exception){
                return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao adicionar produto");
        }


    }

    @GetMapping
    @Transactional
    public ResponseEntity verProdutos() throws Exception{
        try {
            List<Produto> produtos = produtoService.verProdutos();
            return ResponseEntity.ok(produtos);
        } catch (Exception exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao ver todos os produtos");
        }
    }

}
