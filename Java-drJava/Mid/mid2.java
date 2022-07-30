/*
import java.util.Scanner;   //���1
public class mid2 {
  public static void main (String[] args){
    double v,a,length; Scanner input = new Scanner(System.in);
    System.out.print("Enter speed : ");v = input.nextDouble();
    System.out.print("Enter acceieration  : ");a = input.nextDouble();
    length = (Math.pow(v,2)/(2*a));
    System.out.print("The minimum runway for this airplane is "+length+" meters");
  }
}
*/

/*
import java.util.Scanner;   //���2 �·�����
public class mid2 {
  public static final double G = 6.67 * Math.pow(10,-11);
  public static void main(String[] args){
    double mass1,mass2; Scanner input = new Scanner(System.in);
    mass1 = input.nextDouble(); mass2 = input.nextDouble();
    calForce(mass1); calForce(mass2);
  }
  public static void calForce(double m){
    Scanner A = new Scanner(System.in);
    double a,F; System.out.print("Enter A"); a = A.nextDouble();
    System.out.print(F = m*a);
  }
  public static void calForce(double m1,double m2){
     Scanner R = new Scanner(System.in);
     double F,r; System.out.print("Enter R"); r = R.nextDouble();
     System.out.print(F = (((G*m1)*m2))/Math.pow(r,2)); 
  }
}
*/


/*
public class mid2 {   //���4
  public static void main(String[] args){
    Square s1 = new Square(); s1.toDisplay();
    Square s2 = new Square(5.0,3.0); s2.toDisplay();
    Square s3 = new Square(5.0,6.0,5.0); s3.toDisplay();
  }
}
public class Square {   
  private double Width,Length,Height;
  public Square(){
    this.Width = 1; this.Length = 1; this.Height = 1;
  }
  public Square(double width,double length){
    this.Width = width; this.Length = length; this.Height = 1;
  }
  public Square(double width,double length,double height){
    this.Width = width; this.Length = length; this.Height = height;
  }
  public double getArea(){
    return getWidth()*getLength();
  }
  public double getBoundary(){
    return 2*(getWidth()+getLength());
  }
  public double getSureface_SquareAllSide(){
    return (getWidth()+getLength()*2) + (getWidth()+getHeight()*2) + (getHeight()+getLength()*2);
  }
  public double getWidth(){
    return this.Width;
    
  }
  public double getLength(){
    return this.Length;
  }
  public double getHeight(){
     return this.Height;
  }
  public void toDisplay(){
    System.out.println("Square"); System.out.print("Width = "+getWidth()); System.out.print("  Length = "+getLength());
    System.out.println("  Height = "+getHeight());
    System.out.println("Area of Square = "+getArea());
    System.out.println("Boundary of Square = "+getBoundary());
    System.out.println("Sureface Square all Side of Square = "+getSureface_SquareAllSide());
    System.out.println();
  }
}
*/

/*  
import java.util.Scanner;   //���5
import java.util.Arrays;
public class mid2{
  public static void main(String[] args){
    double[] array = new double[10]; Scanner input = new Scanner(System.in);
    for (int i = 0;i<array.length;i++){
      array[i] = input.nextDouble();
    }
    Arrays.sort(array);
    System.out.print("The maximum of value in array is "+array[9]);
  }
}
*/



import java.util.Scanner;   //���6
public class mid2 {
  public static void main(String[] args){
    int[][] array = new int[4][4]; int number,x = 0; Scanner input1 = new Scanner(System.in);
    System.out.println("Enter number "); number = input1.nextInt();
    for (int i = 0;i<4;i++){
      for (int j = 0;j<4;j++){
        array[i][j] = (int)(Math.random()*6)+1;
        System.out.print(array[i][j]+" ");
      }
      System.out.println();
    }
     for (int i = 0;i<4;i++){
      for (int j = 0;j<4;j++){
        if (array[i][j] == number){
          x++;
        }
      }
    }
     System.out.println("Your number appears "+x+" times in array");
  }
}




/*
--- ����ͺ Midterm  --- (�ͧ���� #59)
**��� 1**
⨷�����������¹������ӹǹ������Ǣͧ�ѹ�Ƿ����鹷���ش�ҡ�ٵ÷������� length = (v^2)/2a ����ҵ�ͧ�Ѻ��� V ��� A
**��� 2**
⨷��������������¹�����Ẻ Overloading �礤�����ç �»�͹ ���˹ѡ�ͧ�������礼�ҹ method Ẻ static 
����� ����觤������ �������ٵ����ç  F = ma ����Ѻ��� A �ͧ ������ͧ����������ٵ� 
��������ǧ�ҡŢͧ��ǵѹ  F = (G(m1*m2))/R^2 ���Ѻ��� R �ͧ �� R ���������ҧ�����ҧ���
**��� 3 **
�繢����¹ ������ŧ�ҡ����� �� UML �����¹�ŵ�����ҧ������͡��
**��� 4 ** (���͹�⨷���Ҩ���ç ���Ƿҧ�١��ͧ)
�繡�÷� UML ���������ٻ����������� UML ��˹�
**��� 5 **
⨷��С�˹���� ��ҹӤ�������� Array �������� ��ҷ���ҡ����ش���������令�ͤ������
** ��� 6 **
⨷��������һ�͹����Ţ����� 1 �֧ 6 ����������� �����Ţ 1 �֧ 6 ���� matrix 4*4 (array Ẻ [4][4]) 
��ѧ�ҡ������Ӥ�ҷ���͹������� �յ���Ţ����ӡѺ���������������� array ��������ʴ��͡��
*/

