package View;

import Model.Phoenix;

public class PhoenixView {
    public void showAccepted(Phoenix pet) {
        System.out.println("Accepted Phoenix: ID " + pet.getPetID());
    }

    public void showRejected(Phoenix pet) {
        System.out.println("Rejected Phoenix: ID " + pet.getPetID() + " (No Fireproof Certificate)");
    }
}
