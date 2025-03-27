package com.iticbcn.mywebapp.libresapp.Serveis;

import java.util.Optional;
import java.util.Set;

import com.iticbcn.mywebapp.libresapp.Model.Llibre;

public interface ServeiLlibre {
    
    Set<Llibre> findAll();
    Optional<Llibre> findByTitol(String titol);
    Set<Llibre> findByTitolAndEditorial(String titol, String editorial);
    Optional<Llibre> findByIdLlibre(int idLlibre);
    boolean validarISBN(String isbn);
}
