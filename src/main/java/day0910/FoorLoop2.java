package day0910;

import java.util.Scanner;

public class FoorLoop2 {
    public static void main(String[] args) {

   /*
   username is "admin",password is "pws123"
   ask user to enter username and password
   user should see "Enter your username and password"message
   is user enters correct   credentials,  he should get 2you are in your account"message
   otherwise, he should see" Enter your username and password" message 3 times
   After 3 times he should get" Your account  is blocked" message
    */
        Scanner scan=new Scanner(System.in);
        int counter=0;
        do {
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your user name");
            String username =scan.next();
            System.out.println("Enter your password");
            String password=scan.next();
            counter++;
            if(username.equals("admin")&&password.equals("pwd123")){
                System.out.println("you are in your account");
                break;
            }
        }while (true);







}
}


