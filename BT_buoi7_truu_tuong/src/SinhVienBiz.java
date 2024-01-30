public class SinhVienBiz extends SinhVienTechMaster{
    private double diemMkt;
    private double sales;

    public double getDiemMkt() {
        return diemMkt;
    }

    public void setDiemMkt(double diemMkt) {
        this.diemMkt = diemMkt;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public SinhVienBiz(String name, String nganh, double diemMkt, double sales) {
        super(name, nganh);
        this.diemMkt = diemMkt;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2*diemMkt + sales)/3;
    }

    public void xuat() {
        double diem = getDiem();
        String hocLuc = getHocLuc(diem);
        System.out.println("Tên - "+getName() + " - Ngành: " + getNganh() + " - Điểm: " + diem + " - Học lực: " + hocLuc);
    }
}
