public class Appliance {

    String name;
    int power;
    
    Appliance(){
    		name = "Electronics";
    		power = 65;
    }

    Appliance(String name, int power){
        this.name = name;
        this.power = power;
    }

    void showConsumption(int hours){
        int consumption = power*hours;
        System.out.println("Generic power consumption of "+ name +" is "+ consumption +" in "+hours+ " hours ");
    }
    
}

class Fan extends Appliance{

    Fan(String name, int power){
        super(name, power);
    }

    @Override
    void showConsumption(int hours){
        int consumption = power*hours;
        System.out.println( name +" consumes "+ consumption +" Wh in "+hours+ " hours ");
    }
}

class AC extends Appliance{

    AC(String name, int power){
        super(name, power);
    }

    @Override
    void showConsumption(int hours){
        int consumption = power*hours;
        System.out.println( name +" consumes "+ consumption +" Wh in "+hours+ " hours ");
    }
}

class Refridgerator extends Appliance{

    Refridgerator(String name, int power){
        super(name, power);
    }

    @Override
    void showConsumption(int hours){
        int consumption = power*hours;
        System.out.println( name +" consumes "+ consumption +" Wh in "+hours+ " hours ");
    }
}

