package org.ies.building.model.components;

import org.ies.building.model.model.Apartament;

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
        //Muestra toda la información del edificio
        //Muestra los apartamentos de la primera planta
        //Muestra los datos del apartamento situado en una puerta y planta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
        //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"


        //Se declara la opcion fuera del bucl, y luego la leemos
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


                 if (option == 1){



                 } else if (option == 2) {

                     ApartamentReader apartamentReader;

                     int tier = 1;

                 } else if (option == 3) {

                     ApartamentReader apartamentReader;

                 } else if (option == 4) {


                 } else if (option == 5) {

                     System.out.println("Saliendo del menu...");

                 } else {

                     System.out.println("Opcion invalida");
                 }

             } while (option != 5);








    }



}
