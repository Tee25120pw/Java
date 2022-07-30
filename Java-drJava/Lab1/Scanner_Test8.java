import java.util.Scanner;
public class Scanner_Test8 {
public static void main(String [] args) {
  int x,a,b,c,d,e,f,g,h,i;
  Scanner sn = new Scanner(System.in);
  System.out.print("> Enter the first 9 digits of an ISBN an integer :\t");
  a = sn.nextInt();
  b = sn.nextInt();
  c = sn.nextInt();
  d = sn.nextInt();
  e = sn.nextInt();
  f = sn.nextInt();
  g = sn.nextInt();
  h = sn.nextInt();
  i = sn.nextInt();
  x = ((a*1+b*2+c*3+d*4+e*5+f*6+g*7+h*8+i*9)%11);
  if(x == 10){
    System.out.printf("> The ISBN-10 number is %d %d %d %d %d %d %d %d %d X",a,b,c,d,e,f,g,h,i);
  }
  else{
    System.out.printf("> The ISBN-10 number is %d %d %d %d %d %d %d %d %d %d",a,b,c,d,e,f,g,h,i,x);
  }
}
}