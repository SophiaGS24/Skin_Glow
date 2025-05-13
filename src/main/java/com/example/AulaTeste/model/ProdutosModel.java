package com.example.AulaTeste.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "ProdutosModel")

public class ProdutosModel {

    @Id
@GeneratedValue(generator = "UUID")
    private UUID id;
    
    @Column(name = "Nome_do_produto")
    public String nome;

    @Column(name = "Descricao_do_produto")
    public String descricao;
    
    @Column(name = "Codigo_de_barra", unique = true)
    public String codigo_de_barra;

    @Column(name = "Preco")
    public float preco;

    @Column(name = "Tipo_de_produto")
    public String tipo;

    @CreationTimestamp
    private LocalDateTime createdAt;

    public ProdutosModel() {}

    public ProdutosModel (String nome, String descricao , String codigo_de_barra , float preco , String tipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.codigo_de_barra = codigo_de_barra;
        this.preco = preco;
        this.tipo = tipo;

}
 }