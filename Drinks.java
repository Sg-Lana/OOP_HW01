package OOP.OOP_HW.HW01;

/*
класс-наследник:
Напитки, содержащие следующие свойства:
2.1 Объём
 */

 public class Drinks extends Product {
    protected String volume;

    public Drinks() {

        this.volume = "";
    }

    public Drinks(String volume) {

        this.volume = volume;

    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, volume - %s", 
                    super.name, super.price, super.count, super.unit, this.volume);
    }

    public String getVolume() {
        return String.format("volume - %s", this.volume);
    }

}