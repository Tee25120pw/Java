import java.util.Scanner;
class Employee0{
  public static void main(String[] args){
protected float rate = 300.0f, work = 10.0f, pay;
public Employee0(int h) {
pay = h*rate/work;
}
public Employee0(int h, float r) {
pay = h*r/work;
}
public Employee0(int h, float r, float b) {
this(h,r);
if (h>100)
pay += b;
}
  }
} 