package com.example.demologin;

import com.example.demologin.service.LoginService;
import com.example.demologin.service.RegisterService;
import com.example.demologin.view.LoginMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoLoginApplication {

    public static void main(String[] args) {
//        RegisterService registerService = new RegisterService();
//        registerService.registerInput();

        LoginMenu loginMenu = new LoginMenu();
        loginMenu.LoginMenu();
    }





}
