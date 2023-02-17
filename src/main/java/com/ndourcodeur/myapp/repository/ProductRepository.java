package com.ndourcodeur.myapp.repository;

import com.ndourcodeur.myapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findProductByCategoryName(String categoryName);
    Product findProductByName(String name);
    boolean existsProductByName(String name);
}
