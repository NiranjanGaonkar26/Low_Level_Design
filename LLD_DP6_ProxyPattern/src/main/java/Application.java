import DAO.EmployeeDao;
import DAO.EmployeeDaoProxy;
import DO.EmployeeDo;

public class Application {
    public static void main(String[] args) {
        EmployeeDao empDao = new EmployeeDaoProxy();
        EmployeeDo empObj = new EmployeeDo();

        try {
            empDao.createEmployee("USER", empObj);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
