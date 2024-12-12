package model;

public class CoinAcceptor implements PaymentAcceptor {
    private int amount;

    public CoinAcceptor(int amount) {
        this.amount = amount;
    }

    @Override
    public void acceptPayment(int amount) {
        this.amount += amount;
    }

    @Override
    public int getBalance() {
        return amount;
    }

    @Override
    public void resetBalance() {
        this.amount = 0;
    }
}
