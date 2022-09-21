//Implementation of inheriatnce in java
//Our example is based on the student relationship in a University
//This is because we have general details of students, but students can take different courses in a University
//Our student class is within the Java_summative package
package Java_summative;
//We shall then create the student class

public class student {
    //We then initialize the variables for our constructor
    final String first_name;
    final String last_name;
    final int age;
    final String admission_number;
    //We then define our constructor
    public student(String first_name,String last_name,int age,String admission_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.admission_number = admission_number;
    }
    //We then implement the student details method
    public void student_details(){
        System.out.println("Firstname:"+this.first_name);
        System.out.println("Lastname:"+this.last_name);
        System.out.println("Age:"+this.age);
        System.out.println("Admission Number:"+this.admission_number);



    }
}

//We then create the computer science class that inherit from students
class computer_science extends student{
    //We shall maintain the variables in student class and add the course variable
    String course;
    //we then redefine the constructor and add the extra variable

    public computer_science(String first_name, String last_name, int age, String admission_number) {
        super(first_name, last_name, age, admission_number);
        this.course="Bachelor of Science in Computer Science";
    }
    //We then redefine the student_details method and add the printing of the extra variable
    public void student_details(){
        System.out.println("Firstname:"+this.first_name);
        System.out.println("Lastname:"+this.last_name);
        System.out.println("Age:"+this.age);
        System.out.println("Admission Number:"+this.admission_number);
        System.out.println("Course:"+this.course);



    }

}
//We then implement the both classes in the main class within the main method
class Main{
    public static void main(String[] args){
        // We first create an instance of the student
        student student1=new student("Samuel","Wanza",21,"14452");
        //we then call the student_details method on the instance
        student1.student_details();
        System.out.println("-------------------------------------------------------------------");
        //We create an instance of computer_science
        computer_science cs=new computer_science("Amos","Mwangi",23,"6754324");
        //We then call the student_details method on it
        cs.student_details();
    }


}
