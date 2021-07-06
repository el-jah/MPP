import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person {

    private double salary;
    ArrayList<Course> course;

    public Faculty(String name,String phone,int age,double salary) {
        super.setAge(age);
        super.setName(name);
        super.setPhone(phone);
        this.salary=salary;
        course =new ArrayList<Course>();
    }

    public void addCourse(Course c)
    {
        course.add(c);
    }
    public List<Course> getCourses()
    {
        return course;
    }


    public double getSalary()
    {
        return salary;
    }


    public int getTotalUnits()
    {
        int Unit=0;
        for(Course c:course)
        {
                Unit+=c.getUnit();

        }

        return Unit;
    }
}

