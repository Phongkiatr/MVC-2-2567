package Model;

public abstract class Pet {
    protected String petID;
    protected String petType; // ประเภทของสัตว์ (Dragon, Owl, Phoenix)
    protected String lastCheckupDate; // วันที่ตรวจสุขภาพล่าสุด
    protected int vaccineCount; // จำนวนวัคซีนที่ได้รับ

    public Pet(String id, String type, String lastCheckup, int vaccineCount) {
        this.petID = id;
        this.petType = type;
        this.lastCheckupDate = lastCheckup;
        this.vaccineCount = vaccineCount;
    }

    // ใช้ดึงข้อมูลต่าง ๆ ของสัตว์
    public String getPetType() { return petType; }
    public String getPetID() { return petID; }

    // ฟังก์ชันเพื่อตรวจสอบเงื่อนไขการยอมรับตามชนิดของสัตว์ที่แตกต่างไปแต่ละชนิด
    public abstract boolean isValid();
}