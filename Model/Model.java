package Model;

public class Model {
    private String data;

    public Model() {
        data = "Hello MVC";
    }

    public Model(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}