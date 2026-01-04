public class Abstraction {

    public static void main(String[] args) {
        
    }
}

abstract class Shape{
     public String name ;
      Shape(String name){
        this.name=name;
     };
     public abstract void draw ();
}


class Circle extends Shape{
    Circle(){
        super("Circle");
    }
    public void draw(){
        System.out.println("Draw "+super.name);
    }
}