package lab_7_2;

import java.security.SecureRandom;

public class Horse extends Animal {
    final static int randomSpeed = new SecureRandom().nextInt(75);

    public Horse() {
        this.name = "Horse";
        this.speed = randomSpeed;
    }
}
