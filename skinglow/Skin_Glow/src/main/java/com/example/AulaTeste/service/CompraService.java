package com.example.AulaTeste.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AulaTeste.model.CompraModel;
import com.example.AulaTeste.repository.ICompraRepository;

@Service
public class CompraService {
    @Autowired
    private ICompraRepository compraRepository;

    public CompraModel criarCompra(CompraModel compraModel) {
        return compraRepository.save(compraModel);
    }

     public List<CompraModel> listarCompras() {
        return compraRepository.findAll();
    }

}