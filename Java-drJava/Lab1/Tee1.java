import java.util.Scanner;
public class Tee1{
  public static void main(String args []){
    Float w,l;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a point with two coordinates:\t"); /* ใส่ตัวเลขทีละตัว โดยกดตัวท ี่1 แล้ว Spacebar1ครั้ง ใส่ตัวที่ 2 */
    w = sn.nextFloat();
    l = sn.nextFloat();
    if(w>8 || l>7)
      System.out.printf("Point (%f,%f) is not in the rectangle ",w,l);
    else if((w>6 && w<=8) || (l>6 && l<=7))
      System.out.printf("Point (%f,%f) is in the rectangle but the point is not in the circle ",w,l);
        else if(w<=6 && l<=6)
      System.out.printf("Point (%f,%f) is in the rectangle and the circle ",w,l);
  }
}

    