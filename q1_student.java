import java.io.*;
class student{
    int rollNo;
    String name;
    String className;
    double percentage;
    public void studentInfo(){
        System.out.println("\n********Student Info********\n");
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+rollNo);
        System.out.println("Student Class: "+className);
        System.out.println("Student percentage: "+percentage);
    }
}    
class q1_student{    
    public static void main(String args[])throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        student getStudent = new student();
        System.out.print("Enter Student Name: ");
        getStudent.name = reader.readLine();
        
        System.out.print("Enter Student Roll Number: ");
        getStudent.rollNo = Integer.parseInt(reader.readLine());

        System.out.print("Enter Student Class: ");
        getStudent.className = reader.readLine();

        System.out.print("Enter Student Percentage: ");
        getStudent.percentage = Double.parseDouble(reader.readLine());

        getStudent.studentInfo();
    }
}
