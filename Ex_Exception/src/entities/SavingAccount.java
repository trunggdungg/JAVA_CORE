package entities;

public class SavingAccount {
    private Customer customer;
    private Bank bank;
    private double soTienGui;

    public SavingAccount(Customer customer, Bank bank, double soTienGui) {
        this.customer = customer;
        this.bank = bank;
        this.soTienGui = soTienGui;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public double getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(double soTienGui) {
        this.soTienGui = soTienGui;
    }

    @Override
    public String toString() {
        return "saveBookMoney{" +
                "customer=" + customer +
                ", bank=" + bank +
                ", soTienGui=" + soTienGui +
                '}';
    }
}
