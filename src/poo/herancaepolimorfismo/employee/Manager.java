package poo.herancaepolimorfismo.employee;

public final class Manager extends Employee {
    private final boolean isAdmin;

    public Manager(String name, String email, String password) {
        super(name, email, password);
        this.isAdmin = true;
    }

    public void generateFinancialReport () {}

    public void viewSales () {}

}
