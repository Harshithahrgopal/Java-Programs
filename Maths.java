import java.util.*;
abstract class Shape
{
abstract void printarea();
int dim1;
int dim2;
public Shape(int d1,int d2)
{
this.dim1=d1;
this.dim2=d2;
}
}
class Circle extends Shape
{
public Circle(int radius)
{
super(radius,0);
}
void printarea()
{
double area=Math.PI*dim1*dim1;
System.out.println("Area of circle="+area);
}
}
class Rectangle extends Shape
{
public Rectangle(int length,int width)
{
super(length,width);
}
void printarea()
{
double area=dim1*dim2;
System.out.println("Area of rectangle="+area);
}
}
class Triangle extends Shape
{
public Triangle(int height,int base)
{
super(height,base);
}
void printarea()
{
double area=0.5*dim1*dim2;
System.out.println("Area of triangle="+area);
}
}

public class Maths
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the radius");
int radius=s.nextInt();
Circle c=new Circle(radius);
c.printarea();

System.out.println("enter the length");
int length=s.nextInt();
System.out.println("enter the width");
int width=s.nextInt();
Rectangle r=new Rectangle(length,width);
r.printarea();

System.out.println("enter the heigth");
int height=s.nextInt();
System.out.println("enter the base");
int base=s.nextInt();
Triangle t=new Triangle(height,base);
t.printarea();
}
}