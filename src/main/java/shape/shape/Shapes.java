package shape.shape;

/**
 * Hello world!
 *
 */
import java.util.*;
interface Shape
{
        double perimeter();
        double area();
}
class Rectangle implements Shape
{
        private double length;
        private double breadth;

        public Rectangle(double length, double breadth)
        {
                this.length = length;
                this.breadth = breadth;

        }
        public double area()
        {

                return length * breadth;
        }
        public double perimeter()
        {

                return 2 * (length + breadth);
        }
}
class Circle implements Shape
{
        private double r;
        public Circle(double r)
        {
                this.r=r;
        }
        public double area()
        {
                return 3.14*r*r;
        }
        public double perimeter()
        {
                return 2*3.14*r;
        }
}
class Triangle implements Shape
{
        private double a;
        private double b;
        private double c;
        private double h;
        public Triangle(double a,double b,double c,double h)
        {
                this.a=a;
                this.b=b;
                this.c=c;
                this.h=h;
        }
        public double area()
        {
                return 0.5*b*h;
        }
        public double perimeter()
        {
                return a+b+c;
        }
}
class Shapes
{
        public static void main(String []args)
        {
                int ch=5;
                Scanner sin=new Scanner(System.in);
                do
                {
                        System.out.print("\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit\n");
                        System.out.print("Enter your choice\n");
                        ch=sin.nextInt();
                        switch(ch)
                        {
                                case 1:double l,b;
                                       System.out.print("Enter length and breadth\n");
                                       l=sin.nextDouble();
                                       b=sin.nextDouble();
                                       Rectangle r=new Rectangle(l,b);
                                       System.out.print("\nArea of Rectangle :"+r.area());
                                       System.out.print("\nPerimeter of Rectangle :"+r.perimeter());
                                break;
                                case 2:double ra;
                                       System.out.print("Enter radius\n");
                                       ra=sin.nextDouble();
                                       Circle c=new Circle(ra);
                                       System.out.print("\nArea of Circle :"+c.area());
                                       System.out.print("\nPerimeter of Circle :"+c.perimeter());
                                break;
                                case 3:double a;
                                        double br;
                                       double c1;
                                        double h;
                                        System.out.print("\nEnter height and breadth\n");
                                       h=sin.nextDouble();
                                       br=sin.nextDouble();
                                       System.out.print("\nEnter side a and c\n");
                                       a=sin.nextDouble();
                                       c1=sin.nextDouble();
                                       Triangle t=new Triangle(a,br,c1,h);
                                       System.out.print("\nArea of Triangle :"+t.area());
                                       System.out.print("\nPerimeter of Traingle :"+t.perimeter());
                                break;
                                default:if(ch!=4)
                                        {
                                                System.out.print("Enter valid input\n");
                                        }
                                        break;
                        }
                }while(ch!=4);
        }
}