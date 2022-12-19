package advjavapractie.generics.classes.methods;

import java.util.Arrays;

public class Genericmethod {
    public static void main(String[] args) {
        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};
        //Tümlistleri yazdir
        printArray(stdList);
        printArray(pointList);
        printArray(gradeList);
        System.out.println("***************");
        ////2-öğrencileri isimlerine göre sıralayınız
sortedArray(stdList);
sortedArray(pointList);
sortedArray(gradeList);

    }public static <T> void printArray(T[]array){
        for (T w:array) {
            System.out.print(w+" ");

        }
        System.out.println();
    }public static <T> void sortedArray(T[] array){
        Arrays.stream(array).sorted().forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
}
