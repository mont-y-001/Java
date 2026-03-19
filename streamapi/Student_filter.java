package streamapi;
import java.util.*;
import java.beans.Statement;
import java.util.ArrayList;
class Stud{
    private int sid;
    private String name;
    private int marks;

    Stud(int sid,String name,int marks){
        super();
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }
    public int getid(){
        return sid;
    }
    public void setsid(int sid){
        this.sid = sid;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getmarks(){
        return marks;
    }
    public void setmarks(int marks){
        this.marks = marks;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
public class Student_filter {
    public static void main(String[] args) {
        ArrayList<Stud> list = new ArrayList<Stud>();
        list.add(new Stud(1,"Student 1",60));
        list.add(new Stud(2,"Student 2",40));
        list.add(new Stud(3,"Student 3",45));
        list.add(new Stud(4,"Student 4",75));
        list.add(new Stud(1,"Student 5",90));
        List<Stud> g60 = list.stream().
        filter(student->student.getmarks()>60).
        toList();
        g60.stream().forEach(System.out::println);
    }
}
