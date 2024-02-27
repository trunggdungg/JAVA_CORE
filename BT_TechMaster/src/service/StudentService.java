package service;

import entities.Student;
import entities.TechMaster;

import java.util.List;
import java.util.Scanner;

public  class StudentService {
    public  Student inputStudent(){
        System.out.println("Nhập id học sinh: ");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Nhập tên học sinh: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhập tuổi học sinh : ");
        int age = new Scanner(System.in).nextInt();
        System.out.println("Nhập học lực học sinh : ");
        String rank = new Scanner(System.in).nextLine();

        return new Student(id,name,age,rank);
    }

    public void updateStudent(TechMaster techMaster) {
        techMaster.getClazz().getStudents().add(inputStudent());
        System.out.println("Success");
    }

    public Student findById(TechMaster techMaster,int id) {
        List<Student> students =  techMaster.getClazz().getStudents();
        Student student = new Student();
        for (int i = 0; i < students.size(); i++) {
           if( students.get(i).getId() == id) {
               student = students.get(i);
           }else {
               System.out.println("Null");
//               student= null;
           }
        }
        return student;
    }
    public Student updateStudentRankById(TechMaster techMaster) {
        System.out.println("Nhap id hoc vien: ");
        int id = new Scanner(System.in).nextInt();
        Student student = findById(techMaster,id);
        System.out.println("Nhap hoc luc moi: ");
        String hocluc = new Scanner(System.in).nextLine();
        student.setRank(hocluc);
        return student;
    }


    public Student removeStudentById(TechMaster techMaster,int id){
        List<Student> students =  techMaster.getClazz().getStudents();
        Student student = new Student();
        for (int i = 0; i < students.size(); i++) {
            if( students.get(i).getId() == id) {
                student = students.remove(i);
            }else {
                System.out.println("Null");
            }
        }
        return student;
    }

    public Student RemoveStudent(TechMaster techMaster) {
        System.out.println("Nhap id hoc vien muon xoa: ");
        int id = new Scanner(System.in).nextInt();
        Student student = removeStudentById(techMaster,id);
        return student;
    }

}
