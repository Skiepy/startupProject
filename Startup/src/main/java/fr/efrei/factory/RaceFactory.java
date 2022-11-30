package fr.efrei.factory;
import fr.efrei.domain.Race; //alt+enter
import fr.efrei.util.Helper;

public class RaceFactory {
    public static Race createRace(String description) {
        String id = Helper.generateID();

        if (Helper.isNullOrEmpty(description))
            return null;

        Race race = new Race.Builder().setId(id)
                .setDescription(description)
                .build();
        return race;
    }
}
