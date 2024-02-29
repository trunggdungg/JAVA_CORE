package com.example.demologin.service;

import com.example.demologin.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterService {
    public List<User> userList = new ArrayList<>();

    public void registerInput() {
        String username;
        String password;
        String email;
        String passwordPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        while (true) {
            System.out.println("Nhap ten dang nhap: ");
            username = new Scanner(System.in).nextLine();
            if (isUserExistByUsername(username)) {
                System.out.println("Username bi trung! Vui long nhap lai.");
                continue;
            }

            System.out.println("Nhap password: ");
            password = new Scanner(System.in).nextLine();
            if (!password.matches(passwordPattern)) {
                System.out.println("Password ko dung dinh dang! Vui long nhap lai.");
                continue;
            }

            System.out.println("Nhap email: ");
            email = new Scanner(System.in).nextLine();
            if (isUserExistByEmail(email)) {
                System.out.println("Email bi trung! Vui long nhap lai.");
                continue;
            }else if(!email.matches(emailRegex)) {
                System.out.println("Email khong dung dinh dang! Vui long nhap lai.");
                continue;
            }
            break; // Khi không có trùng lặp, thoát khỏi vòng lặp
        }

        User user = new User(username, password, email);
        userList.add(user);
        System.out.println("Dang ki thanh cong!");
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

    public boolean isUserExistByPassword(String password) {
        for (User user : userList) {
            if(user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
