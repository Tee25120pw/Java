public class Fi_4{
  public static void main(String[]args){
    Fruit f = new Fruit();
    Apple a = new Apple();
    Chicken c = new Chicken();
    Orange o = new Orange();
    
    System.out.print(f.howtoeat());
    System.out.print("\t");
    System.out.print(a.howtoeat());
    System.out.print("\n");
    System.out.print(c.howtoeat());
    //System.out.print(c.sound());
    System.out.print("\t\t");
    System.out.println(o.howtoeat());     
  }
}
