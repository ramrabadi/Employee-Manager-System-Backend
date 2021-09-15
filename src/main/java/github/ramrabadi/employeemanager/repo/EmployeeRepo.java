package github.ramrabadi.employeemanager.repo;

import github.ramrabadi.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    // Query method in Spring
    Optional<Employee> findEmployeeById(Long id);
}
