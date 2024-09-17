package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.listAllEmployees());
        return "employees";
    }

    @PostMapping("/employee/add")
    @PreAuthorize("hasRole('MANAGER')")
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employees";
    }

    @PostMapping("/employee/delete/{id}")
    @PreAuthorize("hasRole('MANAGER')")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees";
    }
}