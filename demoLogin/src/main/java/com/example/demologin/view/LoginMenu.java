package com.example.demologin.view;

import com.example.demologin.service.LoginService;
import com.example.demologin.service.RegisterService;

import java.util.Scanner;

public class LoginMenu {
    public void reLoginMenu()  {
        while(true) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Dang nhap lai");
            System.out.println("2. Quen mat khau");
            System.out.println("3. Thoat");
            int funcChoice;
            do{
                funcChoice = new Scanner(System.in).nextInt();
                if(funcChoice >= 1 && funcChoice <=3) {
                    break;
                }
                System.out.println("Thao tac khong hop le! Chon lai!");
            }while(true);
            switch (funcChoice) {
                case 1:

                    break;
            }
        }
    }

    public void LoginMenu()  {
        LoginService loginService = new LoginService();
        RegisterService registerService = new RegisterService();
        while(true) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ki");
            System.out.println("3. Thoat");
            int funcChoice;
            do{
                funcChoice = new Scanner(System.in).nextInt();
                if(funcChoice >= 1 && funcChoice <=3) {
                    break;
                }
                System.out.println("Thao tac khong hop le! Chon lai!");
            }while(true);
            switch (funcChoice) {
                case 1:
                    loginService.loginInput();
                    break;
                case 2:
                    registerService.registerInput();
                    break;
            }
        }
    }


}
