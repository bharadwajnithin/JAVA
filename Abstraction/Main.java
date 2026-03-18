package Abstraction;

interface Payment {
    void pay(int amount);
}

class CreditCard implements Payment {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }

}

class UPI implements Payment {

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

}

public class Main {

    public static void main(String[] args) {

        Payment p1 = new CreditCard();
        p1.pay(1000);

        Payment p2 = new UPI();
        p2.pay(500);

    }

}