package com.br.furtuna.testemkdata.repositorio;

import com.br.furtuna.testemkdata.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
    
}

