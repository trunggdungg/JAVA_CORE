package view;

import entities.User;
import service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LoginMenu {
    LoginService loginService = new LoginService();
    RegisterService registerService = new RegisterService();
    ForgetPassword forgetPassword = new ForgetPassword();

    public void reLoginMenu(Scanner sc)  {
        while(true) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Dang nhap lai");
            System.out.println("2. Quen mat khau");
            System.out.println("3. Thoat");
            int funcChoice;
            do{
                funcChoice = Integer.parseInt(sc.nextLine());
                if(funcChoice >= 1 && funcChoice <=3) {
                    break;
                }
                System.out.println("Thao tac khong hop le! Chon lai!");
            }while(true);
            switch (funcChoice) {
                case 1:
                    loginService.loginInput(sc);
                    break;
                case 2:
                     forgetPassword.forgetPassW(sc);
                    break;
                case 3:
                    System.exit(0);
                    return;
            }
        }
    }

    public void LoginMenu(Scanner sc)  {

        while(true) {
            System.out.println("Chon thao tac: ");
            System.out.println("1. Dang nhap");
            System.out.println("2. Dang ki");
            System.out.println("3. Thoat");
            int funcChoice;
            do{
                funcChoice = Integer.parseInt(sc.nextLine());
                if(funcChoice >= 1 && funcChoice <=3) {
                    break;
                }
                System.out.println("Thao tac khong hop le! Chon lai!");
            }while(true);
            switch (funcChoice) {
                case 1:
                    loginService.loginInput(sc);
                    break;
                case 2:
                    registerService.registerInput(sc);
                    registerService.printRegisteredUsers();
                    break;
                case 3:
                    System.exit(0);
                    return;
            }
        }
    }

    public void displayMainMenu(Scanner sc, String username){

        while (true) {
            System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    ModifyUser modifyUser = new ModifyUser();
                    modifyUser.modifyUserByEmail(sc);
                    break;
                case 2:
                    ModifyEmail modifyEmail = new ModifyEmail();
                    modifyEmail.modifyEmailByEmail(sc);
                    break;
                case 3:
                    ModifyPass modifyPass = new ModifyPass();
                    modifyPass.modifyPassByEmail(sc);
                    break;
                case 4:
                    System.out.println("Đăng xuất thành công.");
                    return;
                case 0:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
