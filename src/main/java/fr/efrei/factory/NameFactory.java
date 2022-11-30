package fr.efrei.factory;

import fr.efrei.domain.Name;
import fr.efrei.util.Helper;

public class NameFactory {
    public static Name createName(String firstName, String middleName, String lastName){
        if(Helper.isNullOrEmpty(firstName) ||
        Helper.isNullOrEmpty(middleName) ||
        Helper.isNullOrEmpty(lastName)){
            return null;
        }

        Name name = new Name.Builder().setFirstname(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
        return name;
    }

    public static Name createName(String firstName, String lastName){
        if(Helper.isNullOrEmpty(firstName) ||
                Helper.isNullOrEmpty(lastName)){
            return null;
        }

        Name name = new Name.Builder().setFirstname(firstName)
                .setLastName(lastName)
                .build();
        return name;
    }


}
