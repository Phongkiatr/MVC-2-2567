import Controller.PetController;

public class PetManagementSystem {
    public static void main(String[] args) {
        PetController controller = new PetController();
        String csvFile = "pets.csv";

        // อ่านข้อมูลสัตว์ทั้งหมดจากไฟล์ CSV เพื่อนำไปประมวลผล
        controller.processPetsFromCSV(csvFile);

        // แสดงจำนวนสัตว์ทั้งหมดที่ผ่านเงื่อนไข และไม่ผ่านเงื่อนไขการรับ
        controller.showSummary();
    }
}
