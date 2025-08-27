package student;

public class onlineStudent extends Student{
    int platform_fee;
    String platform;

        public onlineStudent(int RollNo,String Name,String Department,char Section, int platform_fee , String platform){
            super(RollNo , Name ,Department ,Section);
            this.platform_fee = platform_fee;
            this.platform = platform;  
        }
        public void PlatformFee(){  
        System.out.println("The student have submitted the platform fee.");
    }

    public void payFee(){
        System.out.println("fee submitted");
    }
}
