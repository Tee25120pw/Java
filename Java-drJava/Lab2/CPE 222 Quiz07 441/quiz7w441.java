public class quiz7w441{
  public static void main(String[] args){
    SuperHero sh = new SuperHero();
    Batman bm1 = new Batman("Batman", "I am rich");
    Batman bm2 = new Batman("Super Hero", "I am rich");    
    Superman sm = new Superman();
    Spiderman sd = new Spiderman("Spiderman", 20, "I can shoot spider web");
    
    System.out.println(sh);    
    System.out.println(sm);
    System.out.println(bm2);
    System.out.println(bm1);    
    System.out.println(sd);
  }
}

