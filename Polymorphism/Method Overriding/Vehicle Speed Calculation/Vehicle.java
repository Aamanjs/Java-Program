
public class Vehicle {
    
    String brand;
    int maxSpeed;

    Vehicle(){
        brand = "BMW";
        maxSpeed = 80;
    }

    Vehicle(String brand,int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    void showTopSpeed(){
        System.out.println("The max speed of "+ brand +" is "+ maxSpeed +" km/hr ");
    }
}

class Car extends Vehicle {

    Car(){
        super();
    }

    Car(String brand,int maxSpeed){
        super(brand,maxSpeed);
    }

    void showTopSpeed(){
        System.out.println("The max speed of "+ brand +" is "+ maxSpeed +" km/hr ");
    }
    
}

class Bike extends Vehicle {
    Bike(){
        super();
    }

    Bike(String brand,int maxSpeed){
        super(brand,maxSpeed);
    }

    void showTopSpeed(){
        System.out.println("The max speed of "+ brand +" is "+ maxSpeed +" km/hr ");
    }
} 

class Truck extends Vehicle {
    Truck(){
        super();
    }

    Truck(String brand,int maxSpeed){
        super(brand,maxSpeed);
    }

    void showTopSpeed(){
        System.out.println("The max speed of "+ brand +" is "+ maxSpeed +" km/hr ");
    }

}
