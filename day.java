import java.util.*;
class day

{
public static void main(String args[])
{
String day=null;
int dd;
Scanner s=new Scanner(System.in);
dd=s.nextInt();
switch(dd)
{
case 1:
day= "monday";
break;
case 2:
day= "tue";
break;
case 3:
day="wed";
break;
case 4:
day="thur";
break;
case 5:
day="fri";
break;
case 6:
day="sat";
break;
case 7:
day="sun";
break;
default:
System.out.println("enter  valid input from 1-7");
}
System.out.println("today is "+day);
}
}