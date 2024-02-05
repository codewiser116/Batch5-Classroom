package Classroom.Day26;

public class Smartphone {
    String brand;
    String model;
    int price;
    int memory;
    boolean isSold;


    public Smartphone(String brand, String model, int price, int memory, boolean isSold){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.isSold = isSold;
    }

    public Smartphone(String brand, String model, int memory){
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }

    public void smartphoneDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        System.out.println(memory);
        System.out.println(isSold);
        System.out.println();
    }


    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("Apple", "IPhone 13", 1000, 256, true);
        Smartphone smartphone2 = new Smartphone("Apple", "IPhone 16 pro", 512);

        smartphone1.smartphoneDetails();
        smartphone2.smartphoneDetails();
    }


}
