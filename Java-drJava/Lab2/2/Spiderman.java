public class Spiderman extends SuperHero{
  private int age;
  private String power;
  
  public Spiderman(String n, int age, String power){
    super(n);
    this.age = age;
    this.power = power;
  }
  public String toString(){
    return "I am "+super.toString()+". I am "+this.age+" years old. "+this.power;
  }
}