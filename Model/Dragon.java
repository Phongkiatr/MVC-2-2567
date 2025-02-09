package Model;

public class Dragon extends Pet {
    private double smokePollution; // ระดับมลพิษที่เกิดจากควัน

    public Dragon(String id, String lastCheckup, int vaccineCount, double smokePollution) {
        super(id, "Dragon", lastCheckup, vaccineCount);
        this.smokePollution = smokePollution;
    }

    @Override
    public boolean isValid() { // ตรวจสอบเงื่อนไข "ระดับมลพิษที่เกิดจากควัน" <= 70%
        return smokePollution <= 70.0;
    }
}
