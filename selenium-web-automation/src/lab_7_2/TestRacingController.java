package lab_7_2;

import java.util.Arrays;
import java.util.List;

public class TestRacingController {
    public static void main(String[] args) {
        List<Animal> animalList = Arrays.asList(new Horse(), new Tiger(), new Dog());
        Animal winner = RacingController.getWinnerAnimal(animalList);
        System.out.println("Winner is " + winner.getName());
        System.out.println("With speed " + winner.getSpeed());
    }
}
