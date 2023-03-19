package OOP.OOP_HW.HW01;
/*
классы, наследуемые от приведенных ниже классов 
(продукты питания, напитки, предметы гигиены, детские товары)
Хлеб, содержащий следующие свойство:
Тип муки
 */

 public class Bread extends FoodProduct{
    protected String flour;

    public Bread() {
        this.flour = "";
    }

    public Bread(String flour) {
        this.flour = flour;
    }

    public String getInfo() {
        return String.format("name - %s ,price - %d, count - %d, unit - %s, before date - %s, flour - %s", 
        super.name, super.price, super.count, super.unit, super.date, this.flour);
    }

    public String getType() {
        return this.flour;
    }
}
