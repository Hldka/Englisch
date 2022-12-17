package day06;

public class Q03StringManipulations {
    /*
    String shirPrice= "$ 12.99";
    String bookPrice= "$ 35.99";
    Type a code to find the sum of the shirt and book prices
     */
    public static void main(String[] args) {

        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";
        String shirt=shirtPrice.replace("$","");
        String book=bookPrice.replace("$","");


      // How can i convert String to "Double"?? i should use Double wrapper class und put dot.
        // we can convert strings to double numeric values because it is not possible to operate math operations with strings

        double sd=Double.valueOf(shirt);
        double bd=Double.valueOf(book);
        System.out.println(sd+bd);







    }
}
