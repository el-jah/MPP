import java.time.LocalDate;
import java.util.GregorianCalendar;

public class StaffStudents extends Staff{



    private Students students;
    private GregorianCalendar startDateOfCourse;
    public StaffStudents(String name, String phone, int age, Double salary,int day,int month,int year,double gpa) {
        super(name, phone, age, salary);
        students=new Students(name,phone,age,gpa);
        startDateOfCourse=new GregorianCalendar(day,month,year);

    }

    public void addCourse(Course c)
    {
        students.addCourse(c);
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public GregorianCalendar getStartDateOfCourse() {
        return startDateOfCourse;
    }

    public void setStartDateOfCourse(GregorianCalendar startDateOfCourse) {
        this.startDateOfCourse = startDateOfCourse;
    }

    public GregorianCalendar startDate()
    {
        return startDateOfCourse;
    }
}
