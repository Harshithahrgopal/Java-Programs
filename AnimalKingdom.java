abstract class Animal
{
abstract void eat();
abstract void sleep();
}
class Lion extends Animal
{
void eat()
{
System.out.println("lion is a carnivorous animal:");
}
void sleep()
{
System.out.println("lion sleeps until it feels hungry");
}
}
class Tiger extends Animal
{
void eat()
{
System.out.println("Tiger is a carnivorous animal:");
}
void sleep()
{
System.out.println("tiger sleeps 10 hours per day");
}
}
class Deer extends Animal
{
void eat()
{
System.out.println("Deer is a herbivorous animal:");
}
void sleep()
{
System.out.println("Deer slepps peacefully until a carnivorous animal attacks it");
}
}
public class AnimalKingdom
{
public static void main(String arg[])
{
Lion l=new Lion();
l.eat();
l.sleep();
Tiger t=new Tiger();
t.eat();
t.sleep();
Deer d=new Deer();
d.eat();
d.sleep();
}
}