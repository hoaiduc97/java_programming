package lab_7_2;

public class Animal {
    protected String name;
    protected int speed;

    public Animal() {
    }

    public Animal(String animalName, int speed) {
        this.name = animalName;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
