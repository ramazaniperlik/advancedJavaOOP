package ramazaniperlik;

import java.time.LocalDate;

public class Order {

    private LocalDate date;
    private int quantity;
    private Customer customer;
    private Product product;

    public Order(LocalDate date,int productId,String productName,int customerId,String customerName,String customerSurname,int quantity){
        this.date = date;
        this.quantity = quantity;
        customer = new Customer(customerId,customerName,customerSurname);
        product = new Product(productId,productName);
    }
    public LocalDate getDate(){
        return date;
    }
    public String getCustomerNameSurname(){
        return customer.getName()+" "+customer.getSurame();
    }

    @Override
    public String toString(){
    return date + " " + customer + " " + product + " " + quantity;
}
}
