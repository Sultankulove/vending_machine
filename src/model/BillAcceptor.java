package model;

public class BillAcceptor implements PaymentAcceptor {
    private int balance;

    public BillAcceptor(int balance) {
        this.balance = balance;
    }

    @Override
    public void acceptPayment(int amount) {
        this.balance += balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void resetBalance() {
        this.balance = 0;
    }
}
