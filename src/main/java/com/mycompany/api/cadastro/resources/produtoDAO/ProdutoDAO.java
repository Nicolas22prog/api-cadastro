/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api.cadastro.resources.produtoDAO;

import com.mycompany.api.cadastro.Produto;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;


public class ProdutoDAO {
    
     public EntityManager entityManager;
    
    public ProdutoDAO(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    public Produto findById( Long id) {
        return entityManager.find(Produto.class, id);
    }
    public List<Produto> findAll(){
        return entityManager.createQuery("SELECT p FROM produtos p",Produto.class).getResultList();
    }
    
    public void save (Produto produto) {
         entityManager.persist(produto);
    }
    
    
    @Resource(lookup ="jdbc/produtos")
    private DataSource dataSource;
    
    public void conexao(){
        try (Connection conn = dataSource.getConnection()) {
            
        }catch (SQLException e ){
            e.printStackTrace();
        }
    }
}

