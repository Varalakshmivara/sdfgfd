import java.util.*;
class Controll
{
public enum vowel={a,e,i,o,u};

public static void main(String args[])
{
vowel[] character=vowel.values();
for(vowel now:character)
{
switch(now)
{
case a:
System.out.println(" 'a' is vowel");
break;
case e:
System.out.println(" 'e' is vowel");
case i:
System.out.println(" 'i' is vowel");
case o:
System.out.println(" 'o' is vowel");
case u:
System.out.println(" 'u' is vowel");
default:
System.out.println(" it is a consonant");
}
}
}
}

