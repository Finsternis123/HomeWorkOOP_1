package JavaWork.OOPHomeWork.HomeWork_1;

public class chocolate extends Product {
    
    private int calories;

    private double proiteins;

    private double fats;

    private double carbohydrates;
        
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories){
        this.calories = calories;
    }

    public double getProiteins() {
        return proiteins;
    }

    public void setProiteins(Double proiteins){
        this.proiteins = proiteins;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(Double fats){
        this.fats = fats;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates){
        this.carbohydrates = carbohydrates;
    }

    public chocolate(String brand, String name, double price, int calories, double proiteins, double fats, double carbohydrates){
        super(brand, name, price);
        this.calories = calories;
        this.proiteins = proiteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    @Override
    public String displayInfo(){
        return String.format("[Бренд: %s] - [Тип товара: %s] - [Цена: %f] - [Калорийность: %d] - [Белки: %f] - [Жиры: %f] - [Углеводы: %f]", brand, name, price, calories, proiteins, fats, carbohydrates);
    }
}