package student;

public class HostelStudent extends RegularStudent{
    String hostel_name;
    public HostelStudent(int RollNo,String Name,String Department,char Section , int attend_per , String class_room, String hostel_name){
        super(RollNo , Name ,Department ,Section, attend_per,class_room);
        this.hostel_name = hostel_name; 
    }
}
