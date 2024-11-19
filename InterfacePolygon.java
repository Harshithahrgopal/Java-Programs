interface Polygon
{
void getperimeter();
void getarea();
}
class Rectangle implements Polygon
{
int d1;
int d2;
public Rectangle(int l,int b)
{
this.d1=l;
this.d2=b;
}
public void getperimeter()
{
System.out.println("Perimeter of rectangle is:"+(d1+d2));
}
public void getarea()
{
System.out.println("Area of rectangle is:"+(d1*d2));
}
}
class Square implements Polygon
{
int a=10;
public void getperimeter()
{
System.out.println("Perimeter of Square is:"+(4*a));
}
public void getarea()
{
System.out.println("Area of Square is:"+(a*a));
}
}
public class Main3
{
public static void main(String args[])
{
Polygon rec=new Rectangle(4,5);
rec.getperimeter();
rec.getarea();
Polygon sq=new Square();
sq.getperimeter();
sq.getarea();
}
}


