public class q1 {
  public static void main(String[]args) {
    Bird b = new Bird();
    Eagle e = new Eagle();
    Ostrich o = new Ostrich();
    Panda p = new Panda();
    Wolf w = new Wolf();
    Elephant el = new Elephant();
    Cat c = new Cat();
    
    
    System.out.println(p.eat());
    System.out.println(w.eat());
    System.out.println(c.eat());
    System.out.println(c.howToBirth());
    System.out.println(el.howToBirth());
    System.out.println(b.howToBirth());
    System.out.println(b.howToFly());
    System.out.println(e.howToFly());
    System.out.println(o.howToFly());
  }
}