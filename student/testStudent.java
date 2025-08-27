package student;

public class testStudent {
    public static void main(String[] args) {
        Student student1 = new Student(1 , "Rohan" , "AI" , 'C');
        Student student2 = new Student();
        Student student3 = new Student(student1);

        RegularStudent rs = new RegularStudent(2,"Jerry","AIML",'B', 80,"H506");
        rs.displayInfo();
        

    }
}

