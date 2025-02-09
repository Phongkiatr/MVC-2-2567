package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PetDataModel { // การอ่านข้อมูลจากไฟล์ CSV แล้วเก็บข้อมูลไว้ใน ArrayList
    public List<Pet> readPetsFromCSV(String csvFile) {
        List<Pet> pets = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];
                String type = data[1];
                String lastCheckup = data[2];
                int vaccineCount = Integer.parseInt(data[3]);

                switch (type) {
                    case "Phoenix":
                        boolean fireProof = Boolean.parseBoolean(data[4]);
                        pets.add(new Phoenix(id, lastCheckup, vaccineCount, fireProof));
                        break;
                    case "Dragon":
                        double smokePollution = Double.parseDouble(data[5]);
                        pets.add(new Dragon(id, lastCheckup, vaccineCount, smokePollution));
                        break;
                    case "Owl":
                        double flightDistance = Double.parseDouble(data[6]);
                        pets.add(new Owl(id, lastCheckup, vaccineCount, flightDistance));
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return pets;
    }
}
