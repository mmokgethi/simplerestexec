package com.bbd.modisa.rest;

import com.bbd.modisa.db.Results;
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

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/delete/{res}")
    public Response deleteStored(@PathParam("res") int res)
    {
        //
        return Response.ok(calcOperations.delAResource(res)).build();
    }


    @GET
    @Path("add")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getAdd()
    {
        return Response.ok(calcOperations.getAddition()).build();
    }
//####################################################################################
    //Simple POST, PUT, GET and DELETE for the Subtration
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/sub")
    public Response postMult(GetDigits param)
    {
        int diff = calcOperations.calcSub(param);
        return Response.ok(diff).build();
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("altsub/{num}")
    public Response putMult(@PathParam("num") int param)
    {
        return Response.ok(calcOperations.updateSub(param)).build();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/deletes/{res}")
    public Response deleteStoredSub(@PathParam("res") int res)
    {
        //
        return Response.ok(calcOperations.delsResource(res)).build();
    }


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/subtraction")
    public Response getSub()
    {
        return Response.ok(calcOperations.getSub()).build();
    }
    //####################################################################################
    //Simple POST, PUT, GET and DELETE for the Multiplication
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/mult")
    public Response pitMult(GetDigits param)
    {
        int product = calcOperations.mult(param);
        return Response.ok(product).build();
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/altmult/{num}")
    public Response altMult(@PathParam("num") int param)
    {
        return Response.ok(calcOperations.altMult(param)).build();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/deleted/{res}")
    public Response delDiv(@PathParam("res") int param)
    {
        return Response.ok(calcOperations.delDiv(param)).build();
    }

    @GET
    @Produces
    @Path("/getmult")
    public Response getMult()
    {
        return Response.ok(calcOperations.getMult()).build();
    }

    //#######################################################################################
    //Simple POST, PUT, GET and DELETE for the Division
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/division")
    public Response postDiv(GetDigits param)
    {
        int quotient = calcOperations.calcDiv(param);
        return Response.ok(quotient).build();
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/postd/{num}")
    public Response postDiv(@PathParam("num") int param)
    {
        return Response.ok(calcOperations.altDiv(param)).build();
    }

    @DELETE
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/deld/{num}")
    public Response delDivi(@PathParam("num") int param)
    {
        return Response.ok(calcOperations.delDiv(param)).build();
    }

    @GET
    @Produces
    @Path("/getDel")
    public Response getDel()
    {
        return Response.ok(calcOperations.getDiv()).build();
    }

}
