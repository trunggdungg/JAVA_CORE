package service;

import entities.Customer;
import entities.InputTable;
import statics.CustomerType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements InputTable {
    public List<Customer> customers = new ArrayList<>();

    public void inputInfo() {
        System.out.println("Bạn thêm mới bao nhiêu khách hàng: ");
        int numberOfCustomer;
        while (true) {
            try {
                numberOfCustomer = new Scanner(System.in).nextInt();
                if(numberOfCustomer<=0){
                   throw  new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e){
                System.out.println("Vui lòng nhập số lượng khách hàng phù hợp!");
            }
        }
        for (int i = 0; i < numberOfCustomer; i++) {
            System.out.println("Nhập thông tin khách hàng thứ " + (i + 1));
            Customer customer = new Customer();
            System.out.println("Nhập tên khách hàng: ");
            customer.setName(new Scanner(System.in).nextLine());
            System.out.println("Nhập địa chỉ khách: ");
            customer.setAddress(new Scanner(System.in).nextLine());
            String temPhone;
            while (true){
                System.out.println("Nhập số điện thoại khách hàng: ");
               temPhone = new Scanner(System.in).nextLine();
                    if(temPhone.matches("^0\\d{9}$")){
                        customer.setPhone(temPhone);
                        break;
                    }
                System.out.println("Vui lòng nhập số điện thoại đúng định dạng!");
            }

            System.out.println("Loại khách hàng (individuals, groups, enterprise)");
            System.out.println("1. Khách hàng cá nhân");
            System.out.println("2. Khách hàng tập thể ");
            System.out.println("3. Khách hàng doanh nghiệp ");
            System.out.println("Xin mời chọn: ");
            int choose;
            while (true){
                try {
                    choose = new Scanner(System.in).nextInt();

                    if(choose>=1 && choose<=3){
                        break;
                    }
                    throw  new InputMismatchException();
                }catch (InputMismatchException e){
                    System.out.println("Vui lòng chọn giá trị hợp lý!");
                }

            }

            switch (choose) {
                case 1:
                    customer.setTypeCustomer(CustomerType.INDIVIDUALS);
                    break;
                case 2:
                    customer.setTypeCustomer(CustomerType.GROUPS);
                    break;
                case 3:
                    customer.setTypeCustomer(CustomerType.ENTERPRISE);
                    break;
            }
            customers.add(customer);
        }
    }


    public void outputInfoCustomer(List<Customer> customerList) {
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

}
