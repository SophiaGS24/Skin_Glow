package com.example.AulaTeste.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class CompraModel {

@Id
@GeneratedValue(generator = "UUID")
    private UUID id;

   @Column (name = "Quantidade")
    public int Quantidade;
    @Column (name = "Endereco")
    public String Endereco;
    @Column (name = "Codigo_de_barra")
    public String Codigo_de_barra;
    @Column (name = "Preco")
    public float Preco;
    @Column (name = "Nome_do_Produto")
    public String Produto;

@CreationTimestamp
    private LocalDateTime createdAt;

    public CompraModel() {}

    public CompraModel (int Quantidade, String Endereco , String Codigo_de_barra , float Preco , String Produto) {
        this.Quantidade = Quantidade;
        this.Endereco = Endereco;
        this.Codigo_de_barra = Codigo_de_barra;
        this.Preco = Preco;
        this.Produto = Produto;
}
 }
    