public class Quiz_394 {
  public static void main(String[] args) {
    Taxi t = new Taxi();
    BTS bts = new BTS();
    Bus b = new Bus();
    FanRate f = new FanRate();
    AirRate a = new AirRate();
    System.out.println(t.drive());
    System.out.println(t.howToPayMoney());
    System.out.println(bts.howToPayMoney());
    System.out.println(b.howMuchRate());
    System.out.println(b.howToPayMoney());
    System.out.println(a.howMuchRate());
    System.out.println(f.howMuchRate());
  }
}