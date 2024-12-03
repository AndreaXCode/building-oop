package org.ies.building.model.model;

import java.util.Arrays;
import java.util.Objects;

public class Apartament {

    private int tier;
    private String door;
    private Owner[] owners;


    public Apartament(int tier, String door, Owner[] owners) {
        this.tier = tier;
        this.door = door;
        this.owners = owners;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartament that = (Apartament) o;
        return tier == that.tier && Objects.equals(door, that.door) && Objects.deepEquals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tier, door, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "tier=" + tier +
                ", door='" + door + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}

