package poo.herancaepolimorfismo.employee;

public final class Salesman extends Employee {
    private int salesCount;
    private boolean isAdmin;

    public Salesman(String name, String email, String password) {
        super(name, email, password);
        this.isAdmin = false;
    }

    public void makeSale () {
        this.salesCount += 1;
    }

    public void viewSales () {
        System.out.printf("Number of sales: %s\n", this.salesCount);
    }
}
