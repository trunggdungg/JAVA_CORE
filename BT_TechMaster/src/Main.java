import entities.Clazz;
import entities.TechMaster;
import service.ClazzService;
import service.StudentService;
import service.TechMasterService;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static TechMaster techMaster;
    public static void main(String[] args) {
        TechMasterService techMasterService = new TechMasterService();
        ClazzService clazzService = new ClazzService();
        StudentService studentService = new StudentService();

        while(true) {
            System.out.println("Chọn thao tác.");
            System.out.println("1.Nhập thông tin của trung tâm");
            System.out.println("2.Xuất thông tin của trung tâm");
            System.out.println("3.Thêm học viên vào lớp");
            System.out.println("4.Cập nhật thông tin học lực");
            System.out.println("5.Xoá học sinh");
            System.out.println("6.Thoát");

            int choiceNum;
            do{
                choiceNum = new Scanner(System.in).nextInt();
                if(choiceNum >=1 && choiceNum <=5) {
                    break;
                }
                System.out.println("Chọn lại!");

            }while(true);

            switch (choiceNum) {
                case 1:
                    techMaster = techMasterService.inputTechMaster();
                    break;
                case 2 :
                    techMasterService.outPutTeachMaster(techMaster);
                    break;
                case 3:
                    studentService.updateStudent(techMaster);

                    break;
                case 4:
                    studentService.updateStudentRankById(techMaster);
                    break;
                case 5:
                    studentService.RemoveStudent(techMaster);
                    break;
                default:
                    return;

            }
        }
    }
}