package View;

import Model.Dragon;

public class DragonView {
    public void showAccepted(Dragon pet) {
        System.out.println("Accepted Dragon: ID " + pet.getId());
    }
    public void showRejected(Dragon pet) {
        System.out.println("Rejected Dragon: ID " + pet.getId() + " (Smoke Pollution > 70%)");
    }
}
