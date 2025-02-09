package Controller;

import View.SummaryView;
import Model.Pet;
import Model.PetDataModel;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetController {
    private int acceptedCount = 0;
    private int rejectedCount = 0;
    private Map<String, Integer> typeCount = new HashMap<>();
    private SummaryView summaryView = new SummaryView();
    private PetDataModel petDataModel = new PetDataModel();

    public void processPet(Pet pet) {
        if (pet.isValid()) {
            acceptedCount++;
            typeCount.put(pet.getType(), typeCount.getOrDefault(pet.getType(), 0) + 1);
            System.out.println("Accepted " + pet.getType() + ": ID " + pet.getId());
        } else {
            rejectedCount++;
            System.out.println("Rejected " + pet.getType() + " (Failed Criteria)");
        }
    }

    // ตรวจสอบสัตว์เลี้ยง
    public void processPetsFromCSV(String csvFile) {
        List<Pet> pets = petDataModel.readPetsFromCSV(csvFile);
        for (Pet pet : pets) {
            processPet(pet);
        }
    }

    public void showSummary() {
        summaryView.showSummary(acceptedCount, rejectedCount, typeCount);
    }
}