package model;

public interface PaymentAcceptor {
    public void acceptPayment(int amount);

    public int getBalance();

    public void resetBalance();
}
