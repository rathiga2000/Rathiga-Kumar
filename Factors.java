class Factors
{
public static void main(String args[])
{
Factors obj=new Factors();
obj.PrimeFact(50);
}
public void PrimeFact(int count)
    {
 {
    int num=1;
    while(count>num)
    {
    if(count%num==0)
    {
    System.out.println(num);
    }
    num++;
    }
    }   
}

}

