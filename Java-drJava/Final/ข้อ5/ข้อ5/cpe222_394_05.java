public class cpe222_394_05{
  public static void main(String[] args){
    Triangle t = new Triangle();
    Circle c = new Circle();
    Rectangle r = new Rectangle();
    
    System.out.print("I am triangle. "+t.draw());
    System.out.println("My area is "+t.area()+" .");
    System.out.print("I am circle. My area is "+c.area());
    System.out.println(". My volume is "+c.volume()+" .");
    System.out.print("I am rectangle. "+r.draw());
    System.out.print("My volume is "+r.volume()+" .");
  }
}