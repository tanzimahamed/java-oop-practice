
class Payment {
    void pay() {
        System.out.println("Payment processed");
    }
}


class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Paid with Credit Card");
    }
}

class PayPal extends Payment {
    @Override
    void pay() {
        System.out.println("Paid with PayPal");
    }
}

public class ECommerce {
    static void processPayment(Payment payment) {
        payment.pay(); // Runtime Polymorphism
    }

    public static void main(String[] args) {
        processPayment(new CreditCard()); // Output: Paid with Credit Card
        processPayment(new PayPal());     // Output: Paid with PayPal
    }
}
