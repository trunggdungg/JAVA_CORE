package entities;

import java.util.List;

public class SavingAccountManagerment {
    private Customer customer;
    private List<SavingAccount> savingAccounts;

    public SavingAccountManagerment(Customer customer, List<SavingAccount> savingAccounts) {
        this.customer = customer;
        this.savingAccounts = savingAccounts;
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<SavingAccount> getSavingAccounts() {
        return savingAccounts;
    }

    public void setSavingAccounts(List<SavingAccount> savingAccounts) {
        this.savingAccounts = savingAccounts;
    }

    @Override
    public String toString() {
        return "SavingAccountManagerment{" +
                "customer=" + customer +
                ", savingAccounts=" + savingAccounts +
                '}';
    }
}
