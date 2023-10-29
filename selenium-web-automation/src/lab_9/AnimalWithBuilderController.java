package lab_9;

import java.util.ArrayList;
import java.util.List;

public class AnimalWithBuilderController {

    public static List<AnimalWithBuilder> getNonFlyableAnimal(List<AnimalWithBuilder> animalWithBuilder) {
        List<AnimalWithBuilder> nonFlyable = new ArrayList<>();
        for (AnimalWithBuilder animal : animalWithBuilder) {
            if(!animal.isWings()){
                nonFlyable.add(animal);
            }
        }
        return nonFlyable;
    }

    public static AnimalWithBuilder getWinnerAnimal(List<AnimalWithBuilder> animalWithBuilderList){
        AnimalWithBuilder winner = animalWithBuilderList.get(0);
        for (AnimalWithBuilder animalWithBuilder : animalWithBuilderList) {
            if(animalWithBuilder.getMaxSpeed() > winner.getMaxSpeed()){
                winner = animalWithBuilder;
            }
        }
        return winner;
    }

}
