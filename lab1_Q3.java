public class CodesCracker
{
   public static void main(String[] args)
   {
      int row=5, i, j;
      
      for(i=0; i<row; i++)
      {
         for(j=i; j<row; j++)
            System.out.print("* ");
         System.out.print("\n");
      }
   }
}
