package com.iticbcn.mywebapp.libresapp.Repositori;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import com.iticbcn.mywebapp.libresapp.Model.Llibre;

public interface RepoLlibre extends CrudRepository<Llibre, Integer> {
    
    @NonNull
    @Override
    Set<Llibre> findAll();
    Optional<Llibre> findByTitol(String titol);
    Set<Llibre> findByTitolAndEditorial(String titol, String editorial);
}
