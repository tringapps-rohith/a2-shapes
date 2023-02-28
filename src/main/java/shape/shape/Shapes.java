package shape.shape;
import java.util.*;
class Shapes
{
        public static void main(String []args)
        {
                int ch=5;
                Scanner sin=new Scanner(System.in);
				Logger l=Logger.getLogger("com.api.jar");
                do
                {
                        l.info("\n1.Rectangle\n2.Circle\n3.Triangle\n4.Exit\n");
                        l.info("Enter your choice\n");
                        ch=sin.nextInt();
                        switch(ch)
                        {
                                case 1:double l;
                                        double b;
                                       l.info("Enter length and breadth\n");
                                       l=sin.nextDouble();
                                       b=sin.nextDouble();
                                       Rectangle r=new Rectangle(l,b);
                                       l.log(LEVEL.INFO,()-> "\nArea of Rectangle :"+r.area());
                                       l.log(LEVEL.INFO,()-> "\nPerimeter of Rectangle :"+r.perimeter());
                                break;
                                case 2:double ra;
                                       l.info("Enter radius\n");
                                       ra=sin.nextDouble();
                                       Circle c=new Circle(ra);
                                       l.log(LEVEL.INFO,()-> "\nArea of Circle :"+c.area());
                                       l.log(LEVEL.INFO,()-> "\nPerimeter of Circle :"+c.perimeter());
                                break;
                                case 3:double a;
                                        double br;
                                       double c1;
                                        double h;
                                        l.info("\nEnter height and breadth\n");
                                       h=sin.nextDouble();
                                       br=sin.nextDouble();
                                       l.info("\nEnter side a and c\n");
                                       a=sin.nextDouble();
                                       c1=sin.nextDouble();
                                       Triangle t=new Triangle(a,br,c1,h);
                                       l.log(LEVEL.INFO,()-> "\nArea of Triangle :"+t.area());
                                       l.log(LEVEL.INFO,()-> "\nPerimeter of Traingle :"+t.perimeter());
                                break;
                                default:if(ch!=4)
                                        {
                                                l.info("Enter valid input\n");
                                        }
                                        break;
                        }
                }while(ch!=4);
        }
}
