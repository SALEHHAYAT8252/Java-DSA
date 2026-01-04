/*Copy Constructor
Create a Student class.
Initialize one object using another object.

Constructor Chaining
Use one constructor to call another using this().
*/
public class CopyConstructor {
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2 = new Student(s1);
        s2.getData();
    }
}


class Student{
    String name ;
    String course;
    int roll;

    Student(){

        this("John","MCA",14);
    }
    Student(Student s1){
        // this();

        //Second Method
        this.name=s1.name;
        this.course=s1.course;
        this.roll=s1.roll;
    }

    Student(String name,String course,int roll){
        this.name=name;
        this.roll=roll;
        this.course=course;
    }


    public void getData(){
        System.out.println("Name : "+name+"\nRoll "+roll+"\nCourse "+course);
    }

}