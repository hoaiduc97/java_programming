package lab_10;

import java.security.SecureRandom;

public abstract class Tiger extends Animal {
    final static int randomSpeed = new SecureRandom().nextInt(100);


    @Override
    public int getSpeed() {
        return randomSpeed;
    }

    public Tiger() {
        this.name = "Tiger";
        this.speed = randomSpeed;
    }
}
