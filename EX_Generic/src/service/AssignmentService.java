package service;

import entity.Assignment;
import entity.Member;
import entity.Position;
import view.Menu;

import java.util.*;

public class AssignmentService {
    public List<Assignment> assignments = new ArrayList<>();

    public void inputAssignment(List<Member> members, List<Position> positions) {
        System.out.println("Bạn muốn phân công cho mấy nhân viên: ");
        int numberMember;
        while (true) {
            try {
                numberMember = new Scanner(System.in).nextInt();
                if(numberMember<0){
                    System.out.println("vui lòng nhập số lớn hơn 0");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập số!");
            }
        }


        for (int i = 0; i < numberMember; i++) {
            System.out.println("Nhập thông tin phân công cho nhân viên thứ " + (i + 1));
            System.out.println("Nhập id nhân viên bạn muốn phân công: ");
            int idMember;
            Member member = null;
            while (true) {
                idMember = new Scanner(System.in).nextInt();
                for (int j = 0; j < members.size(); j++) {
                    if (members.get(j).getIdMember() == idMember) {
                        member = members.get(j);
                        break;
                    }
                }
                if (member != null) {
                    break;
                }
                System.out.println("Không tìm thấy nhân viên có mã id " + idMember + ", Vui lòng nhập lại!");
            }

            System.out.println("Nhập mã vị trí cho nhân viên: ");
            int idPosition;
            Position position = null;
            while (true) {
                idPosition = new Scanner(System.in).nextInt();
                for (int k = 0; k < positions.size(); k++) {
                    if (positions.get(k).getIdPosition() == idPosition) {
                        position = positions.get(k);
                        break;
                    }
                }
                if (positions != null) {
                    break;
                } else
                    System.out.println("KHông tìm thấy vị trí có mã id " + idPosition);
            }
            System.out.println("Nhập số ngày làm việc của nhân viên: ");
            int daysWorked ;
            while (true){
                try {
                    daysWorked = new Scanner(System.in).nextInt();
                    if(daysWorked <0){
                        System.out.println("Nhập ngày lớn hơn 0 đi ạ!");
                        continue;
                    }break;
                }catch (InputMismatchException e){
                    System.out.println("Vui lòng nhập số!");
                }
            }


            Assignment assignment = new Assignment(member, position, daysWorked);
            assignments.add(assignment);
        }

    }

    public void ouputAssignment(List<Assignment> assignmentList) {
        for (Assignment as : assignmentList) {
            System.out.println(as);
        }
    }

    public void sortAssignmentsByName() {
        Collections.sort(assignments, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment assignment1, Assignment assignment2) {
                String memberName1 = assignment1.getMember().getName();
                String memberName2 = assignment2.getMember().getName();

                int comparisonResult = memberName1.compareToIgnoreCase(memberName2);

                return comparisonResult;
            }
        });
        ouputAssignment(assignments);
    }

    public void sortAssignmentByDayWorked() {
        Collections.sort(assignments, new Comparator<Assignment>() {
            @Override
            public int compare(Assignment o1, Assignment o2) {
                int dayworked1 = o1.getDayWorked();
                int dayworked2 = o2.getDayWorked();

                return Integer.compare(dayworked2, dayworked1);
            }

        });
        ouputAssignment(assignments);
    }

    public void calculateSalary(List<Member> members, List<Position> positions) {
        for (Member member : members) {
            double totalBonus = 0.0;
            int totalDaysWorked = 0;

            for (Assignment assignment : assignments) {
                if (assignment.getMember().equals(member)) {
                    Position position = assignment.getPosition();
                    double positionBonus = position.getBonusSalary();
                    int daysWorked = assignment.getDayWorked();
                    totalDaysWorked = totalDaysWorked + daysWorked;
                    double bonus = (positionBonus / 100.0) * member.getSalary() * daysWorked;
                    totalBonus = totalBonus+ bonus;
                }
            }

            double contractSalary = member.getSalary();
            double additionalBonus = contractSalary * 0.1;
            totalBonus += additionalBonus;

            System.out.println("Thành viên " + member.getName() + " có tổng tiền thưởng là: " + totalBonus);
        }
    }


}
