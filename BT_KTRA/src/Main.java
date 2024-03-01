import entities.User;
import service.RegisterService;
import view.LoginMenu;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static RegisterService registerService;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginMenu loginMenu = new LoginMenu();
        loginMenu.LoginMenu(sc);
    }
}