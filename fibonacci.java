import java.io.DataInputStream;
class fibonacci
{
  public static void main(String args[])throws Exception
  {
    void input()
    {
    DataInputStream d=new DataInputStream(System.in);
    System.out.print("Enter the Number:");
    int n=Integer.parseInt(d.readLine());
    int a=0,b=1;
    System.out.println(a);
    System.out.println(b);
    for(int i=0;i<n;i++)
    {
       int c=a+b;
       logic();
     }
    }
    void logic()
     {
         System.out.println("HI");
      }
   }
}
        