package com.clientui.proxies;

import com.clientui.beans.ProductBean;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "microservice-produits", url = "localhost:9001")

public interface MicroserviceProduitsProxy {

//  ProductController.java : Récupérer les memes signatures des méthodes
//  Affiche la liste de tous les produits disponibles : 
//  @GetMapping(value = "/Produits")
//  public List<Product> listeDesProduits()
	
    @GetMapping(value = "/Produits")
    List<ProductBean> listeDesProduits();
    
//  Notez ici la notation @PathVariable("id") qui est différente de celle qu'on utlise dans le contrôleur
//  ProductController.java : Récupérer les memes signatures des méthodes
//  @GetMapping( value = "/Produits/{id}")
//  public Optional<Product> recupererUnProduit(@PathVariable int id)
    
    @GetMapping( value = "/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);
    }
