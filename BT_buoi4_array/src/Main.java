import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice ;
      do {
          System.out.println("------------");
          System.out.println("Mời bạn chọn: ");
          System.out.println("------------");
          System.out.println("1.Nhập ma trận,in ra tổng các số chia hết cho 3");
          System.out.println("2.Tính tổng hai ma trận");
          System.out.println("0.Thoát");
            choice = sc.nextInt();
            sc.nextLine();

          switch (choice){
              case 1: {
                  System.out.println("Mời bạn nhập số dòng của ma trận: ");
                  int row = Integer.parseInt(sc.nextLine());
                  System.out.println("Mời bạn nhập số cột của ma trận: ");
                  int col = Integer.parseInt(sc.nextLine());

                  int[][] maTrix = new int[row][col];
                  // nhap ma tran
                  for (int i = 0; i < row; i++) {
                      for (int j = 0; j < col; j++) {
                          System.out.println("Mời bạn nhập vào phần tử thứ [" + i + "][" + j + "]");
                          maTrix[i][j] = sc.nextInt();
                      }
                  }

                  //hien thi ma tran
                  System.out.println("Ma trận bạn vừa nhập là:");
                  for (int i = 0; i < row; i++) {
                      for (int j = 0; j < col; j++) {
                          System.out.print(maTrix[i][j]);
                      }
                      System.out.println();
                  }
                  // tong các số chia het cho 3
                  int sum = 0;
                  for (int i = 0; i < row; i++) {
                      for (int j = 0; j < col; j++) {
                          if (maTrix[i][j] % 3 == 0) {
                              sum = sum + maTrix[i][j];
                          }
                      }
                  }
                  System.out.println("Tổng các số chia hết cho 3 là :" + sum);
                  break;
              }
                  case 2:{
                      int rowA;
                      int colA;
                      int rowB;
                      int colB;
                  do {
                      System.out.println("Mời bạn nhập vào số dòng của ma trận A: ");
                      rowA = Integer.parseInt(sc.nextLine());
                      System.out.println("Mời bạn nhập vào số cột của ma trận A: ");
                      colA = Integer.parseInt(sc.nextLine());
                      System.out.println("Mời bạn nhập số dòng của ma trận B: ");
                      rowB = Integer.parseInt(sc.nextLine());
                      System.out.println("Mời bạn nhập vào số cột của ma trận B: ");
                      colB = Integer.parseInt(sc.nextLine());

                      if (rowA != rowB || colA != colB){
                          System.out.println("Mời bạn nhập giá trị hợp lý!");
                      }

                  }while (rowA != rowB || colA != colB);

                  int[][] maTrixA = new int[rowA][colA];
                  int[][] maTrixB = new  int[rowB][colB];

                  // Nhập gia trị của ma trận A
                      for (int i = 0; i < rowA; i++) {
                          for (int j = 0; j < colA; j++) {
                              System.out.print("Nhập vào phần tử thứ ["+i+"]["+j+"]" + "của ma trận A: ");
                              maTrixA[i][j] = Integer.parseInt(sc.nextLine());
                          }
                      }

                      // Nhập vào giá trị của ma trận B
                      for (int i = 0; i < rowB; i++) {
                          for (int j = 0; j <colB ; j++) {
                              System.out.print("Nhập vào phần tử thứ ["+i+"]["+j+"]" + "của ma trận B: ");
                              maTrixB[i][j] = Integer.parseInt(sc.nextLine());
                          }
                      }

                      //hien thi hai ma tran
                      System.out.println("Ma trận A bạn vừa nhập là: ");
                      for (int i = 0; i < rowA; i++) {
                          for (int j = 0; j < colA; j++) {
                              System.out.print(maTrixA[i][j]+" ");
                          }
                          System.out.println();
                      }

                      //
                      System.out.println("Ma trận B bạn vừa nhập là: ");
                      for (int i = 0; i < rowB; i++) {
                          for (int j = 0; j < colB; j++) {
                              System.out.print(maTrixB[i][j]+" ");
                          }
                          System.out.println();
                      }
                      // tong hai ma tran
                      System.out.println("Tổng hai ma trận là: ");
                      int[][] sumMaTrix = new int[rowA][colA];
                      for (int i = 0; i < rowA; i++) {
                          for (int j = 0; j < colA; j++) {
                              sumMaTrix[i][j] = maTrixA[i][j] + maTrixB[i][j];
                              System.out.print(sumMaTrix[i][j] +" ");
                          }
                          System.out.println();
                      }
                  break;
              }

              case 0:{
                  System.out.println("Bạn chọn thoát!");
                  break;
              }
              default:{
                  System.out.println("Vui lòng chọn giá trị hợp lý!");
                  break;
              }
          }

      }while (choice!=0);

    }
}