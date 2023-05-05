abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("I have created a animal ");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("I have created a Horse");
    }
    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("I have created a chicken");
    }
    void walk(){
        System.out.println("Chicken walks on 2 lega");
    }
}
public class Naveen1_3 {
    public static void main(String [] args){
        Horse horse = new Horse();
        horse.walk();



    }
}
