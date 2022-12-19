package advjavapractice.generics.interfaces;

public class Teacher {
    //Create constuctor
    public Teacher(String name) {
        this.name = name;
    }
//create getter
    public String getName() {
        return name;
    }
//create setter
    public void setName(String name) {
        this.name = name;
    }

    String name;

}
