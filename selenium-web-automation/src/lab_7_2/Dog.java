package lab_7_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    final static int randomSpeed = new SecureRandom().nextInt(60);

    public Dog() {
        this.name = "Dog";
        this.speed = randomSpeed;

    }
}
