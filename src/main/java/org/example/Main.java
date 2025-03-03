package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String TipoAtacante = "";
        String TipoDefensor = "";
        int Ataque_Pokemon = 0;
        int Defensa_Pokemon = 0;
        double Efectividad = 1.0;
        double Danio_Pokemon = 0.0;

        while (true) {
            System.out.println("Por favor ingresa el tipo de Pokemon atacante (Agua, Fuego, Planta, Electrico): ");

            // El metodo .equalsIgnoreCase nos permite comparar dos cadenas de texto sin importar las mayusculas o minusculas//

            TipoAtacante = scanner.next().trim();
            if (TipoAtacante.equalsIgnoreCase("Agua")||
                    TipoAtacante.equalsIgnoreCase("Fuego")||
                    TipoAtacante.equalsIgnoreCase("Planta")||
                    TipoAtacante.equalsIgnoreCase("Electrico")) {
                break;
            } else {
                System.out.println("Ese no es un tipo valido de Pokemon, vuelve a intentarlo.");
            }
        }
        while (true){
            System.out.println("Por favor ingresa el tipo de Pokemon Defensor (Agua, Fuego, Planta, Electrico): ");

            // El operador logico || nos permite devolver un true si alguno de los operenandos son true//

            TipoDefensor = scanner.next().trim();
            if (TipoDefensor.equalsIgnoreCase("Agua")||
                    TipoDefensor.equalsIgnoreCase("Fuego")||
                    TipoDefensor.equalsIgnoreCase("Planta")||
                    TipoDefensor.equalsIgnoreCase("Electrico")) {
                break;
            } else {
                System.out.println("Ese no es un tipo valido de Pokemon, vuelve a intentarlo.");
            }
        }

        while (true){
            System.out.println("Introduce el valor del ataque (Entre 1 y 100): ");
            if (scanner.hasNextInt()){
                Ataque_Pokemon = scanner.nextInt();
                if (Ataque_Pokemon >= 1 && Ataque_Pokemon <= 100){
                    break;
                } else {
                    System.out.println("Valor de ataque no permitido. Debe estar entre 1 y 100. (No es un Rayquaza >:(.)");
                }
            } else {
                System.out.println("No es valor valido. Utiliza un numero entero por favor.");
                scanner.next();
            }
        }

        while (true){
            System.out.println("Introduce el valor de Defensa (Entre 1 y 100): ");
            if (scanner.hasNextInt()){
                Defensa_Pokemon = scanner.nextInt();
                if (Defensa_Pokemon >= 1 && Defensa_Pokemon <= 100){
                    break;
                } else {
                    System.out.println("Valor de defensa no permitido. Debe estar entre 1 y 100. (No es un Eternatus >:(.)");
                }
            } else {
                System.out.println("No es valor valido. Utiliza un numero entero por favor.");
                scanner.next();
            }
        }

        while (true){
            if (TipoAtacante.equals("Agua")){
                if (TipoDefensor.equals("Fuego"))
                    Efectividad = 2.0;
                else if (TipoDefensor.equals ("Planta"))
                    Efectividad = 0.5;
                else
                    Efectividad = 1.0;
                }
            else if (TipoAtacante.equals ("Fuego")){
                if (TipoDefensor.equals ("Planta"))
                    Efectividad = 2.0;
                else if (TipoDefensor.equals("Agua"))
                    Efectividad =0.5;
                else
                    Efectividad = 1.0;
                }
            else if (TipoAtacante.equals("Planta")){
                if (TipoDefensor.equals("Agua"))
                    Efectividad = 2.0;
                else if (TipoDefensor.equals("Fuego"))
                    Efectividad =0.5;
                else
                    Efectividad = 1.0;
            }
            else if (TipoAtacante.equals("Electrico")){
                if (TipoDefensor.equals("Agua"))
                    Efectividad = 2.0;
                else if (TipoDefensor.equals("Planta"))
                    Efectividad =0.5;
                else
                    Efectividad = 1.0;
            }
            break;
        }

        Danio_Pokemon = 50 * ((double) Ataque_Pokemon / Defensa_Pokemon) * Efectividad;

        System.out.println("El Daño Infligido al Defensor es: "+ Danio_Pokemon);
        scanner.close();
    }

}
