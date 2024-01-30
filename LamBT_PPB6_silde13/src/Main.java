import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int soLuongFilm;
        do {
            System.out.println("Nhập số lượng bộ phim bạn muốn lưu: ");
            soLuongFilm = Integer.parseInt(sc.nextLine());
            if (soLuongFilm<=0){
                System.out.println("Vui nhập số lượng phù hợp! ");
            }
        }while (soLuongFilm<=0);
        Film[] films = new Film[soLuongFilm];

        for (int i = 0; i < soLuongFilm; i++) {
            System.out.println("Nhập id phim: ");
            String id = sc.nextLine();
            System.out.println("Nhập tiêu đề phim: ");
            String title = sc.nextLine();
            System.out.println("Nhập thể loại của phim: ");
            String catrgory = sc.nextLine();
            System.out.println("Nhập rank của phim: ");
            double ranking = Double.parseDouble(sc.nextLine());
            System.out.println("Bạn muốn lưu phim theo dạng(Movie / Series)");
            
            // chọn phim
            if (){

            }
        }
    }
}