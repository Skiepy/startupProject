package fr.efrei.repository;

import fr.efrei.domain.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{

    private static EmployeeRepository repository = null;
    private List<Employee> employeeDB = null;

    private EmployeeRepository() { employeeDB = new ArrayList<>(); }

    public static EmployeeRepository getRepository() {
        if (repository == null)
            return new EmployeeRepository();
        return repository;
    }

    @Override
    public List<Employee> getAll() {
        return employeeDB;
    }

    @Override
    public Employee create(Employee employee) {
        boolean sucess = employeeDB.add(employee);
        if (sucess)
            return employee;
        return null;
    }

    @Override
    public Employee read(Integer integer) {
        for (Employee e: employeeDB) {
            if (e.getEmployeeNumber() == integer)
                return e;
        }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if (employee != null) {
            employeeDB.remove(oldEmployee);
            employeeDB.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(Integer i) {
        Employee employeeToDelete = read(i);
        if (employeeToDelete == null)
            return false;
        employeeDB.remove(employeeToDelete);
        return true;
    }
}
