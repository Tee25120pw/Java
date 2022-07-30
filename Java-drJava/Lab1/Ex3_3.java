public class Ex3_3{
  public static void main(String[] args){
    int count = 9;
    int[] b;
    int c,i,j,k;
    b = new int[82];
    for(c=0;c<82;c++)
    {
      b[c] = c;
    }
    for(i=0;i<count;i++)
    {
      for(j=0;j<(count-i-1);j++)
      {
        System.out.print("    ");
      }
      for(k=0;k<((2*i)+1);k++)
      {
        if(i==0)
        {
          System.out.printf("  %d ",b[k+1]);
        }
        else if(i==1)
        {
          System.out.printf("  %d ",b[k+2]);
        }
        else if(i==2)
        {
          System.out.printf("  %d ",b[k+5]);
        }
        else if(i==3)
        {
          System.out.printf(" %d ",b[k+10]);
        }
        else if(i==4)
        {
          System.out.printf(" %d ",b[k+17]);
        }
        else if(i==5)
        {
          System.out.printf(" %d ",b[k+26]);
        }
        else if(i==6)
        {
          System.out.printf(" %d ",b[k+37]);
        }
        else if(i==7)
        {
          System.out.printf(" %d ",b[k+50]);
        }
        else
        {
          System.out.printf(" %d ",b[k+65]);
        }
      }
      System.out.println();
    }
  }
}