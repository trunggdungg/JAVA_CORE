package entities;

import statics.CustomerType;

public class Customer {
    private static int idAuto = 10000;
    private int idCustomer;
    private String name;
    private String address;
    private String phone;
    private CustomerType typeCustomer;

    public Customer() {
        this.idCustomer = idAuto++;

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

    public CustomerType getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(CustomerType typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + idCustomer +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", typeCustomer='" + typeCustomer.value + '\'' +
                '}';
    }
}
