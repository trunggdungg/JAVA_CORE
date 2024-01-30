public class SinhVienIT extends SinhVienTechMaster{

    private double diemJava;
    private double diemHtml;
    private double css;

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemHtml() {
        return diemHtml;
    }

    public void setDiemHtml(double diemHtml) {
        this.diemHtml = diemHtml;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public SinhVienIT(String name, String nganh, double diemJava, double diemHtml, double css) {
        super(name, nganh);
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.css = css;
    }

    @Override
    public double getDiem() {

        return (2*diemJava + diemHtml + css)/4;
    }

    public void xuat() {
        double diem = getDiem();
        String hocLuc = getHocLuc(diem);
        System.out.println("Tên - "+getName() + " - Ngành: " + getNganh() + " - Điểm: " + diem + " - Học lực: " + hocLuc);
    }
}
