package fr.efrei.factory;

import fr.efrei.domain.*;
import fr.efrei.util.Helper;

import java.util.UUID;

public class EmployeeFactory {
    public static Employee createEmployee(Name name, Gender gender, Race race, ContactDetails contactDetails, AddressDetails addressDetails, Identity identity){
        // No validation since every object has already been checked in its own factory class.

        // Creating a unique ID (letters and numbers) and then keeping only numbers
        int id = Helper.generateEmployeeID();

        if (name == null)
            return null; // By convention returning null if there is an issue
        if (gender == null)
            return null;
        if (race == null)
            return null;
        if (contactDetails == null)
            return null;
        if (addressDetails == null)
            return null;
        if (identity == null)
            return null;

        Employee employee = new Employee.Builder().setEmployeeNumber(id)
                .setName(name)
                .setGender(gender)
                .setRace(race)
                .setContactDetails(contactDetails)
                .setAddressDetails(addressDetails)
                .setIdentity(identity)
                .build();

        return employee;
    }

    public static Employee createEmployee(int id, Name name, Gender gender, Race race, ContactDetails contactDetails, AddressDetails addressDetails, Identity identity){
        // No validation since every object has already been checked in its own factory class.

        if (name == null)
            return null; // By convention returning null if there is an issue
        if (gender == null)
            return null;
        if (race == null)
            return null;
        if (contactDetails == null)
            return null;
        if (addressDetails == null)
            return null;
        if (identity == null)
            return null;

        Employee employee = new Employee.Builder().setEmployeeNumber(id)
                .setName(name)
                .setGender(gender)
                .setRace(race)
                .setContactDetails(contactDetails)
                .setAddressDetails(addressDetails)
                .setIdentity(identity)
                .build();

        return employee;
    }
}
