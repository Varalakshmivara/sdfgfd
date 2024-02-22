import java.util.*;
import java.lang.*;
import java.io.*;
class one
{
public void display()
{
System.out.println("welcome");
}
}
class two extends one
{
public void display()
{
System.out.println("to");
}
}
class three extends two
{
public void display()
{
System.out.println("india");
}
}
class main1
{
public static void main(String args[])
{
three g=new three();
g.display();
}
}



