package gr.aueb.cf.ch13.model;

public class Vehicle {
    private int id;
    private String brand;
    private double velocity;
    private ColorType colorType;

    public Vehicle() {

    }



    public Vehicle(int id, String brand, double velocity, ColorType colorType) {
        this.id = id;
        this.brand = brand;
        this.velocity = velocity;
        this.colorType = colorType;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getVelocity() {
        return velocity;
    }

    public ColorType getColorType() {
        return colorType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public void setColorType(ColorType colorType) {
        this.colorType = colorType;
    }

    //Public API
    public void startEngine() {
        System.out.println("Engine Started");

    }

    public void stopEngine() {
        if (!isMoving()) {
            System.out.println("Engine Stopped");
        } else {
            System.out.println("Warning. Vehicle is moving.");
        }
    }

    private boolean isMoving() {
        return velocity != 0;
    }

}

