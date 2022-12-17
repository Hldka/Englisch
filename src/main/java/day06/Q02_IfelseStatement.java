package day06;

import java.util.Scanner;

public class Q02_IfelseStatement {
    public static void main(String[] args) {
    /* Ask user to enter his weight    and height. Calculate body index of the user.
    To Calculate body mass index use "bodyMassIdx= Weight / squareofHeigth" formula.
    ** 1) body mass inx less than 18.5==> "You are weak".
    ** 2) bodyMaxInx between 18.5-25==> your weight ist ideal
    ** 3) bodyMassIndex between 25-30==> You are fat
    ** 4) bodyMassIndex greater than 30==> Obese

*/


        Scanner input= new Scanner(System.in);
        System.out.println("Enter your Height  without cm ");
double height= input.nextDouble();
double squareofHeight=height*height;
        System.out.println("Enter to weight");
double  weight =input.nextDouble();
double bodyMassIndex= weight/squareofHeight;
        System.out.println("Your IBM IS: "+ bodyMassIndex);

if(bodyMassIndex>=0 && bodyMassIndex<=18.5){
    System.out.println("You are weak");
} else if (bodyMassIndex<= 25) {
    System.out.println("Your weight ist ideal");
} else if (bodyMassIndex<=30) {
    System.out.println("You are Fat");

} else if (bodyMassIndex>30) {
    System.out.println("Obese ");

}
else {
    System.out.println("ES is  nonvalid");
}
    }
}
