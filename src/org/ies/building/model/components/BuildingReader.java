package org.ies.building.model.components;

import org.ies.building.model.model.Apartament;
import org.ies.building.model.model.Building;

import java.util.Scanner;

public class BuildingReader {

    private final Scanner scanner;
    private final ApartamentReader apartamentReader;

    public BuildingReader(Scanner scanner, ApartamentReader apartamentReader) {
        this.scanner = scanner;
        this.apartamentReader = apartamentReader;
    }


    public Building read(){

        System.out.println("--Datos del edificio--");

        System.out.println("Dirección:");
        String address = scanner.nextLine();

        System.out.println("Municipio:");
        String municipality = scanner.nextLine();

        System.out.println("¿Cuántos apartamentos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Apartament[] apartaments = new Apartament[size];

        for (int i = 0; i < size; i++) {

            apartaments[i] = apartamentReader.read();

        }

        return new Building(

                address,
                municipality,
                apartaments


        );


    }
}
