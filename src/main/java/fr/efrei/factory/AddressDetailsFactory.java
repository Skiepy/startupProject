package fr.efrei.factory;

import fr.efrei.domain.AddressDetails;
import fr.efrei.util.Helper;

public class AddressDetailsFactory {
    public static AddressDetails createAddressDetails (String streetAddress, String postalAddress){
        if (Helper.isNullOrEmpty(streetAddress) || Helper.isNullOrEmpty(postalAddress))
            return null;

        AddressDetails addressDetails = new AddressDetails.Builder().setStreetAddress(streetAddress)
                .setPostalAddress(postalAddress)
                .build();

        return addressDetails;
    }
}
