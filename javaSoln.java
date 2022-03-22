import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution
{

 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  Faculty f[]=new Faculty[n];
  for(int i=0;i<n;i++){
      int id=sc.nextInt();
      sc.nextLine();
      String name=sc.nextLine();
      double salary=sc.nextDouble();
      sc.nextLine();
      String designation=sc.nextLine();
      int age=sc.nextInt();
      sc.nextLine();
      String stream=sc.nextLine();
      f[i]=new Faculty(id, name, salary, designation, age, stream);
  }
  String name=sc.nextLine();
  double aveAge=findAverageAgeOfFaculty(f);
  if(aveAge==0)System.out.println("No Faculty found with mentioned attribute");
  else System.out.println("Average of age "+aveAge);
  
  Faculty ff=searchFacultyByName(f, name);
  if(ff==null)System.out.println("No Faculty found with mentioned attribute");
  else System.out.println(ff.toString());
  
  
 }

public static double findAverageAgeOfFaculty(Faculty[] faculty)
  {
      int count=0;
   int sum=0;
   for(Faculty i : faculty){
       count++;
       sum+=i.getAge();
   }
   return (double)sum/(count*1.0);
  }
public static Faculty searchFacultyByName(Faculty[] faculty, String name)
  {
      Faculty f=null;
    for(Faculty i : faculty){
    //    count++;
    if(i.getName().equalsIgnoreCase(name))
       f=i;
   }
   return f;
  }
}
class Faculty
{
  int id;
  String name;
  double salary;
  String designation;
  int age;
  String stream;
  
   
    public Faculty(int id, String name, double salary, String designation, int age, String stream) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.age = age;
        this.stream = stream;
    }
    
    @Override
    public String toString() {
        return "id-" + id + "\nname-" + name + "\nsalary-" + salary + "\ndesignation-" + designation + "\nage-"
                + age + "\nstream-" + stream;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getStream() {
        return stream;
    }
    public void setStream(String stream) {
        this.stream = stream;
    }
        
      
    
  
}