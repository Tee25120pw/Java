class Q08_394{
  public static void main(String[]args){
    Taxi t = new Taxi();
    BTS b= new BTS();
    Bus Bu= new Bus();
    AirRate a= new AirRate();
    FanRate f= new FanRate();

    System.out.println(t.drive());
    System.out.println(t.howToPayMoney());    
    System.out.println(b.howToPayMoney());   
    System.out.println(Bu.howToPayMoney());
    System.out.println(Bu.howMuchRate());   
    System.out.println(a.howMuchRate());    
    System.out.println(f.howMuchRate());    
  }
}
