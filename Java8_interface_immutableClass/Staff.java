public class Staff extends Person {

    private double salary;


    public Staff(String name,String phone,int age,Double salary) {
        super.setAge(age);
        super.setName(name);
        super.setPhone(phone);
        this.salary=salary;
    }


    public double getSalary()
    {
      return salary;
    }

}
