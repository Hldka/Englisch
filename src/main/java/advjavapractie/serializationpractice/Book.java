package advjavapractie.serializationpractice;

public class Book {
    public Book(String name, String author, Integer publishDate) {
        this.name = name;
        this.author = author;
        this.publishDate = publishDate;
    }

    /*
     Not: ObjectOutputStream sınıfı yalnızca Serializable arabirimini uygulayan nesneleri yazar.
     Bunun nedeni, nesnelerin akışa yazılırken serileştirilmesi gerekmesidir.
    */

    @Override
    public String toString() {
        return "SeralizationPractice{" +
                "author='" + author + '\'' +
                ", publishDate=" + publishDate +
                ", name='" + name + '\'' +
                '}';
    }

    private String author;
    private Integer publishDate;

    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Integer publishDate) {
        this.publishDate = publishDate;
    }


}
