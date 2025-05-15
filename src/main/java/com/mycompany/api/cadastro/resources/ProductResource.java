/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api.cadastro.resources;

import com.mycompany.api.cadastro.Produto;
import com.mycompany.api.cadastro.resources.produtoDAO.ProdutoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.util.List;



    @Path("/products")

public class ProductResource {
    
    public ProdutoDAO produtoDAO;
    
    EntityManager entityManager;
    
    public ProductResource(){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("produtoPU");
    entityManager = factory.createEntityManager();
    produtoDAO = new ProdutoDAO(entityManager);
}
    
  
    @GET
    public List<Produto> listar(){
         
        return produtoDAO.findAll();
    } 

}

