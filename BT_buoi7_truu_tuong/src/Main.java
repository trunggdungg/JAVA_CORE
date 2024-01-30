import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// check số lượng sinh viên
        int svIT;
      do {
          System.out.println("Nhập số lượng sinh viên IT: ");
          svIT =Integer.parseInt(sc.nextLine());
          if (svIT<=0 ){
              System.out.println("Nhập lại số sinh viên");
          }
      }while (svIT<=0);
      // luu số lượng sinh viên do người dùng vào mảng
        SinhVienTechMaster[] DSSV = new SinhVienTechMaster[svIT];
// chạy vòng lặp viết thông tin sv
        for (int i = 0; i < svIT; i++) {
            System.out.println("NHập thông tin sinh viên thứ: "+(i+1));
            System.out.println("Nhập tên: " );
            String name  = sc.nextLine();
            System.out.println("Nhập ngành (CNTT/BIZ): ");
            String nganh = sc.nextLine();
            //nếu nd chọn sv cntt
            if(nganh.equalsIgnoreCase("CNTT")) {
                System.out.println("Nhập điểm java: ");
                double diemJV = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập điểm HTML: ");
                double diemHTML = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập điểm css: ");
                double diemCss = Double.parseDouble(sc.nextLine());
                //luu tt sv vào mảng của sv cnnt
                DSSV[i]= new SinhVienIT(name,nganh,diemJV,diemHTML,diemCss);
            } else if (nganh.equalsIgnoreCase("BIZ")) {
                System.out.println("Nhập điểm mkt: ");
                double diemMKT = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập điểm sale: ");
                double diemSALE = Double.parseDouble(sc.nextLine());
                //luu tt sv vào mảng của sv biz
                DSSV[i]= new SinhVienBiz(name,nganh,diemMKT,diemSALE);
            }
            else {
                System.out.println("Không có ngành");
                i--;
            }

        }
// in ra tt sv
        for (int i = 0; i < svIT; i++) {
            System.out.println("Thông tin sinh viên "+(i+1));
         DSSV[i].xuat();

        }
    }
}