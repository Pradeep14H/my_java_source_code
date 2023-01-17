package payroll;
import java.util.*;
public class EmployeeMapCollection {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

        
        Map<String ,Employee> employeemap=new HashMap();
        employeemap.put("E001", new Employee("Peter","Sales"));
        employeemap.put("E002",new Employee("Sam","Training"));
        employeemap.put("E003",new Employee("Michel","Marketing"));

        for(Map.Entry<String,Employee> e:employeemap.entrySet())
        {
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }

 

}