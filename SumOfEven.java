public class SumOfEven
{  
    public static void main(String args[])   
    {  
    SumOfEven obj=new SumOfEven();
    obj.Sum(10);
    }
    public void Sum(int num)
    {
    int count=1;
    int sum=0;
    while(count<=num)  
    {  
    if(count%2==0)
{
    sum=sum+count;
}
    count++;  
    }  
       
    System.out.println("Sum of Even Numbers is= " + sum);  
    }  
}


