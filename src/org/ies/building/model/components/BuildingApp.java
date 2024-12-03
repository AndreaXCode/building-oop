package org.ies.building.model.components;

import org.ies.building.model.model.Apartament;
import org.ies.building.model.model.Building;
import org.ies.building.model.model.Owner;

import java.util.Arrays;
import java.util.Scanner;

public class BuildingApp {


    private final Scanner scanner;
    private final BuildingReader buildingReader;

    public BuildingApp(Scanner scanner, BuildingReader buildingReader) {
        this.scanner = scanner;
        this.buildingReader = buildingReader;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Building building = buildingReader.read();


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

            if (option == 1) {

                building.showInfo();


                //Muestra los apartamentos de la primera planta

            } else if (option == 2) {

                building.showFirtApartament();


                //Muestra los datos del apartamento situado en una puerta y planta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"

            } else if (option == 3) {

                System.out.println("Introduce una puerta:");
                String door = scanner.nextLine();

                System.out.println("Introduce una planta:");
                int tier = scanner.nextInt();
                scanner.nextLine();

                building.showSpecificApartament(door, tier);


                //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"

            } else if (option == 4) {

                System.out.println("Introduce una planta");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();

                 (building.nameOfMet(tier, door))


            } else if (option == 5) {

                System.out.println("Saliendo del menu...");

            } else {

                System.out.println("Opcion invalida");
            }

        } while (option != 5);


    }

}

// if (apartament.getTier() == tier && apartament.getDoor().equals(door)){
//
//                             //for (Owner owner: apartament.getOwners()){
//
//                                 System.out.println(Arrays.toString(apartament.getOwners()));
//
//                             }
//
//                         }

