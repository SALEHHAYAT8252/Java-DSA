public class MultiLevelInheritance {
    public static void main(String[] args) {
        GraduateStudent gs=new GraduateStudent();
        gs.getInfo();
    }
}

class Person {
    String name;
    String PAN;
    String role;
    String education;

    Person(String name, String PAN, String role, String education) {
        this.name = name;
        this.PAN = PAN;
        this.role = role;
        this.education = education;
    }

    public void getInfo() {
        System.out.println("Name : " + name + "\nPAN : " + PAN + "\nRole : " + role + "\nEducation : " + education);
    }

}

class Student extends Person {
    String roll;
    String course;

    Student(String name, String PAN, String role, String education, String roll, String course) {
        super(name, PAN, role, education);
        this.roll = roll;
        this.course = course;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Roll : " + roll + "\nCourse : " + course);

    }
}

class GraduateStudent extends Student {
    String researchTopic;
    String supervisor;
    boolean thesisSubmeted;

    GraduateStudent() {
        this("Power of AI","VINOD",false);
    }
    
    GraduateStudent(String researchTopic,
        String supervisor,
        boolean thesisSubmeted) {
            this.researchTopic=researchTopic;
            this.supervisor=supervisor;
            this.thesisSubmeted=thesisSubmeted;

                super("raj", "JQT78IP", "student", "MCA Persuing", "4", "MCA");

    }

    @Override
    public void getInfo() {
        System.out.println("researchTopic : "+researchTopic+"\nsupervisor : "+supervisor+"\nthesisSubmeted"+thesisSubmeted);
    }
}
