package com.company;

public class Gasto {

    private String concepto;
    private int gasto;

    public Gasto (String concepto, int gasto){

        this.concepto = concepto;
        this.gasto = gasto;

    }

    @Override
    public String toString() {
        return "Gasto{" +
                "concepto='" + concepto + '\'' +
                ", gasto=" + gasto +
                '}';
    }
}
