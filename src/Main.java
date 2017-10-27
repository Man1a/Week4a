import Animal.Cat;
import Animal.Dog;

public class Main {

    //class variable or instance variable
    //four types of variable declarations
    //public, private, protected, or package private


    public static void main(String[] args) {
        //local variable
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog.getName());

        dog.addFleas(9);
        System.out.println(dog.getFleas());
        System.out.println(dog.getColor());
        System.out.println(cat.getNoise());
        Dog.name = "Fluffy";

        System.out.println("in Main: " + dog.getName());
        System.out.println("in Main: " + dog.getColor());
    }
}
