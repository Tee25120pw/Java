public class Quiz_394 {
  public static void main(String[] args) {
    Taxi t = new Taxi();
    BTS bts = new BTS();
    Bus b = new Bus();
    FanRate f = new FanRate();
    AirRate a = new AirRate();
    Motocycle m = new Motocycle();
    Car c = new Car();
    Vehicle v = new Vehicle();
    
    
    System.out.println(t.drive());
    System.out.println(t.howToPayMoney());
    System.out.println(b.howToPayMoney());
    System.out.println(b.howMuchRate());  
    System.out.println(f.howMuchRate());
    System.out.println(a.howMuchRate());
    System.out.println(bts.drive());
    System.out.println(bts.howToPayMoney());
    System.out.println(m.drive());
    System.out.println(c.drive());
    System.out.println(v.drive());
    
    
    
  }
}