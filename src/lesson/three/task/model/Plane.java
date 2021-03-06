package lesson.three.task.model;

import lesson.three.task.service.IFly;

public class Plane extends Vehicle implements IFly {
    private double height;
    private int numberOfPassengers;
    private Engine engine;
    public Plane(Coordinate coordinates, double price, int speed,
                 int yearOfIssue, double height, int numberOfPassengers, String typeOfEngine) {
        super(coordinates, price, speed, yearOfIssue);
        this.height = height;
        this.numberOfPassengers = numberOfPassengers;
        this.engine = new Engine(typeOfEngine);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    static class Engine {
        private String typeOfEngine;
        public Engine(String typeOfEngine){
            this.typeOfEngine = typeOfEngine;
        }
    }
    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + String.format("%.2f",super.getPrice()) +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ", height: " + String.format("%.2f",height) +
                ", numberOfPassengers: " + numberOfPassengers +
                ", type of engine: " + engine.typeOfEngine +
                ']';
    }
}
