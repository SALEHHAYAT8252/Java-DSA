public class OOP3{
    public static void main(String[] args){
        Rectangle rec = new Rectangle(12,5);
        Rectangle sq = new Rectangle(5);
        System.out.println("Area "+rec.area());
        System.out.println("Area "+sq.area());

    }
}

class Rectangle{
    float l;
    float b;

    Rectangle(float l,float b){
        this.l=l;
        this.b=b;
    }
    Rectangle(float side){
        this.l=side;
        this.b=side;
    }

    public float area(){
    
        return (l*b);
    }
}