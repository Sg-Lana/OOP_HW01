package OOP.OOP_HW.HW01;

/*
классы, наследуемые от приведенных ниже классов 
(продукты питания, напитки, предметы гигиены, детские товары)
5. Молоко, содержащиее следующее свойство:
5.1 Процент жирности
5.2 Срок годности
*/

public class Milk extends Drinks{
    protected String date;
    protected int fatContent;

    public Milk() {
        this.date = "";
        this.fatContent = 0;
    }

    public Milk(int fatContent, String date) {

        this.fatContent = fatContent;
        this.date = date;

    }

    public String getInfo() {

        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, volume - %s, date - %s, fat% - %d", 
                    super.name, super.price, super.count, super.unit, super.volume, this.date, this.fatContent);

    }

    public String getdate() {
        return String.format("date - %s", this.date);
    }

    public String getFat() {
        return String.format("fat content - %s", this.fatContent);
    } 
}
