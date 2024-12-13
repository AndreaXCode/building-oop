import org.ies.building.components.ApartamentReader;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var apartamentReader = new ApartamentReader(scanner, ownerReader);
        BuildingReader buildingReader = new BuildingReader(scanner, apartamentReader);

        var building = buildingReader.read();

        System.out.println(building);

    }
}