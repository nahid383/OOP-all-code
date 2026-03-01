public class Book {
    int bookID;
    String bookName;
    String bookAuthor;
    String yearofPub;
    float price;
    String status;
    
    void displayBookDetails(){
        System.out.println("Book ID: "+bookID);
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Author: "+bookAuthor);
        System.out.println("Year of Publications: "+yearofPub);
        System.out.println("Price of the Book: "+price);
        System.out.println("Book Status: "+status);
        
    }
    void addNewBooks(){
        System.out.println("New Book Added: " + bookName);
    } 
    void deleteBooks(){
        System.out.println("A Book Added: "+bookName);
    }
    void inquiryBook(){
        System.out.println("Book Enquiry Completed: "+bookName);
    }
}
