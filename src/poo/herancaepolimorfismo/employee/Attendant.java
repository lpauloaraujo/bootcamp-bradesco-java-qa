package poo.herancaepolimorfismo.employee;

import java.math.BigDecimal;

public final class Attendant extends Employee {
    private BigDecimal cashAmount;
    private boolean isAdmin;

    public Attendant(String name, String email, String password) {
        super(name, email, password);
        this.cashAmount = BigDecimal.ZERO;
        this.isAdmin = false;
    }

    public void receivePayment (BigDecimal value) {
        this.cashAmount = this.cashAmount.add(value);
    }

    public void closeRegister () {
        System.out.println("The register was closed");
    }
}
