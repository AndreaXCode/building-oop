package org.ies.building.model.model;

import org.ies.building.model.components.ApartamentReader;

import java.util.Arrays;
import java.util.Objects;


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
    public void showInfo() {

        //Con sout mostramos la información del edificio usando las variables de building
        System.out.println("--Informacion del edifico--");

        System.out.println("Dirreccion: " + address);
        System.out.println("Municipio: " + municipality);

        //Al mostrar los apartamentos, como es un array hay que usar un for each con el array Apartament
        System.out.println("Apartamentos");

        for (Apartament apartament : apartaments) {

            //Dentro del array mostramos la planta y la puerta usando los Getter que devuelven esas variables
            System.out.println("Planta: " + apartament.getTier());
            System.out.println("Puerta: " + apartament.getDoor());

        }

    }

    //Muestra los apartamentos de la primera planta
    public void showFirtApartament() {

        //Con sout indicamos lo que se va a mostrar
        System.out.println("--Apartamentos de la primera planta--");

        //Como quiero buscar los apartamentos de la primera planta, hay que usar un for each para recorrerlo
        for (Apartament apartament : apartaments) {

            //Dentro del for, usamos la condición if  --> si la planta es 1 mostrará los apartamentos, las puertas
            if (apartament.getTier() == 1) {

                System.out.println("Puerta: " + apartament.getDoor());

            } //else-if??

        }
    }

    //Muestra los datos del apartamento situado en una puerta y planta dados.
    //Si no se encuentra muestra el mensaje "No existe el apartamento"

    //Declaramos las variables door y tier dentro de los parentesis
    public void showSpecificApartament(String door, int tier) {

        //Hacemos un for each para buscar el apartamento que queremos
        for (Apartament apartament : apartaments) {

            //Dentro del for, usamos la condición if  --> donde si el apartamento tiene la puerta y la planta dada, mostrará su información
            if (apartament.getDoor().equals(door) && apartament.getTier() == tier) {

                System.out.println("--Datos del apartamento:--");
                //Me faltan datos

                System.out.println("Puerta: " + apartament.getDoor());
                System.out.println("Planta: " + apartament.getTier());


                //Pero si esto es falso, mostrará que no se ha encontrado el apartamento pedido
            } else if (!apartament.getDoor().equals(door) && apartament.getTier() != tier) {

                System.out.println("No existe el apartamento");
            }
        }
    }


    //Muestra los propietarios de un apartamento situado en una planta y puerta dados. Si no se encuentra muestra el mensaje "No existe el apartamento"
    public void showSpecificOwner(String door, int tier) {

        //Hacemos un for each para buscar el apartamento que queremos y poder mostrar los propietarios
        for (Apartament apartament : apartaments) {

            //Dentro del for, usamos la condición if  --> donde si el apartamento tiene la planta y la puerta dada
            if (apartament.getTier() == tier && apartament.getDoor().equals(door)) {

                //Obtenemos la lista de propietarios del apartamento
                Owner[] owners = apartament.getOwners();

                //Hacemos un for each para buscar los propietarios que queremos y poder mostrarlos
                for (Owner owner : owners) {

                    //Mostramos su nombre y apellido con los Getter
                    System.out.println(owner.getName() + owner.getSurname());

                }


                //Si la condición del if es falsa, mostraremos que no existe el departamento
            } else if (apartament.getTier() != tier && !apartament.getDoor().equals(door)) {

                System.out.println("No existe el apartamento");

            }


        }

    }

    //Crear un método que devuelva un apartamento


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


