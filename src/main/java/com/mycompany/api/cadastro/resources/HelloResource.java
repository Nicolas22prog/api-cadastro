/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api.cadastro;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/products")
public class HelloResource {
    
    @GET
    public String sayHello() {
        return "Hello World";
    }
}
