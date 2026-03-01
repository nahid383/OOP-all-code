

public class Car {
    String name;
    String brandName;
    int serNum;
    Car(String name, String brandName, int serNum){
        this.name = name;
        this.brandName = brandName;
        this.serNum = serNum;
    }
    void start(){
        System.out.println(name + "'s " + brandName  + "'s started to run.");

    }
    void stop(){
        System.out.println(name + "'s " + brandName  + "'s stopped.");
    }
    void fuelCheck(){
        System.out.println(name + "'s " + brandName  + "'s fuel is checked.");
    }
}
