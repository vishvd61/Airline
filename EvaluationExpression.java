import java.util.Scanner;
class ExpressionEvaluation
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter Expression to Evaluate:");
String string=input.nextLine();
String a=string.replaceAll(" ","");

if(a.length()<3)
{
System.out.println("Please Enter one oparator or two oparand:");
System.exit(0);
}
int result=0;
int i=0;
while(a.charAt(i)!='+'&&a.charAt(i)!='-'&&a.charAt(i)!='*'&&a.charAt(i)!='/')
{
i++;
}
switch(a.charAt(i))
{
case'+':
result=Integer.parseInt(a.substring(0,i))+Integer.parseInt(a.substring(i+1,a.length()));
break;
case'-':
result=Integer.parseInt(a.substring(0,i))-Integer.parseInt(a.substring(i+1,a.length()));
break;
case'*':
result=Integer.parseInt(a.substring(0,i))*Integer.parseInt(a.substring(i+1,a.length()));
break;
case'/':
result=Integer.parseInt(a.substring(0,i))/Integer.parseInt(a.substring(i+1,a.length()));
break;
}
System.out.println(a.substring(0,i)+' '+a.charAt(i)+' '+a.substring(i+1,a.length())+"="+result);
}
}