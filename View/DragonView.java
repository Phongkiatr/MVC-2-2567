package View;

import Model.Dragon;

public class DragonView {
    public void showAccepted(Dragon pet) {
        System.out.println("Accepted Dragon: ID " + pet.getPetID());
    }

    public void showRejected(Dragon pet) {
        System.out.println("Rejected Dragon: ID " + pet.getPetID() + " (Smoke Pollution Level " + pet.getSmokePollutionLevel() + "% > 70%)");
    }
}
