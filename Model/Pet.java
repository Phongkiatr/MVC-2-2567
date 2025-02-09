package Model;

public abstract class Pet { // Super Class
    protected String id;
    protected String type;
    protected String lastCheckup;
    protected int vaccineCount;

    public Pet(String id, String type, String lastCheckup, int vaccineCount) {
        this.id = id;
        this.type = type;
        this.lastCheckup = lastCheckup;
        this.vaccineCount = vaccineCount;
    }

    public String getType() { return type; }
    public String getId() { return id; }
    public abstract boolean isValid();
}