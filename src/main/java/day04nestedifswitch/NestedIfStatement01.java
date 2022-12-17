package day04nestedifswitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {

       /*
       Ask user to enter a password if the initial of the password is uppercase Chack if it is 'A' or not.
       if it is 'A' the output will bw "valid Password" otherwise the output will be "Invalid Password"
       For example ; Ali ==> Valid password  ali ==> Invalid   - Mark ==>invalid

       if initial of the password is lowercase
       Check if it is 'z' or not.
               if it is 'Z' the output will be "vlid Password"
               otherwise the output will bve "Invalid Password"
               for example;zoe==> Valid password - Zoe==> Invalid -John ==>Invalid
               */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Password");
        char pwdInitial =input.next().charAt(0);//CharArt() method returns just a single chatacter,data type in java for single character is "char".
                                         // Because of that i used char data type for the pwd container

        if(pwdInitial>'A' && pwdInitial<='Z') {
            if (pwdInitial == 'A') {
                System.out.println("Valid password");
            } else {
                System.out.println("Valid password");
            }


        } else if (pwdInitial>='a' && pwdInitial<='z') {
if(pwdInitial=='z') {
            System.out.println("Invalid passsword");
        } else {
            System.out.println();
        }} else {
            System.out.println("Invalid Password");
        }





    }
}
