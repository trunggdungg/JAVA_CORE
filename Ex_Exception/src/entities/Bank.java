package entities;

public class Bank {
    private static int idAuto= 100;
    private int idBank;
    private String nameBank;
    private double rate;

    public Bank( ) {
        this.idBank = idAuto++;

    }

    public int getIdBank() {
        return idBank;
    }

    public void setIdBank(int idBank) {
        this.idBank = idBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + idBank +
                ", nameBank='" + nameBank + '\'' +
                ", rate=" + rate +
                '}';
    }
}
