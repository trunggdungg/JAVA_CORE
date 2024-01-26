import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n;
    do {
    System.out.println("Nhập số lượng nhân viên: ");
    n = Integer.parseInt(sc.nextLine());
    if(n<=0){
        System.out.println("Nhâp lại số lượng nhân viên: ");
    }
    }while (n<=0);


        Employee [] epl = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ "+(i+1));

            System.out.println("Nhập id: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên: ");
            String name = sc.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(sc.nextLine());
            System.out.println("NHập số năm kinh nghiệm: ");
            double exp = Double.parseDouble(sc.nextLine());


               epl[i] = new Employee(id,name,age,exp);
        }

        System.out.println("Thông tin nhân viên: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Id nhân viên: " + epl[i].getId());
            System.out.println("Tên nhân viên: " + epl[i].getName());
            System.out.println("Tuổi nhân viên: " + epl[i].getAge());
            System.out.println("Số năm kinh nghiệm: " + epl[i].getExperience());
            System.out.println("-----------------------");
        }
    }
}