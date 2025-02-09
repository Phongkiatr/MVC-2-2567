package View;

import Model.Owl;

public class OwlView {
    public void showAccepted(Owl pet) {
        System.out.println("Accepted Owl: ID " + pet.getPetID());
    }

    public void showRejected(Owl pet) {
        System.out.println("Rejected Owl: ID " + pet.getPetID() + " (Flight Distance " + pet.getFlightDistance() + "km. < 100 km.)");
    }
}
