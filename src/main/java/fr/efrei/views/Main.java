package fr.efrei.views;

import fr.efrei.domain.Race;
import fr.efrei.factory.RaceFactory;
import fr.efrei.repository.RaceRepository;

public class Main {
    public static RaceRepository repository = RaceRepository.getRepository();

//   public static void loadObjects(){
//         Race race1 = RaceFactory.createRace("Indian");
//         Race race3 = RaceFactory.createRace("SpaceMan");
//         repository.create(race1);
//         repository.create(race2);
//         repository.create(race3);
//     }  

    public static void main(String[] args) {
        new Menu().loadMenu();
    }
}
