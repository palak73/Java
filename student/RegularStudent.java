package student;

public class RegularStudent extends Student {
    int attend_per ;
    String class_room;
    
    public RegularStudent(int RollNo,String Name,String Department,char Section , int attend_per , String class_room){
        super(RollNo , Name ,Department ,Section);
        this.attend_per = attend_per;
        this.class_room = class_room;
    }
    public RegularStudent(){
        
    }
    public void submitAssignment(){  
        System.out.println("The student have submitted the assignment in hard copy");
    }
    public void payFee(){
        System.out.println("The student in class room"+ class_room +"has submitted the tution fee + platform fee");
    }
}
