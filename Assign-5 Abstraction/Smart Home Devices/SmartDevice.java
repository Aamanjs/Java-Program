

public interface SmartDevice {

    void turnOn();
    void turnOff();
    String getStatus();
    
}

class Light implements SmartDevice {

    public String deviceId;
    public boolean status = false;

    Light(String deviceId){
        this.deviceId = deviceId;
    }

    @Override
    public void turnOn(){
        status = true;
        System.out.println("Light "+ deviceId +" is turned ON");
    }

    @Override
    public void turnOff(){
        status = false;
        System.out.println("Light "+ deviceId +" is turned OFF");
    }

    @Override
    public String getStatus() {
        if(status == true){
            return "Light "+ deviceId +" is ON";
        } else{
            return "Light "+ deviceId +" is OFF";
        }
    }

}

class Fan implements SmartDevice {

    private String deviceId;
    private boolean status;

    Fan(String deviceId){
        this.deviceId = deviceId;
    }

    @Override
    public void turnOn(){
        status = true;
        System.out.println("Fan "+ deviceId +" is turned ON");
    }

    @Override
    public void turnOff(){
        status = false;
        System.out.println("Fan "+ deviceId +" is turned OFF");
    }

    @Override
    public String getStatus() {
        if(status == true){
            return " Fan "+ deviceId +" is ON";
        } else return " Fan "+ deviceId +" is OFF";
    }

}


