package com.example.gerenciadorvendas.services;

import com.example.gerenciadorvendas.DTO.VendaRequest;
import com.example.gerenciadorvendas.model.Venda;
import com.example.gerenciadorvendas.repository.VendaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public List<Venda> verVendas(){
        List<Venda> vendas = repository.findAll();
        return vendas;
    }
    public ResponseEntity adicionarVenda(@RequestBody @Valid VendaRequest request){
        Venda novaVenda = new Venda(request);
        repository.save(novaVenda);
        return ResponseEntity.ok().build();
    }

}
