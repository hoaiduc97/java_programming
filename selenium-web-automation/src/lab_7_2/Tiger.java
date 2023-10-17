package lab_7_2;

import java.security.SecureRandom;

public class Tiger extends Animal {
    final static int randomSpeed = new SecureRandom().nextInt(100);

    public Tiger() {
        this.name = "Tiger";
        this.speed = randomSpeed;
    }
}
