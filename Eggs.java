package OOP.OOP_HW.HW01;

/*
классы, наследуемые от приведенных ниже классов 
(продукты питания, напитки, предметы гигиены, детские товары)
8. Яйца, содержащее следующиее свойство:
8.1 Количество в упаковке
 */
public class Eggs extends FoodProduct{
    protected int counts;

    public Eggs() {
        this.counts = 0;
    }
    
    public Eggs(int conts) {
        this.count = conts;
    }

    public String getInfo() {
        return String.format("name - %s ,price - %d, count - %d, unit - %s, before date - %s, counts - %d", 
        super.name, super.price, super.count, super.unit, super.date, this.counts);
    }

    public int getCounts() {
        return this.counts;
    }
}
