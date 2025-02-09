package Controller;

import View.DragonView;
import View.OwlView;
import View.PhoenixView;
import View.SummaryView;
import Model.Dragon;
import Model.Owl;
import Model.Pet;
import Model.PetDataModel;
import Model.Phoenix;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PetController {
    private int acceptedCount = 0; // จำนวนสัตว์ทั้งหมดที่ผ่านการยอมรับ
    private int rejectedCount = 0; // จำนวนสัตว์ทั้งหมดที่ถูกปฏิเสธ
    private Map<String, Integer> acceptedByType = new HashMap<>(); // จำนวนสัตว์ที่ผ่านการยอมรับ แยกตามแต่ละประเภท
    private Map<String, Integer> rejectedByType = new HashMap<>(); // จำนวนสัตว์ที่ถูกปฏิเสธ แยกตามแต่ละประเภท
    private SummaryView summaryView = new SummaryView();
    private PetDataModel petDataModel = new PetDataModel();

    private DragonView dragonView = new DragonView();
    private OwlView owlView = new OwlView();
    private PhoenixView phoenixView = new PhoenixView();

    // ตรวจสอบเงื่อนไขของสัตว์แต่ละชนิด
    public void processPet(Pet pet) {
        if (pet.isValid()) {
            acceptedCount++;
            acceptedByType.put(pet.getType(), acceptedByType.getOrDefault(pet.getType(), 0) + 1);

            // เรียกใช้งาน showAccepted() แยกตาม View ของสัตว์แต่ละประเภท
            if (pet instanceof Dragon) {
                dragonView.showAccepted((Dragon) pet);
            } else if (pet instanceof Owl) {
                owlView.showAccepted((Owl) pet);
            } else if (pet instanceof Phoenix) {
                phoenixView.showAccepted((Phoenix) pet);
            }

        } else {
            rejectedCount++;
            rejectedByType.put(pet.getType(), rejectedByType.getOrDefault(pet.getType(), 0) + 1);

            // เรียกใช้งาน showRejected() แยกตาม View ของสัตว์แต่ละประเภท
            if (pet instanceof Dragon) {
                dragonView.showRejected((Dragon) pet);
            } else if (pet instanceof Owl) {
                owlView.showRejected((Owl) pet);
            } else if (pet instanceof Phoenix) {
                phoenixView.showRejected((Phoenix) pet);
            }
        }
    }

    // นำสัตว์ที่ได้จากการอ่านจากฐานข้อมูล เข้าไปตรวจสอบเงื่อนไขทีละตัว
    public void processPetsFromCSV(String csvFile) {
        List<Pet> pets = petDataModel.readPetsFromCSV(csvFile);
        for (Pet pet : pets) {
            processPet(pet);
        }
    }

    // แสดงจำนวนสัตว์เลี้ยงที่ผ่านเงื่อนไข และไม่ผ่านเงื่อนไขการรับทั้งหมด
    public void showSummary() {
        summaryView.showSummary(acceptedCount, rejectedCount, acceptedByType, rejectedByType);
    }
}