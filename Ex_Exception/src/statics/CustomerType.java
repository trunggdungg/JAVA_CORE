package statics;

public enum CustomerType {
    INDIVIDUALS("Cá nhân"),
    GROUPS("Tập thể"),
        ENTERPRISE("Doanh nghiệp");

    public String value;

    CustomerType(String value) {
        this.value = value;
    }
}
