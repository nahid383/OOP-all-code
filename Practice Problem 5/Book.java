
public class Book {
    String title;
    String author;

    Book(String title){
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display(){
        System.out.println("Title of the book: " + title);
        System.out.println("Author of the book: " + author);
    }

    
}
