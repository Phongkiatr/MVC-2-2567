package View;

import Model.Owl;

public class OwlView {
    public void showAccepted(Owl pet) {
        System.out.println("Accepted Owl: ID " + pet.getId());
    }
    public void showRejected(Owl pet) {
        System.out.println("Rejected Owl: ID " + pet.getId() + " (Flight Distance < 100 km)");
    }
}
