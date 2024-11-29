package org.ies.building.model.components;

import org.ies.building.model.model.Apartament;
import org.ies.building.model.model.Owner;

import java.util.Scanner;

public class ApartamentReader {


    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public ApartamentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Apartament read(){

        System.out.println("--Datos del apartamento--");

        System.out.println("Plata:");
        int tier = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Puerta:");
        String door = scanner.nextLine();


        System.out.println("¿Cuantos propietarios hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Owner[] owners = new Owner[size];

        for (int i = 0; i < size; i++) {

            owners[i] = ownerReader.read();

        }

        return new Apartament(

                tier,
                door,


        );





    }
}
