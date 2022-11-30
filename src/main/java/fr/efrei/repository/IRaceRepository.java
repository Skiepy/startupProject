package fr.efrei.repository;
import fr.efrei.domain.Race;
import java.util.List;

public interface IRaceRepository extends IRepository<Race, String> {
    // create, read, update, delete

    public List<Race> getAll();
}
