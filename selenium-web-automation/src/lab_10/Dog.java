package lab_10;

import java.security.SecureRandom;

public abstract class Dog extends Animal {

    final static int randomSpeed = new SecureRandom().nextInt(60);

    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    public Dog() {
        this.name = "Dog";
        this.speed = randomSpeed;
    }
}
