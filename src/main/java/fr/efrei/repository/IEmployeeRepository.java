package fr.efrei.repository;
import fr.efrei.domain.Employee;
import java.util.List;

public interface IEmployeeRepository extends IRepository<Employee, Integer> {
    public List<Employee> getAll();
}
