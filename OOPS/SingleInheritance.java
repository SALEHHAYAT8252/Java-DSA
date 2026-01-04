//Constructor chaining to call parent class constructor using super()
public class SingleInheritance {
    public static void main(String[] args) {
        // Fish f = new Fish();
        // f.getInfo();

        Student s= new Student();
        s.getInfo();
    }
}

class Animal{
    String name;
    String color;
    int weight;

    Animal(String name,String color,int weight){
        this.name=name;
        this.color=color;
        this.weight=weight;
    }

    public void eat(){
        System.out.println("Aniaml Eat ");
    }

    public void breath(){
        System.out.println("Aniaml breath ");
    }  

    public void getInfo(){
        System.out.println("Name : "+name+"\nColor"+color+"\nWeight"+weight);
    }
}

class Fish extends Animal{

    Fish(){
        super("Golden Fish","Golden",2);
    }
    public void swim(){
        System.out.println("Fish Swim ");
    }

    @Override
    public void getInfo() {
        super.getInfo();
        breath();
    }
}


class Person{
    String name;
    String PAN;
    String role;
    String education;
    
    Person(){
        System.out.println("I am Parent");
    }
    Person(String name,String PAN,String role,String education){
        this.name=name;
        this.PAN=PAN;
        this.role=role;
        this.education = education;
    }

    public void getInfo(){
        System.out.println("Name : "+name+"\nPAN : "+PAN+"\nRole : "+role+"\nEducation : "+education);
    }

    
}


class Student extends Person{
        String roll;
        String course;

        Student(){
            this("4","MCA");
        }

        Student(String roll,String course){
            // super("raj","JQT78IP","student","MCA Persuing");
            // this.roll=roll;
            // this.course=course;
        }

        
        @Override
        public void getInfo(){
            super.getInfo();
            System.out.println("Roll : "+roll+"\nCourse : "+course);

        }
    }