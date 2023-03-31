package com.br.furtuna.testemkdata.service;

import com.br.furtuna.testemkdata.model.Cliente;
import com.br.furtuna.testemkdata.repositorio.ClienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    

    @Autowired
    ClienteRepositorio clienteRepositorio;

    public void salvarCliente (Cliente cliente){

        clienteRepositorio.save(cliente);

    }

    
}
