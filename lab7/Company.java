import java.util.ArrayList;

public class Company {

    private String name;
    ArrayList<Department> department;


    public Company() {
      this.name="IBM";
        department=new ArrayList<Department>();
    }

    public void print()
    {
        System.out.println(this);

        for(Department d:department)
        {
            d.print();
        }

    }

    public double getSalary()
    {
        double salary=0;
        for(Department d:department)
        {

              salary +=d.getSalary();

        }
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return ("Company [ Name  " +name+"]");
    }
}
