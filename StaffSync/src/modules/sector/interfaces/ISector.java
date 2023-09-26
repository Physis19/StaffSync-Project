package modules.sector.interfaces;

import java.util.List;

import modules.employee.Employee;

public interface ISector {
    String getId();
    void setId(String id);

    String getName();
    void setName(String name);

    List<Employee> getEmployees();
    void setEmployees(List<Employee> employees);

    String getDescription();
    void setDescription(String description);
}