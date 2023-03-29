package com.ingeneo.practica.prueba.services;
import com.ingeneo.practica.prueba.models.*;
import com.ingeneo.practica.prueba.repositories.*;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService{
    @Autowired
    ClienteRepository clienteRepository;
    
    public ClienteService() {
    }
    
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
    public Optional<Cliente> findById(String id) {
        return clienteRepository.findById(id);
    }
    
    public Cliente save(Cliente std) {
        return clienteRepository.save(std);
    }
    
    public void deleteById(String id) {
        clienteRepository.deleteById(id);
    }
}
  