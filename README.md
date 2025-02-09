สอบวันอาทิตย์ รอบเช้า (9/2/2568) เลือกทำข้อที่ 1

ส่วนของ Model ประกอบไปด้วย 5 ไฟล์ ได้แก่
    1. Pet.java เป็น Super Class เพื่อเป็นต้นแบบของสัตว์ทั้งหมดโดยมี Abstact Method isValid() เพื่อตรวจสอบเงื่อนไขของสัตว์ที่แตกต่างกันไป
    2. Dragon.java เป็น Sub Class เก็บข้อมูลของมังกร
    3. Owl.java เป็น Sub Class เก็บข้อมูลของนกฮูก
    4. Phoenix.java เป็น Sub Class เก็บข้อมูลของนกฟินิกซ์
    5. PetDataModel.java เป็นส่วนของการอ่านข้อมูลจากไฟล์ CSV มาเก็บไว้ใน List

ส่วนของ View ประกอบไปด้วย 4 ไฟล์ ได้แก่
    1. SummaryView.java ใช้แสดงข้อมูลจำนวนการยอมรับ การปฏิเสธสัตว์ของสัตว์ทุกชนิด
    2. DragonView.java ใช้แสดงการยอมรับ และการปฏิเสธของมังกร
    3. OwlView.java ใช้แสดงการยอมรับ และการปฏิเสธของนกฮูก
    4. PhoenixView.java ใช้แสดงการยอมรับ และการปฏิเสธของนกฟินิกซ์

ส่วนของ Controller ประกอบไปด้วย 1 ไฟล์ ได้แก่
    1. PetController.java

และ Main Program ได้แก่ PetManagementSystem.java ใช้ในการเริ่มทำงานของโปรแกรม

หลักการทำงานของโปรแกรม
    - โปรแกรมจะอ่านข้อมูลจากไฟล์ CSV โดย Controller จะเรียกใช้ PetDataModel ซึ่งมีเมธอด readPetsFromCSV() เพื่ออ่านข้อมูลจากไฟล์
    - หลังจากนั้น Controller จะตรวจสอบความถูกต้องของข้อมูลที่ได้โดยใช้เมธอด isValid() จาก Model (สัตว์ประเภทต่างๆ)
    - หากข้อมูลถูกต้อง (accepted) Controller จะเรียกใช้เมธอด showAccepted() จาก View ที่เหมาะสมกับประเภทสัตว์ เช่น DragonView, OwlView, หรือ PhoenixView
    - หากข้อมูลไม่ถูกต้อง (rejected) Controller จะเรียกใช้เมธอด showRejected() จาก View ที่เหมาะสม
    - สุดท้าย Controller จะเรียกใช้เมธอด showSummary() ของ SummaryView เพื่อแสดงสรุปผลของสัตว์ที่ได้รับการยอมรับและปฏิเสธ รวมถึงจำนวนที่ยอมรับและปฏิเสธตามประเภทสัตว์
    - Output จะแสดงผ่าน Terminal