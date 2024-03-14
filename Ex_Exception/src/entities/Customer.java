package entities;

public class Customer {
    private static int idAuto = 10000;
    private int idCustomer;
    private String name;
    private String address;
    private String phone;
    private String typeCustomer;

    public Customer(String name, String address, String phone, TypeCustomer typeCustomer) {
        this.idCustomer = idAuto++;
        this.name = name;
        this.address = address;
        if (phone.matches("\\d{10}")) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Số điện thoại phải có đúng 10 chữ số.");
        }
        this.typeCustomer = String.valueOf(typeCustomer);
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + idCustomer +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}
