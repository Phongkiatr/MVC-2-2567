package Model;

public class Dragon extends Pet {
    private double smokePollution;

    public Dragon(String id, String lastCheckup, int vaccineCount, double smokePollution) {
        super(id, "Dragon", lastCheckup, vaccineCount);
        this.smokePollution = smokePollution;
    }

    @Override
    public boolean isValid() {
        return smokePollution <= 70.0;
    }
}
