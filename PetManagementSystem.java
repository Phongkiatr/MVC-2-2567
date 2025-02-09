import Controller.PetController;

public class PetManagementSystem {
    public static void main(String[] args) {
        PetController controller = new PetController();
        String csvFile = "pets.csv";

        controller.processPetsFromCSV(csvFile);
        controller.showSummary();
    }
}
