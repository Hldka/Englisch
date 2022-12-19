package advjavapractice.generics.interfaces;

public class Student {

    //Create constuctur
    public Student(String name) {
        this.name = name;
    }
//Create getter
    public String getName() {
        return name;
    }
//create setter
    public void setName(String name) {
        this.name = name;
    }

    String name;

}
