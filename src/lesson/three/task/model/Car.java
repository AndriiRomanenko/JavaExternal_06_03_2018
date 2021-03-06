package lesson.three.task.model;

import lesson.three.task.service.IMove;

public class Car extends Vehicle implements IMove {
    private Engine engine;
    public Car(Coordinate coordinates, double price, int speed, int yearOfIssue,
               String typeOfFuel, int capacityOfFuel) {
        super(coordinates, price, speed, yearOfIssue);
        this.engine = new Car.Engine(typeOfFuel, capacityOfFuel);
    }

    public class Engine {
        private String typeOfFuel;
        private int capacityOfEngine;
        public Engine(String typeOfFuel, int capacityOfEngine){
            this.typeOfFuel = typeOfFuel;
            this.capacityOfEngine = capacityOfEngine;
        }
    }

    public Engine getEngine(){
        return engine;
    }

    @Override
    public String toString() {
        return "[" + this.getClass().getSimpleName() +
                ", coordinates: " + super.getCoordinates() +
                ", price: " + String.format("%.2f",super.getPrice()) +
                ", speed: " + super.getSpeed() +
                ", yearOfIssue: " + super.getYearOfIssue() +
                ", type of fuel: " + engine.typeOfFuel +
                ", capacity of fuel: " + engine.capacityOfEngine +
                ']';
    }
}
