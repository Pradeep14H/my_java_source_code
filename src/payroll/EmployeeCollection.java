package payroll;
import java.util.*;
public class EmployeeCollection {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub

 

        ArrayList<Employee> employeeList=new ArrayList<Employee>();
        //Employee obj1=new Employee("Peter","Sales");

        employeeList.add(new Employee("Peter","Sales"));
        employeeList.add(new Employee("Sam","Accounts"));
        employeeList.add(new Employee("Michel","Training"));
        employeeList.add(new Employee("Mathew","Marketing"));

        Iterator<Employee> employeeiterator=employeeList.iterator();
        while(employeeiterator.hasNext())
        {
            Employee e=employeeiterator.next();
            System.out.println(e);
        }

    }

 

}