package OOP.OOP_HW.HW01;

public class App {
    public static void main(String[] args) {

        Product[] list = {
            new Drinks(), new Bread(), new Childrens(), 
            new Diapers(), new Eggs(), new FoodProduct(), new Higiena(), 
            new Lemonade(), new Milk(), new ToiletPaper()};
        
            for (Product product : list) {
                aboutProduct(product);
            }
    }

    public static void aboutProduct(Product name) {
        System.out.println(name.getInfo());
        if (name instanceof Childrens) {
            Childrens sc = (Childrens)name;
            System.out.println(sc.getHyp());
            System.out.println(sc.getMinAge());
        }
        else if (name instanceof Bread) {
            Bread sc = (Bread) name;
            System.out.println(sc.getDate());
            System.out.println(sc.getType());
        }

        else if (name instanceof Drinks) {
            Drinks sc = (Drinks) name;
            System.out.println(sc.getVolume());
        }
        
        else if (name instanceof Diapers) {
            Diapers sc = (Diapers) name;
            System.out.println(sc.getHyp());
            System.out.println(sc.getMinAge());
            System.out.println(sc.getSize());
            System.out.println(sc.maxwieght);
            System.out.println((sc.getMinWieght()));
        }
        else if (name instanceof Eggs) {
            Eggs sc = (Eggs) name;
            System.out.println(sc.getDate());
            System.out.println(sc.getCounts());
        }
        else if (name instanceof Higiena) {
            Higiena sc = (Higiena) name;
            System.out.println(sc.getQuantity());
        }
        else if (name instanceof Lemonade) {
            Lemonade sc = (Lemonade) name;
            System.out.println(sc.getVolume());
        } 
        else if (name instanceof Milk) {
            Milk sc = (Milk) name;
            System.out.println(sc.getVolume());
            System.out.println(sc.getFat());
            System.out.println(sc.getdate());
        
        }
        else if (name instanceof FoodProduct) {
            FoodProduct sc = (FoodProduct) name;
            System.out.println(sc.getDate());
        }
        else if (name instanceof ToiletPaper) {
            ToiletPaper sc = (ToiletPaper) name;
            System.out.println(sc.getQuantity());
            System.out.println(sc.getSloi());
        }
    }
}


