class Vehicle
{
    int maxSpeed;
    String brand;
    String model;

    Vehicle(){
        maxSpeed = 80;
        brand = "Mercedes Benz";
        model = "GLA";
    }

    Vehicle(int maxSpeed, String brand, String model){
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.model = model;
    }

    void displayInfo(){
        System.out.println("The max speed of Vehicle is "+maxSpeed+" km/hr");
        System.out.println("Brand: "+brand);
        System.out.println("Model name: "+model);
    }
}

class Car extends Vehicle{
    int numDoors;
    String fuelType;
    int seatingCapacity;

    Car(){
        numDoors = 5;
        fuelType = "Diesel";
        seatingCapacity = 5;
    }

    Car(int numDoors, String fuelType, int seatingCapacity){
        this.numDoors = numDoors;
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
    }

    void showCarDetails(){
        System.out.println("The car has "+this.numDoors+" doors");
        System.out.println("This car requires "+this.fuelType+" fuel");
        System.out.println("This car has seating capacity of "+this.seatingCapacity+" members");
    }
}

class ElectricCar extends Car{
    int batteryCapacity;
    int chargingTime;

    ElectricCar(){
        batteryCapacity = 60;
        chargingTime = 3;
    }

    ElectricCar(int batteryCapacity, int chargingTime){
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    void showElectricCarDetails(){
        System.out.println("The battery capacity of vehicle is "+this.batteryCapacity+" %");
        System.out.println("The car gets fully charged in "+chargingTime+" hrs");
        System.out.println("The car has range of "+this.batteryCapacity*4.5+" kms");
    }
}