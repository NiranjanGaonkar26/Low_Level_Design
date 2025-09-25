package DAO;

import DO.EmployeeDo;

public interface EmployeeDao {
    void createEmployee(String userType, EmployeeDo employee) throws Exception;
    EmployeeDo getEmployee(String userType, String id) throws Exception;
    void deleteEmployee(String userType, String id) throws Exception;
}
