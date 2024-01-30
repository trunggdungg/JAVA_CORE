public abstract class SinhVienTechMaster {
    private String name;
    private  String nganh;

    public SinhVienTechMaster() {

    }

    public SinhVienTechMaster(String name, String nganh) {
        this.name = name;
        this.nganh = nganh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    // phuong thuc tt getdiem
    public  abstract  double getDiem();

    public String getHocLuc(double diem) {
        if (diem < 5) {
            return "Yếu";
        } else if (diem >= 5 && diem < 6.5) {
            return "Trung bình";
        } else if (diem >= 6.5 && diem < 7.5) {
            return "Khá";
        } else {
            return "Giỏi";
        }

    }

    public void xuat() {
    }
}


