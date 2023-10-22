package lab_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingControllerTest {
    public static void main(String[] args) {
//        Animal horse = new Horse() {
//            @Override
//            public int getSpeed() {
//                return super.getSpeed();
//            }
//        };
//        Animal tiger = new Tiger() {
//            @Override
//            public int getSpeed() {
//                return super.getSpeed();
//            }
//        };
//        Animal dog = new Dog() {
//            @Override
//            public int getSpeed() {
//                return super.getSpeed();
//            }
//        };
        List<Animal> animalList = Arrays.asList(new Horse() {
            @Override
            public int getSpeed() {
                return super.getSpeed();
            }
        }, new Tiger() {
            @Override
            public int getSpeed() {
                return super.getSpeed();
            }
        }, new Dog() {
            @Override
            public int getSpeed() {
                return super.getSpeed();
            }
        });
        Animal winner = RacingAnimal.getWinnerAnimal(animalList);
        System.out.println("Winner is " + winner.name + " with speed: " + winner.speed);
    }
}
