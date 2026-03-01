public class Librarian {
    int libID;
    String libName;
    void searchBook(String name){
        System.out.println("Librarian " + libName + " is searching for "+ name);
    }
    void verifyMember(int id){
        System.out.println("Librarian " + libName + " verified member " + id);
    }
    void orderBooks(){
        System.out.println("Books ordered by librarian " + libName);
    } 
    void sellBooks(){
        System.out.println("Book sold by " + libName);
    }

}
