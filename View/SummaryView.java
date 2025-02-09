package View;

import java.util.Map;

public class SummaryView {
    public void showSummary(int accepted, int rejected, Map<String, Integer> acceptedByType,
            Map<String, Integer> rejectedByType) {
        System.out.println("\nSummary:");
        System.out.println("Total Accepted: " + accepted);
        System.out.println("Total Rejected: " + rejected);

        for (String type : acceptedByType.keySet()) {
            System.out.println(
                    type + " - Accepted: " + acceptedByType.get(type) + ", Rejected: " + rejectedByType.get(type));
        }
    }
}