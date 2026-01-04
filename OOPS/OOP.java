public class OOP{
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
    }
}


class Student{
    String name;
    int age;

    
    Student(){
        this.name="";
        this.age=0;
    }
    
    public void getData(){
       System.out.println("Name : "+name);
       System.out.println("Age : "+age);
    }

    public void setData(String name,int age){
            this.name=name;
            this.age=age;
    }
}
