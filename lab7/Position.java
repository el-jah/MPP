public class Position
{
    private String title;
    private String description;
    Employee employee;


    public Position(String title, String description) {
        this.title = title;
        this.description = description;

    }

    public void print()
    {
        System.out.println(this);
        if(employee!=null)
        {
            employee.print();//delegation
        }
    }
    public double getSalary()
    {
        double salary=0;
        if(employee!=null)
        {
            salary=employee.getSalary();
        }
        return salary;
    }


    @Override
  public String toString()
  {
      return ("Position [ title " +title+" Description " + description+ "]" );

  }
}
