package com.company;

public class LibroDeCuentas {

    private Stack<Gasto> libro = new Stack<Gasto>();

    public void añadirGasto(Gasto gasto){

        libro.push(gasto);

    }
    public void lista(){

        System.out.println(libro);

    }
    public int calcularGasto(){

        int cuenta=0;

        for (int i = 0; i < libro.getSize(); i++) {

            Gasto gasto = libro.pop();
            cuenta += gasto.getGasto();

        }

        return cuenta;

    }


}
