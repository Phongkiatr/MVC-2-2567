package View;

import java.util.Map;

public class SummaryView {
    public void showSummary(int accepted, int rejected, Map<String, Integer> typeCount) {
        System.out.println("\nSummary:");
        System.out.println("Accepted: " + accepted);
        System.out.println("Rejected: " + rejected);
        for (String type : typeCount.keySet()) {
            System.out.println(type + " Count: " + typeCount.get(type));
        }
    }
}