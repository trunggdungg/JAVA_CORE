package service;

import entity.Input;
import entity.Member;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberService implements Input {
    public List<Member> members = new ArrayList<>();
    public void inputInfo(){
        System.out.println("Nhập họ tên thành viên: ");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Nhập địa chỉ thành viên: ");
        String add = new Scanner(System.in).nextLine();
        System.out.println("Nhập số điện thoại thành viên: ");
        String teamPhone ;
        while (true){
            teamPhone = new Scanner(System.in).nextLine();
            if(teamPhone.matches( "^0[0-9]{9}$")){
                break;
            }
            System.out.println("Vui lòng nhập đúng định dạng!");
        }
        System.out.println("Nhập mức lương: ");
        double salary;
        while (true){
            try {
                salary = new Scanner(System.in).nextDouble();
                if(salary<0){
                    System.out.println("MỨc lương phải lớn hơn không!");
                    continue;
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Vui lòng nhập số!");
            }
        }

        Member member = new Member(name,add,teamPhone,salary);
        members.add(member);
    }

    public void outputInfoMember(List<Member> memberList){
        for (Member m: memberList) {
            System.out.println(m);
        }
    }
}
