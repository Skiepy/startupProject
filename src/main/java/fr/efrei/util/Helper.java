package fr.efrei.util;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    public static int generateEmployeeID() {
        return ThreadLocalRandom.current().nextInt(202300000, 202399999);
    }
}
