package com.iticbcn.mywebapp.libresapp.Serveis;

import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iticbcn.mywebapp.libresapp.Model.Llibre;
import com.iticbcn.mywebapp.libresapp.Repositori.RepoLlibre;

@Service
public class ServeiLlibreImpl implements ServeiLlibre {
    
    @Autowired
    private RepoLlibre repoLlibre;

    @Override
    public Set<Llibre> findAll() {
        return repoLlibre.findAll();
    }

    @Override
    public Optional<Llibre> findByTitol(String titol) {
        return repoLlibre.findByTitol(titol);
    }

    @Override
    public Set<Llibre> findByTitolAndEditorial(String titol, String editorial) {
        return repoLlibre.findByTitolAndEditorial(titol, editorial);
    }

    public Optional<Llibre> findByIdLlibre(int idLlibre) {
        return repoLlibre.findById(idLlibre);
    }

    @Override
    public boolean validarISBN(String isbn) {
        // TODO: Implementar logica ISBN
        return false;
    }

    

}
