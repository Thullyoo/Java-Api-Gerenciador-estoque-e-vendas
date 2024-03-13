package com.example.gerenciadorvendas.controllers;

import com.example.gerenciadorvendas.DTO.VendaRequest;
import com.example.gerenciadorvendas.model.Venda;
import com.example.gerenciadorvendas.repository.VendaRepository;
import com.example.gerenciadorvendas.services.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @GetMapping
    @Transactional
    public ResponseEntity verVendas() throws Exception{
        try{
            List<Venda> vendas = vendaService.verVendas();
            return ResponseEntity.ok(vendas);
        } catch (RuntimeException exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Não foi possível trazer os dados de venda");
        }
    }

    @PostMapping
    @Transactional
    public ResponseEntity adicionarVenda(@RequestBody @Valid VendaRequest request) throws Exception{
        try {
            vendaService.adicionarVenda(request);
            return ResponseEntity.ok("Venda adicionada");
        }catch (RuntimeException exception){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Erro ao adicionar a venda");
        }
    }

}
