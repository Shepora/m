package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String [] Codigos_Snacks = {"1","2","3","4","5"};
        String [] Productos_Papus = {"Chocopapu","Merequetenge","Maisito","Papulex","bababuy"};

        int [] Precios_Papus = {150, 125, 90, 200, 180};

        int total = 0;
        int Productos_Papulines_Comprados = 0;

        boolean PapuVenta = true;

        System.out.println("Maquina Expendedora De La Papuoficina");

        System.out.println("Catalogo De Los Papusproductos");

        System.out.printf("Codigo","PapuProducto","Valor ($)");

        for(int i = 0; i < Codigos_Snacks.length; i++){
            System.out.printf(Codigos_Snacks[i], Productos_Papus[i], Precios_Papus[i]);
        }

        while (Productos_Papulines_Comprados < 5 && PapuVenta){
            System.out.print("Ingrese el codigo papu o selecciones 'Fin Papu' para terminar :");

            String Entrada = teclado.next();

            if (Entrada.equalsIgnoreCase("Fin Papu")){
                PapuVenta = false;
                continue;
            }

            boolean CodigoPapuValido = false;
            for (int i =0; i < Codigos_Snacks.length; i++){
                if (Codigos_Snacks[i].equals(Entrada)){
                    total += Precios_Papus[i];
                    Productos_Papulines_Comprados ++;
                    System.out.printf("Producto Papulin Añadido : (Total :)", Productos_Papus[i], total);
                    CodigoPapuValido = true;
                    break;
                }
            }

            if (!CodigoPapuValido){
                System.out.println("Codigo Papu no valido, eso no es nada papu >:(");
            }
        }

        if (total > 0){
            System.out.printf(" Total a pagar: ", total);
            System.out.println("Ingrese el papu dinero papu: ");
            int PagoPapu = teclado.nextInt();

            if (PagoPapu < total){
                System.out.println("No tienes suficiente papu dinero - NOSEPUEDEVENDER");
            } else {
                int CambioPapu = PagoPapu - total;
                System.out.printf("Toma tu cambio papu: ", CambioPapu);

                int[] PapuMoneda = {200,100,50,20,10,5,2,1};
                String[] nombres = {"200","100","50","20","10","5","2","1"};

                System.out.println("Este el cambio papu: ");
                for (int i = 0; i < PapuMoneda.length; i++){
                    int CantidadPapulina = CambioPapu / PapuMoneda[i] ;
                    if (CantidadPapulina > 0){
                        System.out.printf(nombres[i], CantidadPapulina);
                        CambioPapu %= PapuMoneda[i];
                    }
                }
            }
        }

        System.out.println("Muchas Gracias Por Su Compra Papu Vuelva Pronto, Adios Papu!!");
        teclado.close();

    }
}