import java.util.ArrayList;
import java.util.List;

public class Students extends Person {

    private double Gpa;
    ArrayList<Course> cours;
    public Students(String name,String phone,int age,double Gpa) {
        super.setAge(age);
        super.setName(name);
        super.setPhone(phone);
        this.Gpa=Gpa;
        cours =new ArrayList<>();

    }

    public List<Course> getCourseTaken()
    {
        return cours;
    }
    public void addCourse(Course c)
    {
        cours.add(c);
    }

    public double getGpa() {
        return Gpa;
    }

    public void setGpa(double gpa) {
        Gpa = gpa;
    }

    public int getTotalUnit()
    {
        int Unit=0;
        for(Course c: cours)
        {
            Unit+=c.getUnit();
        }
        return Unit;

    }

}
