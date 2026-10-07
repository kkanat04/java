package lab3.Dog;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Rex";
        dog1.age = 3;

        Dog dog2 = new Dog();
        dog2.name = "Bella";
        dog2.age = 5;

        System.out.println(dog1.name + " " + dog1.age);
        System.out.println(dog2.name + " " + dog2.age);
    }
}
