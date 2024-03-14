package service;

import entities.Customer;
import entities.TypeCustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    public List<Customer> customers = new ArrayList<>();
    public void inputInforCustomer(){
        try {
            System.out.println("Nhập tên khách hàng: ");
            String name = new Scanner(System.in).nextLine();
            System.out.println("Nhập địa chỉ khách: ");
            String add = new Scanner(System.in).nextLine();
            System.out.println("Nhập số điện thoại khách hàng: ");
            String numberPhone = new Scanner(System.in).nextLine();
            System.out.println("Loại khách hàng (individuals, groups, businesses" );
            String typeStr =new Scanner(System.in).nextLine().toUpperCase();
            TypeCustomer typeCustomer = TypeCustomer.valueOf(typeStr);
            Customer customer  = new Customer(name,add,numberPhone,typeCustomer);
            customers.add(customer);
        }catch (Exception e) {
            System.out.println("Đã xảy ra lỗi khi nhập liệu!, vui lòng thử lại.");
        }
    }


    public void outputInfoCustomer(List<Customer> customerList){
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer: customerList) {
            System.out.println(customer);
        }
    }
}
