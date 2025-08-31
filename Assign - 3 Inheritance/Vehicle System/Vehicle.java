
public class Vehicle {

    String brand = "Audi";
    int fuel = 0;

    Vehicle(){
        brand = "Audi";
        fuel = 0;
    }
    
    Vehicle(String brand, int fuel){
        this.brand = brand;
        this.fuel = fuel;
    }

    int refuel(int litres){
        return fuel += litres;
    }
    
}

class Car extends Vehicle {
    int mileage;
    Car(){
        mileage = 17;
    }
    Car(int mileage){
        this.mileage = mileage;
    }
    void calculateTravelDistance(){
        System.out.println("The car can cover "+this.fuel*mileage+ " km distance");
    }

}

