package DAO;

import DO.EmployeeDo;

public class EmployeeDaoProxy implements EmployeeDao{

    EmployeeDaoImpl employeeDao;

    public EmployeeDaoProxy(){
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void createEmployee(String userType, EmployeeDo employee) throws Exception{
        if(userType.equals("ADMIN")){
            employeeDao.createEmployee(userType, employee);
        }
        else{
            throw new Exception("ERROR: Unauthorized action detected, Access denied");
        }
    }

    @Override
    public EmployeeDo getEmployee(String userType, String id) throws Exception{
        if(userType.equals("ADMIN")){
            return employeeDao.getEmployee(userType, id);
        }
        else {
            throw new Exception("ERROR: Unauthorized action detected, Access denied");
        }
    }

    @Override
    public void deleteEmployee(String userType, String id) throws Exception{
        if(userType.equals("ADMIN")){
            employeeDao.deleteEmployee(userType, id);
        }
        else {
            throw new Exception("ERROR: Unauthorized action detected, Access denied");
        }
    }
}
