public class MotorVehicle{
  protected String model;
  protected String make;
  protected int year;
  protected int seat;
  
  public MotorVehicle(String model, String make, int year, int seat){
    this.model = model;
    this.make = make;
    this.year = year;
    this.seat = seat;
  }
  public String getModel(){
    return model;
  }
  public String getMake(){
    return make;
  }
  public int getYear(){
    return year;
  }
  public int getSeat(){
    return seat;
  }
}