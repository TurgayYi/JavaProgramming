package day36_Inheritance.bookTask;

public class Book {

    private String title, type, author;
    private double price;


    public void setInfo(String title, String type, String author, double price) {
        setTitle(title);
        setType(type);
        setAuthor(author);
        setPrice(price);
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }


    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }


    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public double getPrice(){

       return price ;
    }
    public void setPrice(double price){
        if(price <= 0){
            return;
        }
        this.price = price;
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';

    }


}
/*
	3.2 Create a sub class of Book named EBook:
			variables:
				title, type, author, price, size, pages

			Methods:
				setInfo()
				readBook()
				toString()
 */