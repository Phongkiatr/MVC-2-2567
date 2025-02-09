package Model;

public class Owl extends Pet {
    private double flightDistance;

    public Owl(String id, String lastCheckup, int vaccineCount, double flightDistance) {
        super(id, "Owl", lastCheckup, vaccineCount);
        this.flightDistance = flightDistance;
    }

    @Override
    public boolean isValid() { // ตรวจสอบเงื่อนไข "ระยะทางบินได้โดยไม่ทานข้าว" >= 100 km.
        return flightDistance >= 100.0;
    }
}
