public class Topping{
  private String topName;
  private double topPrice;
  
  public Topping(String name,double price)
  {
    topName=name;
    topPrice=price;
  }
  public String getToppingName()
  {
    return topName;
  }
  public double getToppingPrice()
  {
    return topPrice;
  }
  public void setToppingName(String name)
  {
    topName=name;
  }
  public void setToppingPrice(double price){
  topPrice=price;
  }
  public String toString(){
    return topName+" "+"("+topPrice+")"+"\n";
  }
}