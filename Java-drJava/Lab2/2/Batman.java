public class Batman extends SuperHero{
  private String power;
  
  public Batman(){
    super("Super Hero");
    this.power = "I am rich.";
  }
  public Batman(String n, String power){
    super(n);
    this.power = power;
  }
  public String toString(){
    return "I am "+super.toString()+". "+this.power;
  }
}
