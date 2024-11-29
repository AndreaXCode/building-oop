package org.ies.building.model.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {

    private String address;
    private String municipality;
    private Apartament[] apartaments;

    public Building(String address, String municipality, Apartament[] apartaments) {
        this.address = address;
        this.municipality = municipality;
        this.apartaments = apartaments;
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


