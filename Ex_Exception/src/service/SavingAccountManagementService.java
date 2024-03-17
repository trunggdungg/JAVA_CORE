package service;

import entities.Bank;
import entities.Customer;
import entities.SavingAccount;
import entities.SavingAccountManagerment;

import java.util.*;

public class SavingAccountManagementService {

    public List<SavingAccount> savingAccounts = new ArrayList<>();
    public List<SavingAccountManagerment> savingAccountManagerments = new ArrayList<>();

    public List<SavingAccount> inputSavingAccounts(List<Customer> customers, List<Bank> banks) {
        System.out.println("Có bao nhiêu khách hàng muốn gửi sỏ tiết kiệm: ");
        int number = new Scanner(System.in).nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập thông tin gửi tiết kiệm cho khách hàng thứ "+(i+1));
            System.out.println("Nhập mã khách hàng: ");
            int customerId ;
            Customer customer = null;
            while (true){
             customerId   = new Scanner(System.in).nextInt();
                for (int j = 0; j < customers.size(); j++) {
                    if(customers.get(j).getIdCustomer()==customerId){
               customer = customers.get(j);
               break;

                    }
                }
                if(customer !=null){
                    break;
                }
                System.out.println("Không tìm thấy khách hàng có mã id "+customerId);
            }

            System.out.println("Nhập số lượng  ngân hàng muốn gửi sổ tiết kiệm: ");
            int numberBank = new Scanner(System.in).nextInt();
            for (int j = 0; j < numberBank; j++) {
                System.out.println("Nhập thông tin cho sổ thứ :" + (j+1));
                System.out.println("Nhập mã ngan hàng muốn gửi sổ: ");
                int bankId ;
                Bank bank = null;
                while (true){
                    bankId   = new Scanner(System.in).nextInt();
                    for (int k = 0; k < banks.size(); k++) {
                        if(banks.get(k).getIdBank()==bankId){
                            bank = banks.get(k);
                            break;

                        }
                    }
                    if(bank !=null){
                        break;
                    }
                    System.out.println("Không tìm thấy ngân hàng có mã id "+bankId);
                }

                System.out.println("Nhập số tiền muốn gửi ở ngân hàng này: ");
                double money = new Scanner(System.in).nextDouble();
                SavingAccount savingAccount = new SavingAccount(bank,money);
                savingAccounts.add(savingAccount);

            }
            SavingAccountManagerment savingAccountManagerment = new SavingAccountManagerment(customer,savingAccounts);
            savingAccountManagerments.add(savingAccountManagerment);
        }
        return null;

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
//        public void sortByCustomerName(List<SavingAccountManagerment> ) {
//            System.out.println("danh sách sắp xếp theo tên");
//            savingAccounts.sort(Comparator.comparing(sa -> sa.getCustomer().getName()));
//            System.out.println(savingAccounts);
//        }

    public void sortByCustomerName(List<SavingAccountManagerment> savingAccountManagerments) {
        System.out.println("Danh sách sắp xếp theo tên khách hàng:");
        savingAccountManagerments.sort(Comparator.comparing(sa -> sa.getCustomer().getName()));
        for (SavingAccountManagerment savingAccountManagerment : savingAccountManagerments) {
            System.out.println(savingAccountManagerment);
        }
    }

}
