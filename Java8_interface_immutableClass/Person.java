import java.util.ArrayList;

public class Person implements IPerson {

    private String name;
    private int age;
    private String phone;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public double getSalary()
    {
        return 0;
    }//this is for student coz students have not salary.

    public String toString()
    {
        return "name: "+name+" age: "+age+" phone: "+phone;
    }



    @Override
    public void abstractMethod() {
        System.out.println("this is abstract method");
    }



}

