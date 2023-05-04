class Prime_Sum
{
public static void main(String args[])
{
Prime_Sum obj=new Prime_Sum();
obj.SumOfPrime(31);
}
public void SumOfPrime(int n)
{
int num=n;
int sum=0;
int i=2;
int count=0;
if(num>9)
{
while(num>0)
{
 int a=num%10;
sum=sum+a;
num=num/10;
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
System.out.println(n + " Sum of num " + sum + " prime number");
}
else
{
System.out.println(n + " Sum of num" + sum + " not prime number");
}
}
else
{
System.out.println(n +"  check the given number ");
}
}
}
