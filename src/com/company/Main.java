package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        LibroDeCuentas libro = new LibroDeCuentas();

        while (opcion != 4) {
            System.out.println(" 1. añadir ");
            System.out.println(" 2. calcular ");
            System.out.println(" 3. lista ");
            System.out.println(" 4. salir");


            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    String concepto;
                    int gasto;

                    System.out.println("introduce el nombre del trabajo");

                    concepto = sc.nextLine();

                    System.out.println("introduce el tamaño");

                    gasto = sc.nextInt();

                    libro.añadirGasto(new Gasto(concepto, gasto));

                    break;
                case 2:

                    libro.lista();

                    break;
                case 3:

                    System.out.println("el gasto es: " + libro.calcularGasto());

                    break;


            }
        }
    }
}
