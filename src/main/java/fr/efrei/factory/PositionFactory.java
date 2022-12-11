package fr.efrei.factory;

import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

public class PositionFactory {
    public static Position createPosition(String code, boolean open) {
        if (Helper.isNullOrEmpty(code))
            return null;

        Position pos = new Position.Builder().setCode(code)
                .setOpen(open)
                .build();

        return pos;
    }
}
