package JavaWork.OOPHomeWork.HomeWork_1;

import java.util.*;;

public class VendingMachine {
    
    private List<Product> products;

    public VendingMachine(List<Product> products){
        this.products = products;
    }

    public chocolate getChocolate(int calories){
        for (Product product : products){
            if (product instanceof chocolate){
                if (((chocolate)product).getCalories() == calories){
                    return (chocolate)product;
                }
            }
        }
        return null;
    }
}
