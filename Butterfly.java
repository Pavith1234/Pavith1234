import java.util.Scanner;
class Butterfly
{
public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int n=sc.nextInt();
 for(int i=1;i<=n;i++)
 {
  char ch= 'A';
  for(int j=1;j<=i;j++)
  {
   System.out.print(ch+" ");
   ch++;
  }
  for(int j=1;j<=n-i;j++)
  {
   System.out.print("  ");
   }
   ch--;
   for(int j=1;j<=i;j++)
   {
    System.out.print(ch +" ");
     ch--;
   }
  System.out.println();
  }
   for(int i=1;i<n;i++)
 {
  char ch= 'a';
  for(int j=1;j<=n-i;j++)
  {
   System.out.print(ch+" ");
   ch++;
  }
  for(int j=1;j<=i;j++)
  {
   System.out.print("  ");
   }
   ch--;
   for(int j=1;j<=n-i;j++)
   {
    System.out.print(ch +" ");
     ch--;
   }
  System.out.println();
  }

}
}