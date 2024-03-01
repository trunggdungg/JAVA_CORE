package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModifyUser {
    public  List<User> users = RegisterService.userList;

    public void modifyUserByEmail(Scanner sc) {
        System.out.println("Nhập email của người dùng cần sửa đổi: ");
        String emailToModify = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).getEmail().equals(emailToModify)){
                found = true;
                System.out.println("Tên bạn muốn sửa thành :");
                String nameModify = sc.nextLine();
                users.get(i).setUsername(nameModify);
                System.out.println("Sừa thành công!");
                break;
        }
        }
        if (!found) {
            System.out.println("Không tìm thấy email " +emailToModify);
        }
    }

}
