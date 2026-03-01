public class Publisher {
    int pubID;
    String pubName;
    String pubAddress;
    String phoneNo;

    void addPub(){
        System.out.println("New publisher added "+ pubName);
    }
    void modifyPub(){
        System.out.println("Publisher Modified " + pubName);
    }
    void deletePub(){
        System.out.println("Publisher Deleted "+ pubName);
    }
    void orderStatus(){
        System.out.println("Checking order status for publisher "+pubName);
    }
}
