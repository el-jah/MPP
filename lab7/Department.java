import java.util.ArrayList;

public class Department
{
  private String name;
  private String Location;
  ArrayList<Position> position;

    public Department(String name,String Location) {
        this.Location=Location;
        this.name=name;
        position=new ArrayList<Position>();
    }

    public void print()
    {
        System.out.println(this);
        for(Position p:position)
        {
            p.print();
        }
    }

    public double getSalary()
    {
        double salary=0;

        for(Position p:position)
        {

              salary += p.getSalary();

        }
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return ("Department [ Name " +name+" Location " + Location+ "]" );
    }
}
