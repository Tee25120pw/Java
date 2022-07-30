class q1{
public static void main(String [] args){
tri t = new tri();
rec r = new rec();
cir c = new cir();
  System.out.println("triangle."+t.draw()+ "are "+t.are() );
  System.out.println("cir. "+"are "+c.are()+" vol "+ c.vol());
  System.out.println("recangle."+ r.draw()+ "are" + r.vol());
}
}