package org.ies.building.model.components;

import org.ies.building.model.model.Apartament;
import org.ies.building.model.model.Owner;

import java.util.Arrays;
import java.util.Scanner;

public class BuildingApp {



    public void run(){
        Scanner scanner = new Scanner(System.in);

        //null  --> para iniciarla

        //Pide los datos del edificio
        System.out.println("--Datos del edificio--");

        System.out.println("Dirección");
        String address = scanner.nextLine();

        System.out.println("Municipio");
        String municipality = scanner.nextLine();

        System.out.println("¿Cuántos apartamentos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Apartament[] apartaments = new Apartament[size];


        for (int i = 0; i < size; i++) {

            final ApartamentReader apartamentReader = null;
            apartaments[i] = apartamentReader.read();

        }

        //Inicia un bucle de menú con las siguientes opciones:


        //Se declara la opcion fuera del bucle, y luego la leemos
        int option;

             do {

                 System.out.println("1.Mostrar toda la información del edificio");
                 System.out.println("2.Muestra los apartamentos de la primera planta");
                 System.out.println("3.Muestra los datos del apartamento");
                 System.out.println("4.Muestra los propietarios de un apartamento");
                 System.out.println("5.Salir");

                 //Se lee la opcion
                 option = scanner.nextInt();
                 scanner.nextLine();

                 //Muestra toda la información del edificio

                 if (option == 1){

                     System.out.println("Informacion del edifico:");

                     System.out.println("La direccion es: " + address);

                     System.out.println("Municipio: " + municipality);

                     System.out.println("Apartamentos:");
                     for (Apartament apartament: apartaments){

                         System.out.println("Planta: " + apartament.getTier());
                         System.out.println("Puerta: " + apartament.getDoor());

                     }


                 //Muestra los apartamentos de la primera planta

                 } else if (option == 2) {

                     System.out.println("Apartamentos de la primera planta:");

                     for (Apartament apartament: apartaments){

                         if (apartament.getTier() == 1){

                         System.out.println("Puerta: " + apartament.getDoor());

                        }
                     }


                 //Muestra los datos del apartamento situado en una puerta y planta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"

                 } else if (option == 3) {

                     System.out.println("Introduce una puerta:");
                     String door = scanner.nextLine();

                     System.out.println("Introduce una planta:");
                     int tier = scanner.nextInt();
                     scanner.nextLine();

                     for (Apartament apartament: apartaments){

                         if (apartament.getDoor().equals(door) && apartament.getTier() == tier){

                             System.out.println("Puerta: " + apartament.getDoor());
                             System.out.println("Planta: " + apartament.getTier());

                         } else if (!apartament.getDoor().equals(door) && apartament.getTier() != tier) {

                             System.out.println("No existe el apartamento");

                         }
                     }


                 //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"

                 } else if (option == 4) {

                     System.out.println("Introduce una planta");
                     int tier = scanner.nextInt();
                     scanner.nextLine();

                     System.out.println("Introduce una puerta");
                     String door = scanner.nextLine();

                     for (Apartament apartament: apartaments){

                         if (apartament.getTier() == tier && apartament.getDoor().equals(door)){

                             //for (Owner owner: apartament.getOwners()){

                                 System.out.println(Arrays.toString(apartament.getOwners()));

                             //}

                         }


                     }




                 } else if (option == 5) {

                     System.out.println("Saliendo del menu...");

                 } else {

                     System.out.println("Opcion invalida");
                 }

             } while (option != 5);




    }



}
