import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Student[] students = new Student[100];
    static int studentIndex = 0;
    public static void main(String[] args) {
        while(true){
            System.out.println("hãy chọn chức năng bạn muốn sửa, Menu: \n");
            System.out.println("1. Hiển thị danh sách tất cả các học sinh\n");
            System.out.println("2. Thêm mới học sinh\n");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh\n");
            System.out.println("4. Xoá học sinh\n");
            System.out.println("0. Thoát");
            System.out.println("Nhap lua chon");
            byte choice = Byte.parseByte(sc.nextLine());
            switch(choice){
                case 1:
                    System.out.println("bạn đã lựa chọn 1. Hiển thị danh sách tất cả các học sinh\n ");
                    StudentService.displayAllStudents();
                    break;
                case 2:
                    System.out.println("bạn đã lựa chọn 2. Thêm mới học sinh\n");
                    StudentService.addStudents();
                    break;
                case 3:
                    System.out.println("bạn đã lựa chọn 3. Sửa thông tin học sinh dựa vào mã học sinh\n");
                    StudentService.updateStudens();
                    break;
                case 4:
                    System.out.println("bạn đã lựa chọn 4. Xoá học sinh\n");
//                    StudentService.deleteStudens();
                    break;
                case 0:
                    System.out.println("bạn đã thoát khỏi chương trình");
                    System.exit(0);
                default:
                    System.out.println("hãy chọn đúng số tương ứng với chức năng");
            }
        }
    }

}