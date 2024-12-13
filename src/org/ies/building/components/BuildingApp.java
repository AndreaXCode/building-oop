package org.ies.building.components;


import org.ies.building.model.Building;


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
            System.out.println("2.Dado una planta y una puerto, devuelve el apartamento en esa planta y puerta");
            System.out.println("3.Muestra los datos del apartamento");
            System.out.println("4.Muestra los propietarios de un apartamento");
            System.out.println("5.Salir");

            //Se lee la opcion
            option = scanner.nextInt();
            scanner.nextLine();

            //Muestra toda la información del edificio

            if (option == 1) {

                building.showInfo();


                //Dado una planta y una puerto, devuelve el apartamento en esa planta y puerta. Si no existe dicho apartamento devuelve null.

            } else if (option == 2) {

                System.out.println("Planta: ");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Puerta: ");
                String door = scanner.nextLine();


                building.findApartament(tier, door);



                //Dado un número de planta, muestra los apartamentos de esa planta

            } else if (option == 3) {


                System.out.println("Introduce una planta:");
                int tier = scanner.nextInt();
                scanner.nextLine();

                building.showTierApartament(tier);


                //Dado una planta y una puerto, devuelve los propietarios del apartamento de esa puerta y planta. Si no existe dicho apartamento devuelve null.

            } else if (option == 4) {

                System.out.println("Introduce una planta");
                int tier = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Introduce una puerta");
                String door = scanner.nextLine();

                 building.findOwners(tier, door);

//---------------------------------------------
            } else if (option == 5) {

                System.out.println("Saliendo del menu...");

            } else {

                System.out.println("Opcion invalida");
            }

        } while (option != 5);


    }

}



