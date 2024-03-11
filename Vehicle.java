public class Vehicle{

    private String vin;
    public String make;
    public String model;

    public Vehicle(String vin, String make, String model){
        this.vin = vin;
    }

    public String getVin(){
        return this.vin;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

}

class Car extends Vehicle{

    private String style;
    public static String[] styles = {"coup","sedan","hatchback","SUV","station wagon"};

    public Car(String vin, String make, String model, String style){
        super(vin, make, model);
        this.style = style;
    }
}

class Truck extends Vehicle{

    private String type;
    public static String[] types = {"flatbed","semi","mini","sport","pickup","dump"};

    public Truck(String vin, String make, String model, String type){
        super(vin, make, model);
        this.type = type;
    }
}