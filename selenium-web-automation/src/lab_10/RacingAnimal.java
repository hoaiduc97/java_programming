package lab_10;

import java.util.List;

public class RacingAnimal {
    public static Animal getWinnerAnimal(List<Animal> animalList){
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if(animal.speed > winner.speed){
                winner = animal;
            }
        }
        return winner;
    }


}
