package advjavapractie.multithreads.creation;

public class Sayac extends Thread{
    public Sayac(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public void run() {
        System.out.println(this.name+"  basladi  ");
        for (int i =0;i<=100;i++){
            System.out.println(this.name+" "+i);
        }
        System.out.println(this.name+" bitti");
    }
}
