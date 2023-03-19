package OOP.OOP_HW.HW01;
/*
класс-наследник:
Детские товары:
1 Минимальный возраст
2 Гипоаллергенность,
 */

 public class Childrens extends Product{
    protected boolean hypoallergenicity;
    protected int minAge;

    public Childrens() {
        this.hypoallergenicity = false;
        this.minAge = 0;
    }
    
    public Childrens(Boolean hypoallergenicity, int minAge) {
        this.hypoallergenicity = hypoallergenicity;
        this.minAge = minAge;
    }

    public String getInfo() {
        return String.format(
        "name - %s ,price - %d, count - %d, unit - %s, hypoallergenicity - %b, min age - %d", 
                super.name, super.price, super.count, super.unit, this.hypoallergenicity, this.minAge);
    }

    public boolean getHyp() {
        return this.hypoallergenicity;
    }

    public int getMinAge() {
        return this.minAge;
    }
}
