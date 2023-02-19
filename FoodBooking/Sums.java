package FoodBooking;

public class Sums extends Window{
    public static double mealtotal() {
       return Double.parseDouble(jp2_food1_Field.getText()) * 100 + Double.parseDouble(jp2_food2_Field.getText()) * 100 + Double.parseDouble(jp2_food3_Field.getText()) * 100 + Double.parseDouble(jp2_food4_Field.getText()) * 100 + Double.parseDouble(jp2_food5_Field.getText()) * 100 ;
    }
    public static double mealreceipt() {
       return Double.parseDouble(jp2_food1_Field.getText())+ Double.parseDouble(jp2_food2_Field.getText())+ Double.parseDouble(jp2_food3_Field.getText())+ Double.parseDouble(jp2_food4_Field.getText())+ Double.parseDouble(jp2_food5_Field.getText()) ;
       }
        
    public static double drinkstotal() {
       return Double.parseDouble(jp3_food1_Field.getText()) * 100 + Double.parseDouble(jp3_food2_Field.getText()) * 100 + Double.parseDouble(jp3_food3_Field.getText()) * 100 + Double.parseDouble(jp3_food4_Field.getText()) * 100 + Double.parseDouble(jp3_food5_Field.getText()) * 100 ;
    }
       
    public static double totalmade() {
       return Double.parseDouble(jp2_food1_Field.getText()) * 100 + Double.parseDouble(jp2_food2_Field.getText()) * 100 + Double.parseDouble(jp2_food3_Field.getText()) * 100 + Double.parseDouble(jp2_food4_Field.getText()) * 100 + Double.parseDouble(jp2_food5_Field.getText()) * 100  + Double.parseDouble(jp3_food1_Field.getText()) * 100 + Double.parseDouble(jp3_food2_Field.getText()) * 100 + Double.parseDouble(jp3_food3_Field.getText()) * 100 + Double.parseDouble(jp3_food4_Field.getText()) * 100 + Double.parseDouble(jp3_food5_Field.getText()) * 100 ;
      
    }
        
    public static double drinkreceipt() {
       return Double.parseDouble(jp3_food1_Field.getText())+ Double.parseDouble(jp3_food2_Field.getText())+ Double.parseDouble(jp3_food3_Field.getText())+ Double.parseDouble(jp3_food4_Field.getText())+ Double.parseDouble(jp3_food5_Field.getText()) ;
    }
   
    public static double subtotal() {
      return (Double.parseDouble(jp2_food1_Field.getText()) * 100 + Double.parseDouble(jp2_food2_Field.getText()) * 100 + Double.parseDouble(jp2_food3_Field.getText()) * 100 + Double.parseDouble(jp2_food4_Field.getText()) * 100 + Double.parseDouble(jp2_food5_Field.getText()) * 100  + Double.parseDouble(jp3_food1_Field.getText()) * 100 + Double.parseDouble(jp3_food2_Field.getText()) * 100 + Double.parseDouble(jp3_food3_Field.getText()) * 100 + Double.parseDouble(jp3_food4_Field.getText()) * 100 + Double.parseDouble(jp3_food5_Field.getText()) * 100) * 0.025;
    }

    public static double total() {
      return (Double.parseDouble(jp2_food1_Field.getText()) * 100 + Double.parseDouble(jp2_food2_Field.getText()) * 100 + Double.parseDouble(jp2_food3_Field.getText()) * 100 + Double.parseDouble(jp2_food4_Field.getText()) * 100 + Double.parseDouble(jp2_food5_Field.getText()) * 100  + Double.parseDouble(jp3_food1_Field.getText()) * 100 + Double.parseDouble(jp3_food2_Field.getText()) * 100 + Double.parseDouble(jp3_food3_Field.getText()) * 100 + Double.parseDouble(jp3_food4_Field.getText()) * 100 + Double.parseDouble(jp3_food5_Field.getText()) * 100) + ((Double.parseDouble(jp2_food1_Field.getText()) * 100 + Double.parseDouble(jp2_food2_Field.getText()) * 100 + Double.parseDouble(jp2_food3_Field.getText()) * 100 + Double.parseDouble(jp2_food4_Field.getText()) * 100 + Double.parseDouble(jp2_food5_Field.getText()) * 100  + Double.parseDouble(jp3_food1_Field.getText()) * 100 + Double.parseDouble(jp3_food2_Field.getText()) * 100 + Double.parseDouble(jp3_food3_Field.getText()) * 100 + Double.parseDouble(jp3_food4_Field.getText()) * 100 + Double.parseDouble(jp3_food5_Field.getText()) * 100)*0.025);
    }
}
