public class BookDTO {
    private String title;
    private String summary;

    public BookDTO(String title, String summary) {
        this.title = title;
        this.summary = summary;
    }
    public static BookDTO mapToDto(Book book){
        return new BookDTO(book.getTitle(), book.getSummary());
    }

    public String getTitle() {
        return title;
    }

    public String getSummary() {
        return summary;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                '}';
    }

}
