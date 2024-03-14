package service;

import entities.Bank;
import entities.Customer;
import entities.TypeCustomer;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankService {
    public List<Bank> banks = new ArrayList<>();

    public void inputInforBank() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập tên ngân hàng: ");
            String name = scanner.nextLine();

            // Kiểm tra nếu tên ngân hàng chứa chữ số
            if (name.matches(".*\\d.*")) {
                throw new InputMismatchException();
            }

            try {
                System.out.println("Nhập lãi suất: ");
                double rate =new Scanner(System.in).nextDouble();


                Bank bank = new Bank(name, rate);
                banks.add(bank);
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số cho lãi suất.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lỗi: Định dạng dữ liệu không hợp lệ cho tên ngân hàng.");
        }
    }

    public void outputInfoBank(List<Bank> bankList) {
        System.out.println("Danh sách khách hàng: ");
        for (Bank bank : bankList) {
            System.out.println(bank);
        }
    }
}
