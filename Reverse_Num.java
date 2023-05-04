public class Reverse_Num
{
    public static void main(String args[])
    { 
    Reverse_Num obj=new Reverse_Num();
    obj.Numbers(2347);
    }
     public void Numbers(int num)
    {
      int Sum =0;
      
        while(num>0)
      {
            int i=num%10;
          Sum = Sum * 10+i;
           num = num/10;
      }

      System.out.println("Reverse of digit number is: "+Sum);
     }
}
