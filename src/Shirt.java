public class Shirt {
  public int shirtID = 1;
  public String description = "-Light wond ers-";
  public char colorCode = "Red";
  public double price = 40.0; 
  public int quantityInStock = 100000000; 
  
  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } 
} 
