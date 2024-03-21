package service;

import entity.Input;
import entity.Member;

import java.util.ArrayList;
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
        String teamPhone = new Scanner(System.in).nextLine();
        System.out.println("Nhập mức lương: ");
        double salary = new Scanner(System.in).nextDouble();

        Member member = new Member(name,add,teamPhone,salary);
        members.add(member);
    }

    public void outputInfoMember(List<Member> memberList){
        for (Member m: memberList) {
            System.out.println(m);
        }
    }
}
