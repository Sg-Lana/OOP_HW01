package OOP.OOP_HW.HW01;

/*
 * классы, наследуемые от приведенных ниже классов 
(продукты питания, напитки, предметы гигиены, детские товары)
Подгузники, содержащие следующее свойства:
11.1 Размер
11.2 Минимальный вес
11.3 Максимальный вес
11.4 Тип
 */
public class Diapers extends Childrens{
    protected int size;
    protected int maxwieght;
    protected int minwieght;
    protected String type;

    public Diapers() {
        this.size = 0;
        this.maxwieght = 0;
        this.minwieght = 0;
        this.type = "";
    }

    public Diapers(int size, int maxwieght, int minwieght, String type) {
        this.size = size;
        this.maxwieght = maxwieght;
        this.minwieght = minwieght;
        this.type = type;
    }

    public String getInfo() {
        return String.format(
            "name - %s ,price - %d, count - %d, unit - %s, hypoallergenicity - %b, min age - %d, size - %d, max wieght - %d, min wiegth - %d, type - %s", 
            super.name, super.price, super.count, super.unit, super.hypoallergenicity, super.minAge, this.size, this.maxwieght, this.minwieght, this.type);
    }

    public int getSize() {
        return this.size;
    }

    public int getMaxWieght() {
        return this.maxwieght;
    }

    public int getMinWieght() {
        return this.minwieght;
    }
    
    public String getType() {
        return this.type;
    }
}