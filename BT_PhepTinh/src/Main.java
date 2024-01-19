import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //làm một máy tính bỏ túi
        int choice;
        double a;
        double b;
        do {
            System.out.println("Nhập a:");
            a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập b:");
            b = Double.parseDouble(sc.nextLine());
            System.out.println("------------");
            System.out.println("Bạn chọn:");
            System.out.println("1.Phép cộng");
            System.out.println("2.Phép trừ");
            System.out.println("3.Phép nhân");
            System.out.println("4.Phép chia");
            System.out.println("5.Phép chia lấy dư");
            System.out.println("0.Thoát");

            choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.printf("Bạn chọn phép cộng(+): %.2f + %.2f = %.2f \n",a,b, (a+b));
                    break;
                case 2:
                    System.out.printf("Bạn chọn phép trừ(-):%.2f - %.2f = %.2f \n",a,b,  (a-b));
                    break;
                case 3:
                    System.out.printf("Bạn chọn phép nhân(*): %.2f * %.2f = %.2f \n",a,b, (a*b));
                    break;
                case 4:
                    if(b!=0){
                        System.out.printf("Bạn chọn phép chia(/):  %.2f / %.2f = %.2f \n",a,b, (a/b));
                    }else
                        System.out.println("Không thể chia cho 0");
                    break;
                case 5:
                    if(b!=0){
                        System.out.println("Bạn chọn phép chia lấy dư(%):"+(a%b));

                    }else
                        System.out.println("Không thể chia cho 0");
                    break;
                case 0:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Vui lòng chọn lại!");
                    break;

            }
        }while (choice!=0);
    }
}