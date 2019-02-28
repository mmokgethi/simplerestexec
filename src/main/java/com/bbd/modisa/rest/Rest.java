package com.bbd.modisa.rest;

import com.bbd.modisa.model.GetDigits;
import com.bbd.modisa.services.Calculate;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/home")
public class Rest {
    private Calculate calcOperations = new Calculate();

    //Simple POST, PUT, GET and DELETE for the addition
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/adds")
    public Response calcAdd(GetDigits param)
    {
        int sum = calcOperations.calcAddition(param);
        return Response.ok(sum).build();
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/alter/{num}")
    public Response alterAdd(@PathParam("num") int a)
    {
        return Response.ok(calcOperations.updateAddition(a)).build();
    }

    @GET
    @Path("add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAdd()
    {
        return Response.ok(calcOperations.getAddition()).build();
    }
}
