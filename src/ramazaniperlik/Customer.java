package ramazaniperlik;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerSurname;

    public Customer(int customerId, String customerName, String customerSurname) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSurname = customerSurname;
    }

    public String getName(){
        return customerName;
    }

    public String getSurame(){
        return customerSurname;
    }

    @Override
    public String toString(){
        return customerName + " " + customerSurname;
    }
}
