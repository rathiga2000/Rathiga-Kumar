//Count of Digit
class Count_Base
{
    public static void main(String arg[])
    {
    Count_Base obj=new Count_Base();
    obj.Sum(721);
    obj.Sum(2345);
    }
    public void Sum(int num)
    {
    int a=num;
    int count=0;
    System.out.println("Print the given number: "+num);
    while(num>0)
    {
    count++;
    num=num/10;
    }
    System.out.println("add count:" +count);
    }
}


