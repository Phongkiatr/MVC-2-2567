package Model;

public abstract class Pet {
    protected String id;
    protected String type; // ประเภทของสัตว์ (Dragon, Owl, Phoenix)
    protected String lastCheckup; // วันที่ตรวจสุขภาพล่าสุด
    protected int vaccineCount; // จำนวนวัคซีนที่ได้รับ

    public Pet(String id, String type, String lastCheckup, int vaccineCount) {
        this.id = id;
        this.type = type;
        this.lastCheckup = lastCheckup;
        this.vaccineCount = vaccineCount;
    }

    public String getType() { return type; }
    public String getId() { return id; }

    // ฟังก์ชันเพื่อตรวจสอบเงื่อนไขการยอมรับตามชนิดของสัตว์ที่แตกต่างไปแต่ละชนิด
    public abstract boolean isValid();
}