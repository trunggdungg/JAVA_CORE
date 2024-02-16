public class Doctor extends Person{
    private String chuyenKhoa;
    private Double timeWork;



    public Doctor(String name, int age, String chuyenKhoa, Double timeWork) {
        super(name, age);
        this.chuyenKhoa = chuyenKhoa;
        this.timeWork = timeWork;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }

    public Double getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(Double timeWork) {
        this.timeWork = timeWork;
    }

    public  void xuat(){
        System.out.println("Tên: "+ getName() +" Tuổi: "+ getAge()+"Chuyên khoa: "+getChuyenKhoa()+"Số giờ làm việc: "+getTimeWork());
    }
}
