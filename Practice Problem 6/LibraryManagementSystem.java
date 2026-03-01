

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book b = new Book();

        b.bookID = 101;
        b.bookName = "Java Programming";
        b.bookAuthor = "Games Gosling";
        b.yearofPub = "2020";
        b.price = 550.50f;
        b.status = "Available";
        b.displayBookDetails();

        User u = new User();
        u.userID = 1;
        u.userName = "Nahid Hasan";
        u.userAddress = "Sylhet";
        u.phoneNo = "01755373931";
        u.addNewUser();
        u.bookPurchase();
        u.returnBooks();
        u.payFine("2026-02-04");

        Publisher p = new Publisher();
        p.pubID=1;
        p.pubName="Tech Book Limited.";
        p.pubAddress = "Dhaka";
        p.phoneNo = "01887322190";
        p.addPub();
        p.modifyPub();
        p.deletePub();
        p.orderStatus();

        Librarian l = new Librarian();
        l.libID = 1;
        l.libName = "Ratul";
        l.searchBook(b.bookName);
        l.verifyMember(u.userID);
        l.orderBooks();
        l.sellBooks();

    }
}
