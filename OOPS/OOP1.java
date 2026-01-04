public class OOP1 {
    public static void main(String[] args) {
        Car c = new Car("Maruti","Hatchbacks",400000);
        c.getData();
    }
}


class Car {

    String brand;
    String model;
    int price;

    Car(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void getData(){
        System.out.println("Brand "+brand+"\nModel "+model+"\nprice "+price);
    }
}