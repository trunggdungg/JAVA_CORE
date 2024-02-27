package service;

import entities.Clazz;
import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClazzService {
    List<Student> students;
    StudentService studentService = new StudentService();
    public  Clazz inputClazz(){
//        Clazz clazz = new Clazz();

        System.out.println("Nhập môn học: ");
        String subject = new Scanner(System.in).nextLine();
//        clazz.setSubject(subject);
        System.out.println("Nhập số lượng sinh viên: ");
        int n = new Scanner(System.in).nextInt();
        students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           Student student = studentService.inputStudent();
           students.add(student);
//            clazz.setStudents(students);
        }
        Clazz clazz   = new Clazz(subject,students);
        return clazz;
    }

}
