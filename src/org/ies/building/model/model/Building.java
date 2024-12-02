package org.ies.building.model.model;

import org.ies.building.model.components.ApartamentReader;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Building {

    private String address;
    private String municipality;
    private Apartament[] apartaments;
    private ApartamentReader apartamentReader;

    public Building(String address, String municipality, Apartament[] apartaments) {
        this.address = address;
        this.municipality = municipality;
        this.apartaments = apartaments;
    }

    //Muestra toda la información del edificio
    public void showInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("--Informacion del edifico--");

        System.out.println("Dirreccion: " + address);
        System.out.println("Municipio: " + municipality);

        System.out.println("Apartamentos");
        for (Apartament apartament: apartaments){

            System.out.println("Planta: " + apartament.getTier());
            System.out.println("Puerta: " + apartament.getDoor());

        }

    }

    //Muestra los apartamentos de la primera planta
    public void showFirtApartament(){

        System.out.println("--Apartamentos de la primera planta--");

        for (Apartament apartament: apartaments){

            if (apartament.getTier() == 1){

                System.out.println("Puerta: " + apartament.getDoor());
            }
        }
    }

    //Muestra los datos del apartamento situado en una puerta y planta dados.
    //Si no se encuentra muestra el mensaje "No existe el apartamento"
    public void showSpecificApartament(String door, int tier){

        for (Apartament apartament: apartaments){

            if (apartament.getDoor().equals(door) && apartament.getTier() == tier){

                System.out.println("--Datos del apartamento:--");
                //Me faltan datos

            } else if (!apartament.getDoor().equals(door) && apartament.getTier() != tier) {

                System.out.println("No existe el apartamento");
            }
        }

        //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"


    }










    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public Apartament[] getApartaments() {
        return apartaments;
    }

    public void setApartaments(Apartament[] apartaments) {
        this.apartaments = apartaments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(municipality, building.municipality) && Objects.deepEquals(apartaments, building.apartaments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, municipality, Arrays.hashCode(apartaments));
    }


    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", municipality='" + municipality + '\'' +
                ", apartaments=" + Arrays.toString(apartaments) +
                '}';
    }
}


