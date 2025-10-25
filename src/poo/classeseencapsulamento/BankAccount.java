package poo.classeseencapsulamento;

import java.math.BigDecimal;

public class BankAccount {
    private final BigDecimal initialBalance;
    private BigDecimal balance;
    private BigDecimal overdraftLimit;
    private BigDecimal overdraftDebt;
    private static final BigDecimal OVERDRAFT_INTEREST = new BigDecimal("0.2");


    public BankAccount (BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
        this.balance = initialBalance;
        this.overdraftLimit = setOverdraftLimit(initialBalance);
        this.overdraftDebt = new BigDecimal("0.00");
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getOverdraftLimit () {
        return overdraftLimit;
    }

    public BigDecimal getOverdraftDebt () {
        return overdraftDebt;
    }

    public void depositMoney (BigDecimal quantity) {
        if (this.overdraftDebt.compareTo(BigDecimal.ZERO) > 0) {
            BigDecimal actualDebt = this.overdraftDebt.subtract(quantity);
            if (actualDebt.compareTo(BigDecimal.ZERO) <= 0) {
                this.overdraftDebt = BigDecimal.ZERO;
                this.balance = actualDebt.abs();
                this.overdraftLimit = setOverdraftLimit(this.initialBalance);
            } else this.overdraftDebt = actualDebt;
        } else this.balance = this.balance.add(quantity);
        System.out.printf("Balance: $%s. | Overdraft: $%s. | Debt: $%s.\n",
                this.balance, this.overdraftLimit, this.overdraftDebt);
    }

    private void processPayment (BigDecimal quantity) {
        if (checkIfOverdraftLimit(quantity)) {
            BigDecimal overdraftAmount = quantity.subtract(this.balance);
            if (overdraftAmount.compareTo(this.overdraftLimit) > 0) {
                System.out.println("Not enough funds to process $" + quantity + '.');
            } else {
                this.overdraftLimit = this.overdraftLimit.subtract(overdraftAmount);
                setOverdraftDebt(overdraftAmount);
                this.balance = new BigDecimal("0.00");
            }
        } else {
            this.balance = this.balance.subtract(quantity);
        }
    }

    public void withdraw (BigDecimal quantity) {
        processPayment(quantity);
        System.out.printf("Balance: $%s | Overdraft: $%s | Debt: $%s%n",
                this.balance, this.overdraftLimit, this.overdraftDebt);
    }

    public void payBill(BigDecimal amount) {
        System.out.println("Paying bill of $" + amount + ".");
        processPayment(amount);
        System.out.printf("Balance: $%s | Overdraft: $%s | Debt: $%s%n",
                this.balance, this.overdraftLimit, this.overdraftDebt);
    }

    private void setOverdraftDebt (BigDecimal debt) {
        BigDecimal debtWithInterest = debt.add(debt.multiply(OVERDRAFT_INTEREST));
        this.overdraftDebt = this.overdraftDebt.add(debtWithInterest);
    }

    private BigDecimal setOverdraftLimit (BigDecimal initialBalance) {
        BigDecimal overdraftLimit;
        if (initialBalance.compareTo(new BigDecimal("500.00")) <= 0) overdraftLimit = new BigDecimal("50.00");
        else overdraftLimit = initialBalance.multiply(new BigDecimal("0.5"));
        return overdraftLimit;
    }

    private boolean checkIfOverdraftLimit (BigDecimal quantity) {
        return quantity.compareTo(this.balance) > 0;
    }
}
