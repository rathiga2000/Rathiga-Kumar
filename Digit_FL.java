class Digit_FL
{
    public static void main(String arg[])
    {
    Digit_FL obj=new Digit_FL();
    obj.first_last(3467);
    }
    public void first_last(int n)
    {
    int num=n/100;;
    int number=num/10;
    int value=n%10;
    System.out.println("the first and last value is: " +number +value);
    }
}

