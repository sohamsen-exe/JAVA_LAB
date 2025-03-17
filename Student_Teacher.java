import java.io.*;
public class Student_Teacher {
    int id;
    String name;
}
class student{
    int id = 10;
    String name = "Soham";
    void fun(){
        System.out.println("\nStudent");
    }
}
class Main_st{
    public static void main(String[] args){
        Student_Teacher s = new Student_Teacher();
        s.id = 101;
        s.name = "Sen";
        System.out.println(s.id);
    }
}