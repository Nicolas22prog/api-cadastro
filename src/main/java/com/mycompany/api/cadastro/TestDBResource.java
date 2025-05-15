package com.mycompany.api.cadastro;

import jakarta.annotation.Resource;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

@Path("/testdb")
public class TestDBResource {

    @Resource(lookup = "jdbc/products2")
    private DataSource dataSource;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response testaConexao() {
    return Response.ok("Funcionando!").build();
}

}
