package com.bbd.modisa.services;

import com.bbd.modisa.db.Results;
import com.bbd.modisa.model.GetDigits;


import java.util.Random;

//Creating and Updating every operation
public class Calculate {
    //Create, update, delete and get Addition
    public int  calcAddition(GetDigits param)
    {
        Results.results = param.getA() + param.getB();
        return Results.results;
    }

    public int updateAddition(int x) {
        int a = 6;

        return Results.results += a;
    }

    public String getAddition()
    {
        return ("Our Addition = " + Results.results);
    }

    public String delAResource(int results)
    {
        Results.results -= results;
        return ("Addition Resource is now: " + results);
    }

    //##################################################################################################
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
        int a = 6;

        return Results.results -= a;
    }

    public String getSub()
    {
        return ("Our Subtraction Results = " + Results.results);
    }

    public String delsResource(int results)
    {
        Results.results -= results;
        return ("Addition Resource is now: " + results);
    }
    //######################################################################################
    //Create, Update, Delete and get Multiplication
    public int mult(GetDigits param)
    {
        Results.results = param.getA() * param.getB();
        return Results.results;
    }

    public int altMult(int x)
    {
        int a = 6;

        return Results.results *= a;
    }

    public String delMult(int results)
    {
        Results.results -= results;
        return ("Multiplication Resource is now = " + results);
    }

    public String getMult()
    {
        return  ("Our Multiplication Results = " + Results.results);
    }

    //#########################################################################################
    //Create, Update, Delete and get Division
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

    public int altDiv(int x)
    {
        int a = 2;
        return Results.results /= 2;
    }

    public String delDiv(int results)
    {
        Results.results -= results;
        return ("Multiplication Resource is now = " + results);
    }

    public String getDiv()
    {
        return ("Our Divition Results = " + Results.results);
    }




}

