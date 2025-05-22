package com.example.AulaTeste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AulaTeste.model.CompraModel;
import com.example.AulaTeste.service.CompraService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/compras")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("/criar")
    public ResponseEntity<?> criarCompra(@RequestBody CompraModel compraModel) {
            var compra = compraService.criarCompra(compraModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(compra);
    }

    @GetMapping("/todos")
    public ResponseEntity<List<CompraModel>> getAllCompras() {
        var compras = compraService.listarCompras();
        if (compras.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.ok(compras);
    }

}

