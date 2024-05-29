package pro.sky;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface DepartmentService {
    Employee findEmployeeMaxSalary(int department);
    Employee findEmployeeMinSalary(int department);
    Collection<Employee> findEmployeesForDepartment(int department);
    Map<Integer, List<Employee>> findEmployeesForDepartment();


}
