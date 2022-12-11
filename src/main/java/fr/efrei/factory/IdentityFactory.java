package fr.efrei.factory;

import fr.efrei.domain.Identity;
import fr.efrei.util.Helper;

public class IdentityFactory {
    public static Identity createIdentity(String identityType, String indentityValue){

        if (Helper.isNullOrEmpty(identityType) || Helper.isNullOrEmpty(indentityValue))
            return null;

        Identity identity = new Identity.Builder().setIdentityType(identityType)
                .setIdentityValue(indentityValue)
                .build();

        return identity;
    }
}
