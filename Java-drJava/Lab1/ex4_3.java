public class Ex4_3{
  public static void main(String[] args){
    System.out.printf("i\t\tm(i)\n");
    int n,d;
    double x=0;
    for(n=1;n<=901;n++)
    {
      d = n%100;
      x = x+m(n);
      if(d==1)
      {
        System.out.printf("%d\t\t%.4f\n",n,x);
      }
    }
  }

  public static double m(int i){
    double m;
    m = (4*(Math.pow(-1,i+1)/(2*i-1)));
    return (m);
  }
}