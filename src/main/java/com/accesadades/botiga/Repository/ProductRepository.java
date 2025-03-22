package com.accesadades.botiga.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.Set;
import com.accesadades.botiga.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    @NonNull
    Set<Product> findAll();
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
}
