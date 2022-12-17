package day0910;

public class ForLoop {
    public static void main(String[] args) {



/*
Tom Hanks
 */




String s="Tom Hanks";
String sn=" ";
for (int i=s.length()-1;i>=0;i--){
    sn=sn+s.charAt(i);


} System.out.print(sn);
String fullName="  Tom Hanks   ";
String  initialFirstname=fullName.trim().substring(0,1).toUpperCase();
        System.out.println("Initial of first name ist:"+initialFirstname);
        String initialLastName=fullName.trim().split(" ")[1].substring(0,1).toUpperCase();
        System.out.println("Initial of Last name ist : "+initialLastName);







    }
}
