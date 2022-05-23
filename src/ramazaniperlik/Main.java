package ramazaniperlik;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

   static Orders orders;
    public static void main(String[] args) throws IOException {
       List<String> rows =  Files.readAllLines(Paths.get("C:\\Users\\ramaz\\Desktop\\veri.txt"));
        orders = Orders.makeFromStringList(rows);
        menu();
    }

    static void menu(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1.Tarihe göre ara");
            System.out.println("2.Müşteri Adına göre ara");
            System.out.println("3.Çıkış");
            System.out.println("Seçim:");
            int secim = scanner.nextInt();
            if(secim == 1){
                System.out.println("Tarih giriniz");
                String dateString = scanner.nextLine();
                LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(("dd.MM.yyyy")));
                List<Orders> orderList = orders.accordingDate(date);
                for(var order:orderList){
                    System.out.println(order);
                }
            }
            else if(secim == 2){
                System.out.println("Müşteri Adı giriniz");
                String customerName = scanner.nextLine();
                List<Orders> orderList = orders.accordingName(customerName);
                for(var order:orderList){
                    System.out.println(order);
                }
            }
            else if(secim == 3)System.exit(0);
        }

    }

}
