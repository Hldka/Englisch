package advjavapractice.generics.classes;
/*
==Generic Types==
-Java 5 ile geldi
-Farklı data tipleri ile aynı yapıyı kullanabilme
-Tip güvenliği sağlar, castinge gerek olmaz
-CTE verir.
-Generics primitive data tipi ile çalışmaz.

Task: 1) Java dersi için, öğrencileri isim, vize notu ve final notunu  ile birlikte listeleyen bir program yazınız.
      2) Kütüphane için, öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız.
*/
public class StudentList {
    public static void main(String[] args) {
        System.out.println("**** Java dersi Vize ve final notlari*****");
        ListGrade();
        System.out.println(" ====Kütüphane Üye Listesi===");
listMemberOfLibrary();
    }//ögrencilerin notlarini listeleyen bir method yaziniz...
    public static void ListGrade(){
        Student<String,Double,Double> std1=new Student<>("Wilma",76.80,80.0);
        Student<String,Double,Double> std2=new Student<>("Fred",66.80,90.0);
        Student<String,Double,Double> std3=new Student<>("Barnie",86.80,89.0);
        System.out.printf("%-8s || %4s  || %4s || %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-8s || %4s  || %4s || %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-8s || %4s  || %4s || %n",std3.getS(),std3.getU(),std3.getV());


    }
    //kütüphane üye ögrenci listesini yazdiran bir method yaziniz
    public static void  listMemberOfLibrary(){
        Student<String,Integer,String> std1=new Student<>("Cakil",567,"cakil@gmail.com");
        Student<String,Integer,String> std2=new Student<>("bambam",767,"bambam@gmail.com");
        Student<String,Integer,String> std3=new Student<>("dino",568,"dino@gmail.com");

        System.out.printf("%-10s || %4s  || %4s || %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4s  || %4s || %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4s  || %4s || %n",std3.getS(),std3.getU(),std3.getV());
    }
}
