import java.util.*;
class table
{
public static void main(String args[])
{
int n,i;
Scanner s=new Scanner(System.in);
n=s.nextInt();
outer: for(i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
if(i>j)
{
System.out.println();
continue outer;
}
else
System.out.print(i*j+" ");
}

}
System.out.println();
}

}