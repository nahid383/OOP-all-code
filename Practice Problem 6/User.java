public class User {
    int userID;
    String userName;
    String userAddress;
    String phoneNo;

    void returnBooks(){
        System.out.println(userName + " Book is returned.");
    }
    int payFine(String dt){
        System.out.println(userName + " paid fine on " + dt);
        return 0;
    }

    void addNewUser(){
        System.out.println("New user Added: "+ userName);
    }
    void deleteUser(){
        System.out.println("User deleted: "+ userName);
    }
    void updateDetails(){
        System.out.println("User details updated: "+userName);
    }
    void bookPurchase(){
        System.out.println(userName + " purchased book");
    }

}
