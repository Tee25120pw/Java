public class Scooter extends Motorcycle{
  public Scooter(String model,String make,int year,int seat,String engineTypes){
    super(make,model,year,seats,doors);
  }
  public String toString(){
  StringBuffer buffer = new StringBuffer();
  buffer.append("Scooter: ");
  buffer.append(super.toString());
  
  return new String(buffer);
  }
}
