public class Compact extends Motorcycle{ 
  public Compact(String model, String make, int year, int seat, int door){
    super(model, make, year, seat, door);
  }
  public String toString(){
    return super.getMake()+", "+super.getModel()+", seating: "+super.getSeat()+", engine type: "+getEngineType()+".";
  }
}