public class ReverseValue
{
public static void main(String args[])
{
ReverseValue obj=new ReverseValue();
obj.Back_Num(9);
}
public void Back_Num(int Num)
{
int count=1;
while(count<=9)
{
System.out.println(Num);
Num--;
count++;
}
}
}
