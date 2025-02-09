package Model;

public class Dragon extends Pet {
    private double smokePollutionLevel; // ระดับมลพิษที่เกิดจากควัน

    public Dragon(String id, String lastCheckup, int vaccineCount, double smokePollution) {
        super(id, "Dragon", lastCheckup, vaccineCount);
        this.smokePollutionLevel = smokePollution;
    }

    @Override
    public boolean isValid() { // ตรวจสอบเงื่อนไข "ระดับมลพิษที่เกิดจากควัน" <= 70%
        return smokePollutionLevel <= 70.0;
    }

    public double getSmokePollutionLevel() {
        return smokePollutionLevel;
    }
}
