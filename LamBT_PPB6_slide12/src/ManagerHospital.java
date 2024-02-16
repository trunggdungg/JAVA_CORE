import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ManagerHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("Nhập số người muốn quản lý: ");
            n = Integer.parseInt(sc.nextLine());
            if (n<=0){
                System.out.println("Nhập lại số người! ");
            }
        }while (n<=0);

        Person[] person = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho người thứ "+(i+1));
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Bạn muốn lưu thông tin cho?(1.Doctor  - 2.Patient)");

            int choose = Integer.parseInt(sc.nextLine());

            if (choose==1){
                System.out.println("Nhập chuyên khoa: ");
                String chuyenKhoa = sc.nextLine();
                System.out.println("Nhập số giờ làm việc: ");
                double timeWork = Double.parseDouble(sc.nextLine());
                person[i] = new Doctor(name,age,chuyenKhoa,timeWork);

            }else if (choose==2){
                System.out.println("Nhập số bệnh án cho bệnh nhân: ");
                int soBenhAn = Integer.parseInt(sc.nextLine());
                System.out.println("Ngày nhập viện (dd/MM/yyyy): ");
                String ngayNhapVien = sc.next();
                LocalDate localDate = LocalDate.parse(ngayNhapVien, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                person[i] = new Patient(name, age, soBenhAn, localDate);
            }else {
                System.out.println("Lựa chọn không hợp lệ.");
                i--;
            }

        }

        System.out.println("Thông tin bạn đã nhập! ");
        for (int i = 0; i < n; i++) {
            person[i].xuat();
        }

    }
}
