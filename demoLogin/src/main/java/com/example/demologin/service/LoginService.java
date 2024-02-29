package com.example.demologin.service;

import com.example.demologin.DemoLoginApplication;
import com.example.demologin.entity.User;
import com.example.demologin.view.LoginMenu;
import com.sun.tools.javac.Main;

import java.util.List;
import java.util.Scanner;

public class LoginService {
    public void loginInput() {
        RegisterService registerService = new RegisterService();
        String username;
        String password;
        while (true) {
            System.out.println("Nhap ten dang nhap: ");
            username = new Scanner(System.in).nextLine();
            if (!registerService.isUserExistByUsername(username)) {
                System.out.println("Nhap sai username!Nhap lai");
                continue;
            }

            System.out.println("Nhap password: ");
            password = new Scanner(System.in).nextLine();
            if (!registerService.isUserExistByPassword(password)) {
                System.out.println("Nhap sai password!");
                LoginMenu loginMenu = new LoginMenu();
                loginMenu.reLoginMenu();
            }
            break; // Khi không có trùng lặp, thoát khỏi vòng lặp
        }

    }
}
