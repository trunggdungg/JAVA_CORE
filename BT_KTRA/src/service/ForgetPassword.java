package service;

import entities.User;

import java.util.List;
import java.util.Scanner;

public class ForgetPassword {

    public void forgetPassW(Scanner sc) {
        List<User> users = RegisterService.userList;
        RegisterService registerService = new RegisterService();

        String passW;
        String email;
        String passwordRegex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        System.out.println("Nhập vào email:");
        email = sc.nextLine();

        if (registerService.isUserExistByEmail(email)) {
            do {
                System.out.println("Nhập mật khẩu bạn muốn đổi:");
                passW = sc.nextLine();
                if (passW.matches(passwordRegex)) {
                    for (User user : users) {
                        if (user.getEmail().equals(email)) {
                            user.setPassword(passW);
                            System.out.println("Mật khẩu đã được cập nhật thành công.");
                            return;
                        }
                    }
                } else {
                    System.out.println("Mật khẩu mới không đúng định dạng. Vui lòng thử lại.");
                }
            }while (true);
        } else {
            System.out.println("Không có email bạn vừa nhập trong danh sách đã đăng ký.");
        }
    }
}
