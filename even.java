import java.util.*;
class even
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
//even or not
if(a%2==0)
System.out.println(a+"is a number even");
else
System.out.println(a+" is odd");
if(b<0)
System.out.println( b+" is negative");
else
System.out.println(b+" is positive");
}
}