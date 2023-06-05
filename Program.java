package JavaWork.OOPHomeWork.HomeWork_1;

import java.util.*;

public class Program {
    
    public static void main(String[] args) {
        
        Product snack_1 = new chocolate("Snackers", "Шоколадка", 113, 507, 9.3, 27.9, 54.6);
        Product snack_2 = new chocolate("KitKot", "Шоколадка", 124, 524, 6.3, 28.2, 61.1);
        Product snack_3 = new chocolate("Mors", "Шоколадка", 104, 453, 4.4, 68.0, 68.0);
        Product snack_4 = new chocolate("Twex", "Шоколадка", 148, 496, 5.0, 25.0, 63.0);
        Product snack_5 = new chocolate("Nyts", "Шоколадка", 123, 498, 10.6, 28.5, 49.8);
        
        List<Product> products = new ArrayList<>();
        products.add(snack_1);
        products.add(snack_2);
        products.add(snack_3);
        products.add(snack_4);
        products.add(snack_5);
        
        VendingMachine vendingMachine = new VendingMachine(products);
        chocolate chocolateResult = vendingMachine.getChocolate(498);
        if (chocolateResult != null){
            System.out.println("Вы купили: " + (chocolateResult.displayInfo()));
        }
        else {
            System.out.println("Такой шоколадки в автомате нет.");
        }
    }
}
