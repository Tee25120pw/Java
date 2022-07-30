public class Q3G1
{ public static void main(String[]asrg)
  { int i;
  double j,m,a1=1,a2=1;
  for(i=1;i<=30000;i++)
  { 
    j = a1/a2;
    a1++;
    a2 = a1+1;
    m = 1+j;
    if(i%1000 == 0)
    {
      System.out.printf("m = %.15f | i = %d\n",m,i);
    }
  }
  }
}
    