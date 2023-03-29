package com.ingeneo.practica.prueba.services;
import com.ingeneo.practica.prueba.models.*;
import com.ingeneo.practica.prueba.repositories.*;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EnvioTerrestreService{
    @Autowired
    EnvioTerrestreRepository envioTerrestreRepository;
    
    public EnvioTerrestreService() {}
    
    public List<EnvioTerrestre> getAllEnvioTerrestres() {
        return envioTerrestreRepository.findAll();
    }
    
    public Optional<EnvioTerrestre> findById(Long id) {
        return envioTerrestreRepository.findById(id);
    }
    
    public EnvioTerrestre save(EnvioTerrestre std) {
        return envioTerrestreRepository.save(std);
    }
    
    public void deleteById(Long id) {
        envioTerrestreRepository.deleteById(id);
    }
}