
public class Dog {
    String name;
    int age;
    String breed;
    Dog(String name, int age, String breed){
        this.name = name;
        this.age = age;
        this.breed=breed;
    }

    void bark(){
        System.out.println(name + " is barking.");
    }
    void spin(){
        System.out.println(name + " is spinning.");
    }
    void run(){
        System.out.println(name + "is running.");
    }
}
