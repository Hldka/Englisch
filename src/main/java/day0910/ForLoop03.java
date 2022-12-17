package day0910;

public class ForLoop03 {
    public static void main(String[] args) {


      //Type code to check if agiven integer is palindrome or not
      // palindrome : 121<==> 121 123321<==> nalan <==> nalan
      String ste="Nalan";
      String s="";
      int idx=ste.length()-1;
      while (idx>-1){
          s=s+ste.charAt(idx);
          idx--;
      }if (ste.equalsIgnoreCase(s)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        System.out.println("===============");
      String str12="ey edip adanada pide ye";
      String s2=" ";
      int idx2=str12.length()-1;
      while (idx2>-1){
          s2=s2+str12.charAt(idx2);
          idx2--;
      }if (ste.equalsIgnoreCase(s)){
            System.out.println("palindrome");
        }else {
            System.out.println("Not Palindrome");
        }







    }
}
