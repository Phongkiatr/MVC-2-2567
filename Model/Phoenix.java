package Model;

public class Phoenix extends Pet {
    private boolean hasFireProofCertificate; // ใบรับรองไฟไม่ลาม

    public Phoenix(String id, String lastCheckup, int vaccineCount, boolean fireProofCertificate) {
        super(id, "Phoenix", lastCheckup, vaccineCount);
        this.hasFireProofCertificate = fireProofCertificate;
    }

    @Override
    public boolean isValid() { // ตรวจสอบเงื่อนไข "ใบรับรองไฟไม่ลาม"
        return hasFireProofCertificate;
    }
}