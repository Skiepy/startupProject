package fr.efrei.repository;

import fr.efrei.domain.Gender;

import java.util.ArrayList;
import java.util.List;

public class GenderRepository implements IGenderRepository{

    private static GenderRepository repository = null;
    private List<Gender> genderDB = null;

    private GenderRepository() { genderDB = new ArrayList<>(); }

    public static GenderRepository getGenderDB() {
        if (repository == null) {
            return new GenderRepository();
        } else {
            return repository;
        }
    }

    @Override
    public List<Gender> getAll() {
        return genderDB;
    }

    @Override
    public Gender create(Gender gender) {
        boolean sucess = genderDB.add(gender);
        if (sucess)
            return gender;
        return null;
    }

    @Override
    public Gender read(String s) {
        for (Gender g : genderDB) {
            if (g.getId().equals(s))
                return g;
        }
        return null;
    }

    @Override
    public Gender update(Gender gender) {
        Gender oldGender = read(gender.getId());
        if (gender != null) {
            genderDB.remove(oldGender);
            genderDB.add(gender);
            return gender;
        }
        return null;
    }

    @Override
    public boolean delete(String i) {
        Gender genderToDelete = read(i);
        if (genderToDelete == null)
            return false;

        return true;
    }
}
