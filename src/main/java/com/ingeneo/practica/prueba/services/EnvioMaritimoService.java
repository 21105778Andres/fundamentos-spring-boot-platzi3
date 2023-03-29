package com.ingeneo.practica.prueba.services;
import com.ingeneo.practica.prueba.models.*;
import com.ingeneo.practica.prueba.repositories.*;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnvioMaritimoService{
    @Autowired
    EnvioMaritimoRepository envioMaritimoRepository;
    
    public EnvioMaritimoService() {}
    
    public List<EnvioMaritimo> getAllEnvioMaritimos() {
        return envioMaritimoRepository.findAll();
    }
    
    public Optional<EnvioMaritimo> findById(Long id) {
        return envioMaritimoRepository.findById(id);
    }
    
    public EnvioMaritimo save(EnvioMaritimo std) {
        return envioMaritimoRepository.save(std);
    }
    
    public void deleteById(Long id) {
        envioMaritimoRepository.deleteById(id);
    }
}