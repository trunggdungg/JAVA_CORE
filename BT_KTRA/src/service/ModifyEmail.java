package service;

import entities.User;
import service.RegisterService;

import java.util.List;
import java.util.Scanner;

public class ModifyEmail {
    public  List<User> users = RegisterService.userList;

    public void modifyEmailByEmail(Scanner sc) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        String nameModify;
        boolean found = false;

        while (true) {
            System.out.println("Nhập email của người dùng cần sửa đổi: ");
            String emailToModify = sc.nextLine();

            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getEmail().equals(emailToModify)) {
                    found = true;
                    while (true) {
                        System.out.println("Email bạn muốn sửa thành :");
                        nameModify = sc.nextLine();

                        if (!nameModify.matches(emailRegex)) {
                            System.out.println("Email không đúng định dạng! Vui lòng nhập lại.");
                        } else {
                            users.get(i).setEmail(nameModify);
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
