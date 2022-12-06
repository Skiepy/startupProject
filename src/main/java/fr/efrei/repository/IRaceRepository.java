package fr.efrei.repository;
import fr.efrei.domain.Race;
import java.util.List;

public interface  IRaceRepository extends IRepository<Race, String> {
    public List<Race> getAll();
}
