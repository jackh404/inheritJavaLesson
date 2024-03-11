public class Vehicle{

    public static int vehicleCount = 0;
    private String vin;
    public String make;
    public String model;

    public Vehicle(String vin, String make, String model){
        this.vin = vin;
        this.make = make;
        this.model = model;
        vehicleCount++;
    }

    public Vehicle(){
        this.vin = "None";
        this.make = "None";
        this.model = "None";
        vehicleCount++;
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

    public static void main(String[] args){

        Car car = new Car("12345","Toyota","Camry","sedan");
        System.out.println(car.getVin());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getStyle());

        Truck truck = new Truck("67890","Ford","F150","pickup");
        System.out.println(truck.getVin());
        System.out.println(truck.getMake());
        System.out.println(truck.getModel());
        System.out.println(truck.getType());

        System.out.println(Vehicle.vehicleCount);
        System.out.println(Car.carCount);
        System.out.println(Truck.truckCount);
    }

}

class Car extends Vehicle{

    private String style;
    public static String[] styles = {"coup","sedan","hatchback","SUV","station wagon"};
    public static int carCount = 0;

    public Car(String vin, String make, String model, String style){
        super(vin, make, model);
        this.style = style;
        carCount++;
    }

    public String getStyle(){
        return this.style;
    }
}

class Truck extends Vehicle{

    private String type;
    public static int truckCount = 0;
    public static String[] types = {"flatbed","semi","mini","sport","pickup","dump"};

    public Truck(String vin, String make, String model, String type){
        super(vin, make, model);
        this.type = type;
        truckCount++;
    }

    public String getType(){
        return this.type;
    }
}