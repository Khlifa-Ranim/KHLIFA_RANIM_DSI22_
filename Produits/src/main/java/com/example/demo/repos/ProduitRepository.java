package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.enties.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
