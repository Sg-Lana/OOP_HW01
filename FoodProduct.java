package OOP.OOP_HW.HW01;


/*
класс-наследник:
Продукты питания, содержащие следующие свойства:
1.1 Срок годности
 */
public class FoodProduct extends Product {
    protected String date;

    public FoodProduct() {

        this.date = "";
    }

    public FoodProduct(String date) {

        this.date = date;

    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, before date - %s", 
                    super.name, super.price, super.count, super.unit, this.date);
    }

    public String getDate() {
        return String.format("date - %s", this.date);
    }

    
}