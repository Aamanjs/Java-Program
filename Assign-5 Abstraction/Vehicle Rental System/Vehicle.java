abstract class Vehicle{
    String vehicleNumber;
    double rentalPrice;

    Vehicle(String vehicleNumber, double rentalPrice){
        this.vehicleNumber = vehicleNumber;
        this.rentalPrice = rentalPrice;
    }

    abstract double calculateRent(int days);
}

class Car extends Vehicle{

    Car(String vehicleNumber, double rentalPrice){
        super(vehicleNumber, rentalPrice);
    }

    @Override
    double calculateRent(int days) {
        double rent = rentalPrice * days;
        return rent;
    }
}

class Bike extends Vehicle{

    Bike(String vehicleNumber, double rentalPrice){
        super(vehicleNumber, rentalPrice);
    }

    @Override
    double calculateRent(int days) {
        double rent = rentalPrice * days;
        return rent;
    }
}