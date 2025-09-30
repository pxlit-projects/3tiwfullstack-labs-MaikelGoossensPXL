package be.pxl.services.services;

import be.pxl.services.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }
}
