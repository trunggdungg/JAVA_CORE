package service;

import entities.Bank;
import entities.Customer;
import entities.SavingAccount;

import java.util.*;

public class SavingAccountService {
    public List<SavingAccount> savingAccounts = new ArrayList<>();

    public List<SavingAccount> inputSavingAccounts(List<Customer> customers, List<Bank> banks) {
        Bank selectedBank;
        Customer targetCustomer;
        // tìm customer
        do {
            targetCustomer = findCustomerById(customers);

            if (targetCustomer == null) {
                System.out.println("Không tìm thấy khách hàng.");
            }
        } while (targetCustomer == null);
        System.out.println("Thông tin khách hàng:");
        System.out.println(targetCustomer);
// tìm bank
        do {
            selectedBank = findBankById(banks);
            if (selectedBank == null) {
                System.out.println("Không tìm thấy ngân hàng.");
            }
        } while (selectedBank == null);

// nhập số lượng sổ tk
        System.out.print("Nhập số lượng sổ tiết kiệm: ");
        int numSavingAccounts = new Scanner(System.in).nextInt();

        if (numSavingAccounts <= 0 || numSavingAccounts > 5) {
            System.out.println("Số lượng sổ tiết kiệm không hợp lệ.");
            return savingAccounts;
        }

        for (int i = 0; i < numSavingAccounts; i++) {
            System.out.println("Nhập thông tin sổ tiết kiệm thứ " + (i + 1) + ":");

            System.out.print("Nhập số tiền gửi: ");
            double depositAmount = new Scanner(System.in).nextDouble();

            SavingAccount savingAccount = new SavingAccount(targetCustomer, selectedBank, depositAmount);
            savingAccounts.add(savingAccount);
        }
        return savingAccounts;


    }

    public void sortByCustomerName(List<SavingAccount> savingAccounts) {
        System.out.println("danh sách sắp xếp theo tên");
        savingAccounts.sort(Comparator.comparing(sa -> sa.getCustomer().getName()));
        System.out.println(savingAccounts);
    }


    // Sắp xếp Sổ theo Số tiền gửi
    public void sortByDepositAmount(List<SavingAccount> savingAccounts) {
        savingAccounts.sort(Comparator.comparingDouble(SavingAccount::getSoTienGui));
        System.out.println(savingAccounts);
    }
    // tìm bank qua id
    public Bank findBankById(List<Bank> banks) {
        System.out.println("Nhập mã ngân hàng bạn muốn gửi: ");
        int idBank = new Scanner(System.in).nextInt();
        for (Bank bank : banks) {
            if (bank.getIdBank() == idBank) {
                return bank;
            }
        }
        return null;
    }

    // tìm kh qua id
    public Customer findCustomerById(List<Customer> customers) {
        System.out.print("Nhập ID khách hàng bạn cần tìm: ");
        int customerId = new Scanner(System.in).nextInt();
        for (Customer customer : customers) {
            if (customer.getIdCustomer() == customerId) {
                return customer;
            }
        }
        return null;
    }
// hàm in thông tin ds acc

    public void outputListAccount(List<SavingAccount> savinglist) {
        for (SavingAccount sv : savinglist) {
            System.out.println(sv);
        }
    }

}
