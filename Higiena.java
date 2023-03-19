package OOP.OOP_HW.HW01;

/*
 класс-наследник:
Предметы гигиены, содержащие следующие свойства:
1 Количество штук в упаковке
 */

 public class Higiena extends Product{
    protected String quantity;

    public Higiena() {

        this.quantity = "";
    }

    public Higiena(String quantity) {

        this.quantity = quantity;

    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, quantity - %s", 
                    super.name, super.price, super.count, super.unit, this.quantity);
    }

    public String getQuantity() {
        return String.format("quantity - %s", this.quantity);
    }
}