import java.time.LocalDate;

public class Patient extends Person{
    private int soBenhAn;
    private String ngayNhapVien;

    public Patient(String name, int age, int soBenhAn, LocalDate ngayNhapVien) {
        super(name, age);
        this.soBenhAn = soBenhAn;
        this.ngayNhapVien = String.valueOf(ngayNhapVien);
    }

    public int getSoBenhAn() {
        return soBenhAn;
    }

    public void setSoBenhAn(int soBenhAn) {
        this.soBenhAn = soBenhAn;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public void xuat(){
        System.out.println("Tên: "+ getName() +"Tuổi: "+ getAge()+"Số bệnh án: "+getSoBenhAn()+"Ngày nhập viện: "+getNgayNhapVien());
    }
}
