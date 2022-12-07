package fr.efrei.factory;

import fr.efrei.domain.ContactDetails;
import fr.efrei.util.Helper;

public class ContactDetailsFactory {
    public static ContactDetails createContactDetails(String cellPhoneNumber, String homeNumber, String email){
        if (Helper.isNullOrEmpty(cellPhoneNumber)
                || Helper.isNullOrEmpty(homeNumber)
                || Helper.isNullOrEmpty(email))
            return null;

        ContactDetails contactDetails = new ContactDetails.Builder().setCellPhoneNumber(cellPhoneNumber)
                .setHomeNumber(homeNumber)
                .setEmail(email)
                .build();

        return contactDetails;
    }

    public static ContactDetails createContactDetails(String cellPhoneNumber, String email){
        if (Helper.isNullOrEmpty(cellPhoneNumber) || Helper.isNullOrEmpty(email))
            return null;

        ContactDetails contactDetails = new ContactDetails.Builder().setHomeNumber(cellPhoneNumber)
                .setEmail(email)
                .build();

        return contactDetails;
    }

}
