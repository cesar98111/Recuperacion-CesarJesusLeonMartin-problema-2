package com.company;

import java.util.ArrayList;

public class Stack <T> {

    private final int POINTHEAD = 0;
    private ArrayList <T> lista = new ArrayList<T>();

    public void push (T elemento){

        lista.add(POINTHEAD, elemento);

    }

    public T pop (){

        return lista.remove(POINTHEAD);

    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < lista.size(); i++) {

            cadena += " | " + lista.get(i) + " |";

        }

        return cadena;
    }

}
