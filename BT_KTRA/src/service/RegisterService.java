package service;

import entities.User;
import view.LoginMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterService {
    public static List<User> userList = new ArrayList<>();

    public void registerInput(Scanner sc) {
        String username;
        String password;
        String email;
        String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        while (true) {
            System.out.println("Nhap ten dang nhap: ");
            username = sc.nextLine();
            if (isUserExistByUsername(username)) {
                System.out.println("Username bi trung! Vui long nhap lai.");
                continue;
            }

            System.out.println("Nhap password: ");
            password = sc.nextLine();
            if (!password.matches(passwordPattern)) {
                System.out.println("Password ko dung dinh dang! Vui long nhap lai.");
                continue;
            }

            System.out.println("Nhap email: ");
            email = sc.nextLine();
            if (isUserExistByEmail(email)) {
                System.out.println("Email bi trung! Vui long nhap lai.");
                continue;
            }else if(!email.matches(emailRegex)) {
                System.out.println("Email khong dung dinh dang! Vui long nhap lai.");
                continue;
            }
            break;
        }

        User user = new User(username, password, email);
        userList.add(user);
        System.out.println("Dang ki thanh cong!");
        System.out.println("Danh sách người dùng sau khi đăng ký: " + userList);
    }


    public boolean isUserExistByUsername(String username) {
        for (User user : userList) {
            if(user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean isUserExistByEmail(String email) {
        for (User user : userList) {
            if(user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public boolean isCorrect(String username,String password) {
        for (User user : userList) {
            if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean isUserListEmpty() {
        return userList.isEmpty();
    }

    public void printRegisteredUsers() {
        for (User user : userList) {
            System.out.println("Username: " + user.getUsername() + ", Password: " + user.getPassword());
        }
    }


}
