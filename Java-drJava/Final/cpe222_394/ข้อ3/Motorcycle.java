public class Motorcycle extends MotorVehicle{
  private String engineType;
  
  public Motorcycle(String model, String make, int year, int seat, String engineType){
    super(model, make, year, seat, engineType);
  }
  public String getEngineType(){
    return engineType;
  }
  public String toString(){
    return super.getMake()+", "+super.getModel()+", seating: "+super.getSeat()+", engine type: "+getEngineType()+".";
  }
}