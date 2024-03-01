package service;

import entities.User;

import java.util.List;
import java.util.Scanner;

public class ModifyPass {
    public  List<User> users = RegisterService.userList;

    public void modifyPassByEmail(Scanner sc) {
        String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        String passmodify;
        boolean found = false;

        while (true) {
            System.out.println("Nhập email của người dùng cần sửa đổi pass: ");
            String emailToModify = sc.nextLine();

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(emailToModify)) {
                    found = true;
                    while (true) {
                        System.out.println("Pass bạn muốn sửa thành :");
                        passmodify = sc.nextLine();

                        if (!passmodify.matches(passwordPattern)) {
                            System.out.println("PassWord không đúng định dạng! Vui lòng nhập lại.");
                        } else {
                            users.get(i).setPassword(passmodify);
                            System.out.println("Sửa thành công!");
                            break;
                        }
                    }
                    break;
                }
            }

            if (!found) {
                System.out.println("Không tìm thấy email " + emailToModify);
            } else {
                break;
            }
        }
    }
}
