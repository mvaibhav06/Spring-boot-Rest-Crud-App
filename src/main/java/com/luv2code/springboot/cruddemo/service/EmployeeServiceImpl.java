package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO dao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        dao = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return dao.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return dao.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        dao.deleteByid(theId);
    }
}
