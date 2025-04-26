public class CarrierPlan {
  public static void main(String[] args) {
    String plan = "T";

    switch (plan) {
      case "T":
        System.out.println("5GB YouTube");
        break;
      case "M":
        System.out.println("WhatsApp For Free");
        break;
      case "B":
        System.out.println("100 Minutes Of Call");
        break;
      default:
        System.out.println("Invalid Plan.");
        break;  
    }
  }
}
