package service;

import entities.Bank;
import entities.Customer;
import entities.InputTable;
import statics.CustomerType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankService implements InputTable {
    public List<Bank> banks = new ArrayList<>();

    public void inputInfo() {
        int numberOfBank;
        while (true){
            try {
                System.out.println("Bạn thêm mới bao nhiêu ngân hàng: ");
                numberOfBank = new Scanner(System.in).nextInt();
                if(numberOfBank>=1){
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Vui lòng nhập số lượng ngân hàng phù hợp!");
            }
        }

        for (int i = 0; i < numberOfBank; i++) {
            System.out.println("Nhập thông tin ngân hàng thứ " + (i + 1));
            Bank bank = new Bank();
            System.out.println("Nhập tên ngân hàng: ");
            bank.setNameBank(new Scanner(System.in).nextLine());
            Double InterRate;
            while (true){
                try {
                    System.out.println("Nhập lãi suất : ");
                    InterRate = (new Scanner(System.in).nextDouble());
                    if(InterRate >0){
                        bank.setRate(InterRate);
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("Vui lòng nhập giá trị phù hợp!");
                }
            }
            banks.add(bank);
        }
    }
    public void outputInfoBank (List < Bank > bankList) {
        System.out.println("Danh sách ngân hàng: ");
        for (Bank bank : bankList) {
            System.out.println(bank);
        }
    }
}
