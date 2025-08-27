package student;

public class Student{
    public int RollNo;
    String Name;
     protected String Department;
    protected char Section;
    static String collegeName="KIET"; //class variable

    public Student(int RollNo,String Name,String Department,char Section)
    {
        this.RollNo=RollNo;
        this.Name=Name;
        this.Department=Department;
        this.Section=Section;
    }

    public Student()
    {
        this.RollNo=1;
        this.Name="Khushi";
        this.Department="CSEAI";
        this.Section='C';
    }

    public Student(Student obj)
    {
        this.RollNo=obj.RollNo;
        this.Name=obj.Name;
        this.Department=obj.Department;
        this.Section=obj.Section;
    }

    public void studying(int no_of_hours){
        System.out.println("The student is studying for "+no_of_hours+" hours");
    }
    public void displayInfo(){
        System.out.println("The name of the student is "+Name+ " The college name is "+collegeName);
        System.out.println("The department is"+Department+"the section is"+Section);
    }
    public void playing(){
        System.out.println("Student is playing");
    }

    public void payFee(){
        System.out.println("The student"+Name +"has paid the tution fee" );
    }
   
}