class Prime_Reverse
{
    public static void main(String arg[])
    {
    Prime_Reverse obj=new Prime_Reverse();
    obj.Reverse(13);
    }
  public void Reverse(int num)
    {
    int n=num;
    int i=2;
    int sum=0;
    int count=0;
    
    while(n>0)
    {
    
            int a=n%10;
          sum = sum * 10+a;
           n= n/10;
      }
    while(i<=sum)
    {
    if(sum%i==0)
    {
     count++;
     }
    i++;
    }
  if(count==1)
    {
   System.out.println(num+ " reverse num is " + sum + " prime number ");      
    }
    else
    {
   System.out.println(num+ " reverse num is " + sum + " not a prime number ");      
     }
    }  
}










