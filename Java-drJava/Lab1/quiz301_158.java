import java.util.Scanner;
public class quiz301_158 {
  public static void main(String[]args){
    double a,b,c,d,e,f,i,j,m,n,x=1,y=0,z=0;
  Scanner sn = new Scanner(System.in);
  System.out.print("m ");
    m= sn.nextInt();
  System.out.print("n ");
    n= sn.nextInt();
  for(i=m;i<n+1;i++){
    for(j=1;j<i+1;j++){
      x= x*(1/j);}
    y=y+x;
    z=z+((2*i)+2);
    /*System.out.printf("%.5f\n",x);
    System.out.printf("%.5f\n",y);
    System.out.printf("%.5f\n\n",z);*/
    x=1;
    }
   System.out.printf("%.5f",y+z);
}
}