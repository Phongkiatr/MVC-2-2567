import Controller.Controller;
import Model.Model;
import View.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.updateView(); // แสดงข้อมูลเริ่มต้น
        
        controller.setData("Updated Data"); // อัปเดตข้อมูล
        controller.updateView(); // แสดงข้อมูลที่อัปเดตแล้ว
    }
}