public class Motove{
  protected String model;
  protected String make;
  protected int year;
  protected int seat;

public Motov (String model,String make,int year, int seat){
  this.model = model;
    this.make = make;
    this.year = year;
    this.seat = seat;
}
public String getmodle (){
  return model;
}
public String getmake (){
  return make;
}
public int getyear (){
  return year;
}
public int getseat (){
  return seat;
}
}