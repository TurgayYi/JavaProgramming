package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishedDate;

    public EncapsulationReview(String bookTitle, String publishedDate) {
        setBookTitle(bookTitle);
        this.publishedDate = publishedDate;
    }


    public String getBookTitle() {
        if (bookTitle==null){
            return "";
        }
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        if (bookTitle==null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishedDate() {
        return publishedDate;
    }


}
