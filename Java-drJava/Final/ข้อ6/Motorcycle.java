public class Motorcycle extends MotorVehicle{
  private String engineType;
  public Motorcycle(String model,String make,int year,int seats,String engineTypes){
    super(model,make,year,seats,engineTypes);
    this.engineType = engineTypes;
  }
  public String getEngineType(){
    return engineType;
  }
  public String toString(){
  StringBuffer buffer = new StringBuffer();
  buffer.append(super.getMake() +","+super.getModel()+","+super.getYear()+","+"seating: "+super.getSeats()+","+"Engine Type: "+engineType);
  return new String(buffer);
  }
}
