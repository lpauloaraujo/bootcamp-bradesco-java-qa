package poo.classeseencapsulamento;

import static java.lang.Math.abs;

public class Car {
    private boolean isRunning;
    private Direction direction;
    private int speed;
    private int gear;

    public enum Direction {
        RIGHT,
        LEFT
    }

    public Car () {
        isRunning = false;
        speed = 0;
        this.gear = 0;
    }

    @Override
    public String toString() {
        return String.format("Running: %s | Speed: %s km/h | Gear: %s° | Direction: %s.",
                this.isRunning, this.speed, this.gear, this.direction);
    }

    public boolean isRunning() {
        return isRunning;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void startCar () {
        this.isRunning = true;
        System.out.println("The car is now running.");
    }

    public void turnOffCar () {
        if (this.gear == 0 && this.speed == 0) {
            this.isRunning = false;
            System.out.println("The car was turned off.");
        }
        else System.out.println("You can't turn off the car while it is not in neutral.");
    }

    public void turnDirection (Direction direction) {
        if (this.speed >= 1 && this.speed <= 40) this.direction = direction;
    }

    public void shiftGear (int gear) {
        if (gear >= 0 && gear <= 6) {
            if (abs(this.gear - gear) == 1) this.gear = gear;
            else System.out.println("You can't skip gears.");
        } else System.out.println("This gear does not exist.");
    }

    public void speedUp () {
        if (this.speed < 120) {
            if (checkIfCanSpeedUp()) this.speed += 1;
            else System.out.println("You must shift to the next gear before speeding up.");
        } else System.out.println("You have reached the maximum speed.");
    }
    
    private boolean checkIfCanSpeedUp () {
        int nextSpeed = this.speed + 1;
        if (nextSpeed == 1 && this.gear != 1) return false;
        else if (nextSpeed == 21 && this.gear != 2) return false;
        else if (nextSpeed == 41 && this.gear != 3) return false;
        else if (nextSpeed == 61 && this.gear != 4) return false;
        else if (nextSpeed == 81 && this.gear != 5) return false;
        else return nextSpeed != 101 || this.gear == 6;
    }

    public void slowDown () {
        if (this.speed > 0) {
            if (checkIfCanSlowDown()) this.speed -= 1;
            else System.out.println("You must shift to the previous gear before slowing down.");
        } else System.out.println("You are already at 0 km/h.");
    }

    private boolean checkIfCanSlowDown() {
        int nextSpeed = this.speed - 1;
        if (nextSpeed == 20 && this.gear != 1) return false;
        else if (nextSpeed == 40 && this.gear != 2) return false;
        else if (nextSpeed == 60 && this.gear != 3) return false;
        else if (nextSpeed == 80 && this.gear != 4) return false;
        else return nextSpeed != 100 || this.gear == 5;
    }
}
