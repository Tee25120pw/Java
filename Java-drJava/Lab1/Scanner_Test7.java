import java.util.Scanner;
public class Scanner_Test7 {
public static void main(String [] args) {
  Float a,b,c,d,e,f,x,y,z;
  Scanner sn = new Scanner(System.in);
  System.out.print("> Enter a,b,c,d,e,f: \t");
  a = sn.nextFloat();
  b = sn.nextFloat();
  c = sn.nextFloat();
  d = sn.nextFloat();
  e = sn.nextFloat();
  f = sn.nextFloat();
  x = (e*d-b*f)/(a*d-b*c);
  y = (a*f-e*c)/(a*d-b*c);
  z = (a*d)-(b*c);
  if(z == 0){
    System.out.print("The equation has no solution");
  }
  else{
    System.out.printf("x is %f and y is %f",x,y);
  }
  }
}