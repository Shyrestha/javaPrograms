import java.util.Scanner;
public class circleradius {
    int x ,y ;

     circleradius( int x , int y) {
        this.x=x;
        this.y=y;
    }
}
class circle{
    int radius;
    circleradius center;
    circle(int r , int x , int y){
        radius = r;
        center = new circleradius(x, y);

    }
    void Display(){
        double area = 3.14*radius*radius;
        System.out.println("Center : (" +center.x + "," +center.y+")");
        System.out.println("Radius" +radius);
        System.out.println("area : " +area);

    }
}
class output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        circle c = new circle(r,x,y);
        c.Display();
    }
}
