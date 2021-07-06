import java.util.ArrayList;

public class Department {

private String name;
private ArrayList<Person> person;

    public Department(String name) {
        this.name = name;
        person=new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson() {
        return person;
    }

    public void setPerson(ArrayList<Person> person) {
        this.person = person;
    }

    public double getTotalSalary()
    {
        double salary=0;
        for(Person p:person)
        {
            salary+=p.getSalary();

        }
        return salary;

    }



    public void showAllMembers()
    {
        System.out.println(person);
    }

    public void addPerson(Person per)
    {
        person.add(per);
    }


    public void unitsPerFaculty() {

        int temp=0;
        for(Person p:person)
        {
            if(p instanceof Faculty)
            {
                Faculty f1=(Faculty)p;

                temp=f1.getTotalUnits();
                System.out.println(p.getName() +" "+ temp);
            }

        }


    }

}
