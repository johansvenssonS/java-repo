public class Book {
    private String title;
    private int pages;
    private String author;

    public Book(String title, int pages, String author){
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getPages(){
        return this.title;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
}
