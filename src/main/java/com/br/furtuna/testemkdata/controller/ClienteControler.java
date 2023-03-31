package com.br.furtuna.testemkdata.controller;

import com.br.furtuna.testemkdata.model.Cliente;
import com.br.furtuna.testemkdata.service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteControler {

    @Autowired
    ClienteService clienteService;


    @PostMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){

        try {
            return new ResponseEntity<>(cliente, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
      
    }
    
}
