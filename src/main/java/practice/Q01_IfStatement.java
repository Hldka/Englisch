package practice;

import java.util.Scanner;

public class Q01_IfStatement {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your grade...");
        int scor=input.nextInt();
        if(scor>=50){
            System.out.println("You passed");
        } else {
            System.out.println("You failed");

        }
/*
        if (scor<50){
            System.out.println("You failed");
        }
        if (scor>=50){
            System.out.println("You passed");
        }

*/



    }
}
