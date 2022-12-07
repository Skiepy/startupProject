package fr.efrei.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String s) {
        return s == null || (s.isEmpty());
    }

    public static String generateID(){
        return UUID.randomUUID().toString();
    }

    public static int generateEmployeeID() {
        String str = generateID();
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return Integer.parseInt(str);
    }
}
