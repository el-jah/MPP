import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String [] args)
    {//we have only two department
        Department d1=new Department("computer Science","McLaughlin");
        Department d2=new Department("software Engineering","virrehall");

        Position p1=new Position("lecturer","teach");
        Position p2=new Position("Prof","teach");

        d1.position.add(p1);
        d2.position.add(p2);

        Employee e1=new Employee("4383","joseph","Lerman","Lerman", LocalDate.now(),"1234",12);
        Employee e2=new Employee("4383","joseph","Lerman","Lerman", LocalDate.now(),"1234",13);

        p1.employee=(e1);
        p2.employee=(e2);

        Company c=new Company();

        c.department.add(d1);
        c.department.add(d2);

        System.out.println(c.getSalary());
        c.print();



    }

}
