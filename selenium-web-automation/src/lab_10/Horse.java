package lab_10;

import java.security.SecureRandom;

public abstract class Horse extends Animal{
    final static int randomSpeed = new SecureRandom().nextInt(75);

    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    public Horse(){
        this.name = "Horse";
        this.speed = randomSpeed;
    }
}
