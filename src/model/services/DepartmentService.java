package model.services;

import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        List<Department> list = new ArrayList<>();
        list.add(new Department(1, "Book"));
        list.add(new Department(1, "Computer"));
        list.add(new Department(1, "Electronic"));
        list.add(new Department(1, "Sport"));
        return list;
    }

}
