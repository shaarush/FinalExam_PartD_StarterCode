package mobilemanufactureunit;

public class MobileManufactureLocation {

    // The single instance of the class, initially null
    private static MobileManufactureLocation instance;

    // Number of mobiles to be manufactured
    public int numofMobile = 0;

    // Private constructor to prevent instantiation from outside
    private MobileManufactureLocation() {
        // Intentionally left blank
    }

    // Method to provide the single instance of the class
    public static MobileManufactureLocation getInstance() {
        if (instance == null) {
            instance = new MobileManufactureLocation();
        }
        return instance;
    }

    // Method to order mobiles
    public void orderMobiles(int quantity) {
        numofMobile += quantity;
        System.out.println("Order placed for " + quantity + " mobiles. Total mobiles to manufacture: " + numofMobile);
    }
}
