import java.util.Scanner;

public class Student {
    private int id,age;
    private String name,address,numberPhone;
    private boolean sex;

    public Student() {
    }

    public Student(int id, int age, String name, String address, String numberPhone, boolean sex) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public void inputData(Scanner sc){
        System.out.println("Enter id: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter name: ");
        this.name = sc.nextLine();
        System.out.println("Enter age: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Enter address: ");
        this.address = sc.nextLine();
        System.out.println("Enter number: ");
        this.numberPhone = sc.nextLine();
        System.out.println("Enter Gender (True | False");
        this.sex = Boolean.parseBoolean(sc.nextLine());
    }
    public void displayData(){
        System.out.println("ID: "+id);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Address: "+address);
        System.out.println("NumberPhone: "+numberPhone);
        System.out.println("Gender: "+(sex ?"Male":"Female"));
    }
}
