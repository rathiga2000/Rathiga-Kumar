//sum of digit
class Sum_Digit
{
    public static void main(String args[])
    {
    Sum_Digit obj=new Sum_Digit();
    obj.add(321);
    obj.add(2345);
    }
    public void add(int n)
    {
    int i=n;
    int count=0;
    System.out.println("Given Number: " +n);
    while(n>0)
    {
    int a=n%10;
    count=count+a;
    n=n/10;
    }
System.out.println("Sum value: " +count);
    }
}

