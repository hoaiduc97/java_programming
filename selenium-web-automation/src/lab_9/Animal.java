package lab_9;

import java.security.SecureRandom;

public class Animal {
    protected String name;
    protected int maxSpeed;
    protected boolean wings;

    public Animal(String name, int speed, boolean wings) {
        this.name = name;
        this.maxSpeed = speed;
        this.wings = wings;
    }
    public int speed(){
        return new SecureRandom().nextInt(maxSpeed);
    }
    public static class Builder{
        protected String name;
        protected int speed;
        protected boolean wings;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withSpeed(int maxSpeed){
            this.speed = maxSpeed;
            return this;
        }

        public Builder withWings(boolean wings){
            this.wings = wings;
            return this;
        }

        public Animal build(){
            return new Animal(name, speed, wings);
        }
    }

    public static class AnimalRace{
        public static void main(String[] args) {
            Animal Horse = new Builder()
                    .withName("Horse")
                    .withSpeed(75)
                    .withWings(false)
                    .build();
            Animal Tiger = new Builder()
                    .withName("Tiger")
                    .withSpeed(100)
                    .withWings(false)
                    .build();
            Animal Dog = new Builder()
                    .withName("Dog")
                    .withSpeed(60)
                    .withWings(false)
                    .build();
            Animal Falcon = new Builder()
                    .withName("Falcon")
                    .withSpeed(50)
                    .withWings(true)
                    .build();
            Animal animal[] = {Horse, Tiger, Dog, Falcon};

            int winnerSpeed = 0;
            Animal winner = null;
            for (Animal animalName : animal) {
                if(animalName.speed() > winnerSpeed && !animalName.wings){
                    winner = animalName;
                }
            }
            System.out.println("Winner is " + winner.name + " with speed is " + winner.speed());

        }
    }

}
