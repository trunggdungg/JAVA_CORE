import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        do{
            System.out.println("------------");
            System.out.println("Menu:");
            System.out.println("1. Bài 1");
            System.out.println("2. Bài 2");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn : ");

            choice = Integer.parseInt(input.nextLine());
                switch (choice){
                    case 1:
                        System.out.println("Bài 1");
        System.out.println("----------");
        System.out.println("Mời bạn nhập tên hàng nhập kho:");
        String nameGoods = input.nextLine() ;

        System.out.println("Mời bạn nhập ngày tháng năm sinh (\"dd/MM/yyyy\"):");
        String dateOfBirth = input.nextLine();
        LocalDate localDate =LocalDate.parse(dateOfBirth,DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Mời bạn nhập thời gian nhập hàng (\"dd/MM/yyyy HH:mm:ss\"):");
        String timeNhapHang = input.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(timeNhapHang, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println("Mời bạn nhập thời gian (\"HH:mm:ss\"):");
        String time = input.nextLine();
        LocalTime localTime = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.println("------------");
        System.out.println("Tên hàng bạn đã nhập là:" + nameGoods);
        System.out.println("Ngày tháng năm sinh của bạn là:" +localDate);
        System.out.println("Thời gian bạn nhập hàng là:" +localDateTime);
        System.out.println("Thời gian bạn đã nhập là:" +localTime);
                        break;

                    case 2:
                        System.out.println("------------");
                        System.out.println("Bài 2");
                        System.out.println("------------");

                        LocalDateTime localDateTime1 = LocalDateTime.now();
                        System.out.println("Ngày giờ hiện tại là:"+localDateTime1);
                        localDateTime1  = localDateTime1.plusDays(3);
                        System.out.println("Thời gian của 3 ngày sau là:" +localDateTime1);
                    break;
                    case 0:
                        System.out.println("Bye!");
                        break;
                    default:
                        System.out.println("Lựa chọn không hợp lệ!. Hãy chọn lại.");
                        break;
                }
        }while (choice!=0);
            input.close();
    }
}
