package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTO;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;

@Path("/megafarma") //endpoint megafarma
public class RemedioResource {
    private RemedioBO remedioBO = new RemedioBO();

    //Adicionando anotações
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        ArrayList<RemedioTO> resultado = remedioBO.findAll();

        Response.ResponseBuilder response = null;
        if (response != null) {
            response = Response.ok(); //Código Status 200 - ok
        } else {
            response = Response.status(404); //Código 404 - Not Found
        }

        response.entity(resultado);
        return response.build();
    }
}
