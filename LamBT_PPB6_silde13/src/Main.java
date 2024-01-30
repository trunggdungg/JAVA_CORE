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
            System.out.println("Nhập thông tin phim thứ " +(i+1));
            System.out.println("Nhập id phim: ");
            String id = sc.nextLine();
            System.out.println("Nhập tiêu đề phim: ");
            String title = sc.nextLine();
            System.out.println("Nhập thể loại của phim (HORROR, COMEDY, DOCUMENTARY): ");
            Category category = Category.valueOf(sc.nextLine().toUpperCase());
            System.out.println("Nhập rank của phim: ");
            double ranking = Double.parseDouble(sc.nextLine());
            System.out.println("Bạn muốn lưu phim theo dạng(1.Movie / 2.Series)");

            int choice = Integer.parseInt(sc.nextLine());
            // chọn phim
            if (choice == 1) {
                System.out.println("Nhập thời lượng của phim (phút): ");
                int time = Integer.parseInt(sc.nextLine());
                films[i] = new Movie(id, title, category, ranking, time);
            } else if (choice == 2) {
                System.out.println("Nhập số tập của series: ");
                int soTap = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập thời lượng trung bình của mỗi tập (phút): ");
                int avg = Integer.parseInt(sc.nextLine());
                films[i] = new Series(id, title, category, ranking, soTap, avg);
            } else {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                i--;
            }
        }

        for (int i = 0; i < soLuongFilm; i++) {
            System.out.println("Thông tin phim: ");
            films[i].xuat();
        }


        double rankLowest = films[0].getRanking();
        int Location = 0;
        for (int i = 0; i < soLuongFilm; i++) {
            if (films[i].getRanking() < rankLowest){
              rankLowest=films[i].getRanking();
               Location = i;
            }
        }
        System.out.println("--------------");
        System.out.println("Thông tin phim có rank thấp nhất là : ");
        films[Location].xuat();
        System.out.println("--------------");
        System.out.println("Nhập từ khoá để tìm phim theo tiêu đề: ");
        String keyWord = sc.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        for (int i = 0; i < soLuongFilm; i++) {
        if (films[i].getTitle().equals(keyWord)){
            System.out.println("Thông tin phim: ");
            films[i].xuat();
        }else {
            System.out.println("Không có phim bạn muốn tìm!");
        }
        }


    }
}