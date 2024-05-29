package pro.sky;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("/max-salary")
    public Employee findEmployeeMaxSalary(@RequestParam int department) {
        return departmentService.findEmployeeMaxSalary(department);
    }

    ;

    @GetMapping("/min-salary")
    public Employee findEmployeeMinSalary(@RequestParam int department) {
        return departmentService.findEmployeeMinSalary(department);
    }

    ;

    @GetMapping(value = "/all", params = {"department"})
    public Collection<Employee> findEmployeesForDepartment(int department) {
        return departmentService.findEmployeesForDepartment(department);
    }

    ;

    @GetMapping("/all")
    public Map<Integer, List<Employee>> findEmployeesForDepartment() {
        return departmentService.findEmployeesForDepartment();
    }

    ;

}
