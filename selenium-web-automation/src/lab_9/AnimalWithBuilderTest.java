package lab_9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static lab_9.AnimalWithBuilder.Builder;
public class AnimalWithBuilderTest {
    public static void main(String[] args) {
        Builder builder = new Builder();
        AnimalWithBuilder horse = builder
                .setName("Horse")
                .setMaxSpeed(new SecureRandom().nextInt(75))
                .setWings(false)
                .build();


        AnimalWithBuilder tiger = builder
                .setName("Tiger")
                .setMaxSpeed(new SecureRandom().nextInt(100))
                .setWings(false)
                .build();

        AnimalWithBuilder falcon = builder
                .setName("Falcon")
                .setMaxSpeed(new SecureRandom().nextInt(60))
                .setWings(true)
                .build();


        List<AnimalWithBuilder> animalWithBuilderList = new ArrayList<>();
        animalWithBuilderList.add(tiger);
        animalWithBuilderList.add(horse);
        animalWithBuilderList.add(falcon);

        // Get non-flyable animals and store the result
        List<AnimalWithBuilder> nonFlyableAnimals = AnimalWithBuilderController.getNonFlyableAnimal(animalWithBuilderList);

        // Get the winner and store the result
        AnimalWithBuilder winner = AnimalWithBuilderController.getWinnerAnimal(nonFlyableAnimals);

        System.out.println("Winner is " + winner.getName() + " with speed:" + winner.getMaxSpeed());


    }
}
