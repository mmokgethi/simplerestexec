package com.bbd.modisa.services;

import com.bbd.modisa.db.Results;
import com.bbd.modisa.model.GetDigits;
import sun.misc.Request;

import java.util.Random;

//Creating and Updating every operation
public class Calculate {
    //Create, update and get Addition
    public int  calcAddition(GetDigits param)
    {
        Results.results = param.getA() + param.getB();
        return Results.results;
    }

    public int updateAddition(int x) {
        Random random = new Random();

        return Results.results += random.nextInt(x);
    }

    public String getAddition()
    {
        return ("Our Addition = " + Results.results);
    }


    //Create and update Subtraction
    public int calcSub(GetDigits param)
    {
        if (param.getA() > param.getB())
        {
            Results.results = param.getA() - param.getB();
            return Results.results;
        }
        else
            return -404;
    }

    public int  updateSub(int x)
    {
        Random random = new Random();

        return Results.results += random.nextInt(x);
    }

    public int calcDiv(GetDigits param)
    {
        if (param.getA() != 0 && param.getB() != 0)
        {
            Results.results = param.getA() / param.getB();
            return Results.results;
        }
        else
            return 404;
    }

    public int mult(GetDigits param)
    {
        Results.results = param.getA() * param.getB();
        return Results.results;
    }

}

