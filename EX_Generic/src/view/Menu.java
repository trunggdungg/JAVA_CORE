package view;

import entity.Assignment;
import entity.Member;
import entity.Position;
import service.AssignmentService;
import service.MemberService;
import service.PositionService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
   public MemberService memberService = new MemberService();
    public List<Member> members = memberService.members;
    PositionService positionService = new PositionService();
    public List<Position> positions = positionService.positions;

    AssignmentService  assignmentService =new AssignmentService();
    public List<Assignment> assignments = assignmentService.assignments;

    public void MenuMain(){
        while (true){
            System.out.println("----------Menu---------");
            System.out.println("1. Nhập danh sách thành viên. ");
            System.out.println("2. In danh sách thành viên. ");
            System.out.println("3. Nhập danh sách công việc. ");
            System.out.println("4. In danh sách công việc. ");
            System.out.println("5. Nhập danh sách phân công. ");
            System.out.println("6. In danh sách phân công. ");
            System.out.println("7. Sắp xếp dánh sách phân công theo họ tên thành viên. ");
            System.out.println("8. Sắp xếp dánh sách phân công theo số ngày làm giảm dần. ");
            System.out.println("9. Tính tổng tiền thưởng của các thành viên và in ra màn hình. ");
            System.out.println("0. Thoát");
            System.out.println("-----------");
            System.out.println("Xin mời chọn: ");
            int choice = new Scanner(System.in).nextInt();
            switch (choice){
                case 1:
                    memberService.inputInfo();
                    break;
                case 2:
                    memberService.outputInfoMember(members);
                    break;
                case 3:
                    positionService.inputInfoPosition();
                    break;
                case 4:
                    positionService.outputInfoPosition(positions);
                    break;
                case 5:
                    assignmentService.inputAssignment(members,positions);
                    break;
                case 6:
                    assignmentService.ouputAssignment(assignments);
                    break;
                case 7:
                    assignmentService.sortAssignmentsByName();
                    break;
                case 8:
                    assignmentService.sortAssignmentByDayWorked();
                    break;
                case 0:
                    return;

            }
        }
    }
}
