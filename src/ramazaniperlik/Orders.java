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
        boolean isTitle = true;
        for(String row:rows){
            if(isTitle){
                isTitle=false;
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
    public List<Order> accordingDate(LocalDate date) {
        ArrayList<Order> resultList = new ArrayList<>();
        for(var order:orderList)
            if(order.getDate().equals(date))
                resultList.add(order);
            return resultList;
    }
    public List<Order> accordingName(String customerNameSurname){
      ArrayList<Order> resultList = new ArrayList<>();
      for(var order:orderList)
          if(order.getCustomerNameSurname().contains(customerNameSurname))
              resultList.add(order);
          return resultList;
    }
}
