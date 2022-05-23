package ramazaniperlik;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Orders {
    List<Order> orderList;

    private Orders(List<Order> list){
    orderList = list;
    }

    public static Orders makeFromStringList(List<String> rows){
        var list = new ArrayList<Order>();
        boolean baslikMi = true;
        for(String row:rows){
            if(baslikMi){
                baslikMi=false;
                continue;
    }
       var cells = row.split(",");
        LocalDate date = LocalDate.parse(cells[0], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String productName = cells[1];
        int productId = Integer.parseInt(cells[2]);
        int productQuantity = Integer.parseInt(cells[3]);
        int customerId = Integer.parseInt(cells[4]);
        String customerName = cells[5];
        String customerSurname = cells[6];
        Order newOrder = new Order(date,productId,productName,customerId,customerName,customerSurname,productQuantity);
        list.add(newOrder);
        }
    Orders newOrders = new Orders(list);
    return newOrders;
    }
    public List<Orders> accordingDate(LocalDate date) {
        //TODO: Orders will being showed according to input date.
    }
    public List<Orders> accordingName(String customerName){
        //TODO: Orders will being showed according to input customerName.

    }
}
