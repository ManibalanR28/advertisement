import java.io.DataInputStream;
class example1
{
  public static void main(String arg[])throws Exception
  {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the Range:");
    int n=Integer.parseInt(d.readLine());
    for(int i=0;i<n;i++)
    {
      if(i%3==0 && i%5==0)
          System.out.println("FIZZBUZZ");
       else if(i%3==0)
          System.out.println("FIZZ");
       else if(i%5==0)
        System.out.println("BUZZ");
      else
        System.out.println(i);
    }
  }
}