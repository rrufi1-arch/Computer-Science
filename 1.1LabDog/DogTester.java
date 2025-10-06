public class DogTester {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println(Dog.generateDogChar(123));
        System.out.println(Dog.generateDogChar(456));
        System.out.println(Dog.generateDogChar(789));
        System.out.println(Dog.pickup(myDog, "Maria"));
        System.out.println(Dog.pickup(myDog, "John"));
        Dog.checkIn(myDog, "MAXTOONNNNNN");
    }
}
