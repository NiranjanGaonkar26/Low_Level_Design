package DAO;

import DO.EmployeeDo;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void createEmployee(String userType, EmployeeDo employee) throws Exception{
        System.out.println("Creating an employee in the DB......");
    }

    @Override
    public EmployeeDo getEmployee(String userType, String id) throws Exception{
        System.out.println("Fetching an employee with id "+id+" from the DB......");
        return null;
    }

    @Override
    public void deleteEmployee(String userType, String id) throws Exception{
        System.out.println("Deleting an employee with id "+id+" from the DB......");
    }
}
