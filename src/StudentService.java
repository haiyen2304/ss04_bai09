public class StudentService {
    // hien thi toan bo thong tin sinh vien
    public static void displayAllStudents(){
        for(int i = 0; i<Main.studentIndex; i++){
            Main.students[i].displayData();
            System.out.println("==========================");
        }
    }
    // them moi sinh vien theo so luong nhap vao
    public static void addStudents(){
        System.out.println("Nhap so sinh vien muon them");
        int number = Integer.parseInt(Main.sc.nextLine());
        for(int i =0; i < number;i++){
            System.out.println("Nhap sinh vien thu "+(i+1));
            Student newStudent = new Student();
            newStudent.inputData(Main.sc);
            Main.students[Main.studentIndex] = newStudent;
            Main.studentIndex++;
            System.out.println("===============================");
        }
        System.out.println("Add "+number +" student successfully");
    }
    public static void updateStudens(){
        System.out.println("Nhap ID muon sua");
        int studentId = Integer.parseInt(Main.sc.nextLine());
        boolean check = true;
        for(int i = 0; i<Main.studentIndex; i++){
            if(Main.students[i].getId() == studentId){
                Main.students[i].inputData(Main.sc);
                System.out.println("Update student successfully");
                check = false;
                break;
            }
        }
        if(check){
            System.err.println("Id not found");
        }
    }
}
