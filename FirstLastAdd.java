class FirstLastAdd 
{
    public static void main(String arg[])
    {
    FirstLastAdd obj=new FirstLastAdd();
    obj.SumFL(573);
    }
    public void SumFL(int n)
    {
    int sum=0;
    int num=n/100;
    int value=n%10;
    sum=num+value;
    System.out.println("the first value is: " +num);
    System.out.println("the last value is: " +value);
    System.out.println("the first and last total value is: " +sum);
    }
}

