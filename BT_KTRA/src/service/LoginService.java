package service;

import entities.User;
import view.LoginMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginService {

    public void loginInput(Scanner sc) {
        LoginMenu loginMenu = new LoginMenu();
        RegisterService registerService = new RegisterService();
        if (registerService.isUserListEmpty()) {
            System.out.println("Chưa có tài khoản nào được đăng ký. Vui lòng đăng ký tài khoản trước.");
            return;
        }
        String username;
        String password;
        while (true) {

            System.out.println("Nhap ten dang nhap: ");
            username = sc.nextLine();
            if (!registerService.isUserExistByUsername(username)) {
                System.out.println("Nhap sai username!Nhap lai");
                continue;
            }
            System.out.println("Nhap password: ");
            password = sc.nextLine();
            if (!registerService.isCorrect(username,password)) {
                System.out.println("Nhap sai password!");

               loginMenu.reLoginMenu(sc);
            }
            System.out.println("Đăng nhập thành công");
            loginMenu.displayMainMenu(sc,username);
            break;
        }

    }


}
