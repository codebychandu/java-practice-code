

class rectangle{
    int length;
    int height;
    int rectanglearea(){
        return length*height;
    }
}

class cuboid extends rectangle{
    //  Area of a Cuboid  = 2 (lw + wh + lh) square units
    int lenght;
    int width;
    int height;
    int cuboidarea(){
        return 2*(lenght*width + lenght*height + width*height);
    }   
}

public class MainRectangle {
    public static void main(String[] args) {
        cuboid obj = new cuboid();
        obj.lenght = 10;
        obj.width = 20;
        obj.height = 30;
        System.out.println("Area of cuboid: " + obj.cuboidarea());
        System.out.println("Area of rectangle: " + obj.rectanglearea());
    }
    
}
