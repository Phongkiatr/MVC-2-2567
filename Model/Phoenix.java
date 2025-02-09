package Model;

public class Phoenix extends Pet {
    private boolean fireProofCertificate; // ใบรับรองไฟไม่ลาม

    public Phoenix(String id, String lastCheckup, int vaccineCount, boolean fireProofCertificate) {
        super(id, "Phoenix", lastCheckup, vaccineCount);
        this.fireProofCertificate = fireProofCertificate;
    }

    @Override
    public boolean isValid() { // ตรวจสอบเงื่อนไข "ใบรับรองไฟไม่ลาม"
        return fireProofCertificate;
    }
}