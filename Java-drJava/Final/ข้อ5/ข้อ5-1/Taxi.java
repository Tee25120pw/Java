class Taxi extends Vehicle implements Passenger {
  public String drive(){
    return "Taxi: Deal the direction and then take a seat and fasten safety belt.";}
  public String howToPayMoney(){
    return "Taxi: Check the distance and cost forim the meter. Pay money";
  }
}