
// creat a class circle and use inheritance to create another class cylinder from it.

class circle{
    public int radius;
    circle(){
        System.out.println("I am not param of circle ");
    }
    circle(int r){
        System.out.println("I am circle parameterizer constructor ");
        this.radius = r;    
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}


 class cylinder extends circle{
    public int height;
    cylinder(int r, int h){
        super (r);
        System.out.println("I am cylender parameterized constructor");
        this.height = h;
    } 
    public void setRadius(int r){
        this.radius = r;
    }
    public double Volume(int radius, int height){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class MainCircle {
    public static void main(String[] args) {
        cylinder obj = new cylinder(12,6);
        obj.setRadius(4);
        System.out.println("Volume of cylinder: " + obj.Volume(4, 6));
    }
}
