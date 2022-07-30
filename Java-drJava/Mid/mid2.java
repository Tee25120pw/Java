/*
import java.util.Scanner;   //ข้อ1
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
import java.util.Scanner;   //ข้อ2 เคยทำแล้ว
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
public class mid2 {   //ข้อ4
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
import java.util.Scanner;   //ข้อ5
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



import java.util.Scanner;   //ข้อ6
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
--- ข้อสอบ Midterm  --- (ของรหัส #59)
**ข้อ 1**
โจทย์จะสั่งให้เขียนโปรแกรมคำนวนความยาวของรันเวที่สั้นที่สุดจากสูตรที่ให้มา length = (v^2)/2a โดยเราต้องรับค่า V และ A
**ข้อ 2**
โจทย์จะสั่งให้เราเขียนโปรแกรมแบบ Overloading เช็คค่าหาแรง โดยป้อน น้ำหนักสองค่าและเช็คผ่าน method แบบ static 
ถ้าเป็น การส่งค่าเดียว ให้เข้าสูตรหาแรง  F = ma และรับค่า A เอง ถ้าส่งสองค่าให้เข้าสูตร 
กฎความถ่วงสากลของนิวตัน  F = (G(m1*m2))/R^2 โดยรับค่า R เอง โดย R คือระยะห่างระหว่างมวล
**ข้อ 3 **
เป็นข้อเขียน โดยให้แปลงจากโปรแกรม เป็น UML และเขียนผลตัวอย่างโปรแกรมออกมา
**ข้อ 4 ** (เงื่อนไขโจทย์อาจไม่ตรง แต่แนวทางถูกต้อง)
เป็นการทำ UML ให้อยู่ในรูปโปรแกรมตามที่ UML กำหนด
**ข้อ 5 **
โจทย์จะกำหนดให้ เรานำค่ามาใส่ใน Array และหาว่า ค่าที่มากที่สุดที่ใส่เข้าไปคือค่าอะไร
** ข้อ 6 **
โจทย์จะให้เราป้อนตัวเลขตั้งแต่ 1 ถึง 6 และให้โปรแกรม สุ่มเลข 1 ถึง 6 ภายใน matrix 4*4 (array แบบ [4][4]) 
หลังจากนั้นให้นำค่าที่ป้อนมาเช็คว่า มีตัวเลขที่ซ้ำกับที่โปรแกรมสุ่มใว้ใน array กี่ตัวละแสดงออกมา
*/

