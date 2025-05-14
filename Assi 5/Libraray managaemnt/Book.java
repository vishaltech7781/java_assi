package Library;

public class Book{
    public String title;
    public String author;
    public int ISBN;

    public void setinfo(String title, String author, int ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void getinfo(){
        System.out.println("Book name is : "+title);
        System.out.println("Author name is : "+author);
        System.out.println("ISBN no. is : "+ISBN);
    }

}