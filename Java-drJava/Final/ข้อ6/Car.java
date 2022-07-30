public class Car extends MotorVehicle{
  private int doors;
  public Car(String model,String make,int year,int seats,int doors){
    super(model,make,year,seats,doors);
    this.door = door;
  }
  public int getDoors(){
    return door;
  }
  public String toString(){
    StringBuffer buffer = new StringBuffer();
    buffer.append(super.getMake() +","+super.getModel()+","+super.getYear()+","+"seating: "+super.getSeats()+","+"door: "+door);
    return new String(buffer);
  }
}
