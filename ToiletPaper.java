package OOP.OOP_HW.HW01;

/*
классы, наследуемые от приведенных ниже классов 
(продукты питания, напитки, предметы гигиены, детские товары)
Туалетная бумага, содержащее следующее свойство:
10.1 Количество слоёв
 */

 public class ToiletPaper extends Higiena{
    protected int sloi;

    public ToiletPaper() {
        this.sloi = 0;
    }

    public ToiletPaper(int sloi) {
        this.sloi = sloi;
    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, quantity - %d, col-vo sloev - %d", 
            super.name, super.price, super.count, super.unit, super.quantity, this.sloi); 
    }

    public int getSloi() {
        return this.sloi;
    }
}
