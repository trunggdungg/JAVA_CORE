package view;

import entities.Bank;
import entities.SavingAccountManagerment;
import statics.Constant;
import entities.Customer;
import entities.SavingAccount;
import service.BankService;
import service.CustomerService;
import service.SavingAccountManagementService;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void mainMenu() {
        CustomerService customerService = new CustomerService();
        BankService bankService = new BankService();
        List<Bank> banks = bankService.banks;
        List<Customer> customers = customerService.customers;
        SavingAccountManagementService savingAccountService = new SavingAccountManagementService();
        List<SavingAccount> savingAccounts = savingAccountService.savingAccounts;

        SavingAccountManagementService savingAccountManagementService = new SavingAccountManagementService();
        List<SavingAccountManagerment> savingAccount = savingAccountManagementService.savingAccountManagerments;
        while (true) {
            int choice;
            do {
                System.out.println("-------Menu-------");
                System.out.println("1. Nhập danh sách khách hàng. ");
                System.out.println("2. In ra danh sách khách hàng. ");
                System.out.println("3. Nhập danh sách ngân hàng. ");
                System.out.println("4. In ra danh sách ngân hàng. ");
                System.out.println("5. Lưu sổ tiết kiệm. ");
                System.out.println("6. In ra danh sách sổ tiết kiệm. ");
                System.out.println("7. Sắp xếp sổ tiết theo họ tên khách hàng. ");
                System.out.println("8. Sắp xếp sổ tiết kiệm theo số tiền gửi. ");
                System.out.println("9. Bảng thống kê số tiền gửi của khách hàng. ");
                System.out.println("0. Thoát");
                System.out.println("--------------------------");

                try {
                    System.out.println("Mời bạn chọn: ");
                    choice = new Scanner(System.in).nextInt();
                    if (choice >= 0 && choice <= 9) {
                        break;
                    }
                }catch (InputMismatchException e){
                    System.out.println("Vui lòng chọn hợp lý!");
                }
            } while (true);

            switch (choice) {
                case Constant.INPUT_INFO_CUSTOMER:
                    customerService.inputInfo();
                    break;

                case Constant.OUTPUT_INFO_CUSTOMER:
                    customerService.outputInfoCustomer(customers);
                    break;

                case Constant.INPUT_INFO_BANK:
                    bankService.inputInfo();
                    break;

                case Constant.OUTPUT_INFO_BANK:
                    bankService.outputInfoBank(banks);
                    break;
                case Constant.SAVING_ACCOUNT:
                    savingAccountService.inputSavingAccounts(customers, banks);
                    break;
                case Constant.OUTPUT_SAVING_ACCOUNT:
                    savingAccountService.outputListAccount(savingAccounts);
                    break;
                case Constant.SORT_BY_NAME:
                    savingAccountService.sortByCustomerName(savingAccount);
                    break;
                case Constant.SORT_BY_MONEY:
//                    savingAccountService.sortByDepositAmount(savingAccounts);
                    break;
                case Constant.STATISTICS:
// em chưa lam xong ạ
                    break;

                case Constant.EXIT:
                    System.exit(0);
                    break;
            }
        }
    }
}
