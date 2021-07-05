import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DepartmentApplication {




  public static void putText(String s) //writes string s to the screen
  {
    System.out.println(s);
  }
  // -------------------------------------------------------------
  public static String getString() throws IOException  //reads a string from the keyboard input
  {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    String s = br.readLine();
    return s;
  }
  // -------------------------------------------------------------
  public static char getChar() throws IOException //reads a character from the keyboard input
  {
    String s = getString();
    return s.charAt(0);
  }

  //-------------------------------------------------------------
  public static int getInt() throws IOException // reads an integers from the keyboard input
  {
    String s = getString();
    return Integer.parseInt(s);
  }


    public static void main(String [] args) throws IOException {
      Department dept=new Department("Computer Science");

      //creating courses

      Course cs201 = new Course("cs201","programming",4);
      Course cs360 = new Course("cs360","database",3);
      Course cs404 = new Course("cs404","compiler",4);
      Course cs240 = new Course("cs240","datastructure",2);
      Course cs301 = new Course("cs301","Software engg",3);
      Course cs450 = new Course("cs450","Advanced architecture",5);


      //creating faculty
        Person frankMoore = new Faculty("Frank Moore","472-5921",43,10);
        Person samHoward = new Faculty("SamHoward","472-7222",55,2);
        Person johnDoodle = new Faculty("John Doodle","472-6190",39,3);

        dept.addPerson (frankMoore);
        dept.addPerson(samHoward);
        dept.addPerson(johnDoodle);



     //creating student object

        Person johnDoe = new Students("John Doe","472-1121",22,4.0);
        Person maryJones = new Students("Mary Jones","472-7322",32,3.80);
        Person leeJohnson = new Students("Lee Johnson","472-6009",19,3.65);

        dept.addPerson (johnDoe);
        dept.addPerson(maryJones);
        dept.addPerson(leeJohnson);



     // Create staff objects
        Person frankGore = new Staff("Frank Gore","472-3321",33, 5.0);
        Person adamDavis = new Staff("Adam Davis","472-7552",50, 5.0);
        Person davidHeck = new Staff("David Heck","472-8890",29, 5.0);
        dept.addPerson (frankGore);
        dept.addPerson(adamDavis);
        dept.addPerson(davidHeck);

      System.out.println(dept.getTotalSalary());

     //creating cours


      Faculty fr = (Faculty) frankMoore;
      fr.addCourse(cs450);
      Faculty sam = (Faculty) samHoward;
      sam.addCourse(cs301);
      sam.addCourse(cs360);
      Faculty john = (Faculty) johnDoodle;
      john.addCourse(cs201);
      john.addCourse(cs404);
      john.addCourse(cs240);

     dept.unitsPerFaculty();


      Students johnD = (Students) johnDoe;
      johnD.addCourse(cs201);
      johnD.addCourse(cs360);

      Students maryjones = (Students) maryJones;

      maryjones.addCourse(cs404);
      maryjones.addCourse(cs450);
      Students leejoh = (Students) leeJohnson;
      leejoh.addCourse(cs201);

      leejoh.addCourse(cs240);




       //===========================Level 2======================================

      Person st1 = new StaffStudents("ela", "64156363", 34, 300.0, 11, 5, 2, 4.0);
      Person st2 = new StaffStudents("abebe", "641898390", 34, 5000.0, 11, 3, 1, 3.6);

      dept.addPerson(st1);
      dept.addPerson(st2);

      StaffStudents s1=(StaffStudents) st1;
      StaffStudents s2=(StaffStudents) st2;

      s1.addCourse(cs301);

      s2.addCourse(cs360);

//====================level 3======================================


      Scanner sn=new Scanner(System.in);

      System.out.println("Enter Faculity name");
      String Fname=sn.nextLine();

      ArrayList<Person> person=new ArrayList<>();
      Iterator<Person> it1=dept.getPerson().iterator();//hold all person
      while(it1.hasNext())
      {
        Person p=it1.next();
        if(p.getName().equals(Fname) && p instanceof Faculty)
        {
          Faculty f=(Faculty) p;
          Iterator<Course> it2=f.getCourses().iterator();
          while(it2.hasNext())
          {
            Course fc=it2.next();
            Iterator<Person> it3=dept.getPerson().iterator();
            while(it3.hasNext())
            {
              Person pr=it3.next();
              if(pr instanceof Students)
              {
                Students st=(Students) pr;
                Iterator<Course> it4=st.getCourseTaken().iterator();
                while(it4.hasNext())
                {
                  Course Sc=it4.next();
                  if(fc.getNumber().equals(Sc.getNumber()))
                  {
                    person.add(st) ;//if the course number is the same add student in to list.
                  }
                }

              }

            }

          }

        }




      }


   for(Person p:person)
   {
     System.out.println(p.getName());
   }



















































//      double totsalary = 0;
//
//      while(true)
//      {
//        putText("Enter first letter of ");
//        putText("getTotalSalary, showAllMembers, unitsPerFaculty or quit : ");
//        int choice = getChar();
//        switch(choice)
//        {
//          case 'g':
//            totsalary=dept.getTotalSalary();
//            putText("Total sum of all salaries is:");
//            putText(String.valueOf(totsalary)+"\n");
//            break;
//          case 's':
//            dept.showAllMembers();
//            break;
//          case 'u':
//            dept.unitsPerFaculty();
//            break;
//          case 'q': return;
//          default:
//            putText("Invalid entry\n");
//        }  // end switch
//      }  // end while
    }  // end main()
// -------------------------------------------------------------


}


