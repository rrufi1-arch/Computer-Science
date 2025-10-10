public class DogTester {
    public static void main(String[] args) {
        PawesomeUtils.validateDogId(213);
        Dog d1 = new Dog("bob", "bobowner", 11, 214);
        Dog d2 = new Dog("frank", "frankowner", 1, 993);
        Dog d3 = new Dog("bill", "billowner", 23, 506);
        System.out.println(PawesomeUtils.validateDogTag(d1));
        System.out.println(PawesomeUtils.validateDogTag(d2));
        System.out.println(PawesomeUtils.validateDogTag(d3));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d1));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d2));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(d3));
        System.out.println(PawesomeUtils.convertAgeToDogYears(100));
        System.out.println(PawesomeUtils.convertAgeToDogYears(30));
        System.out.println(PawesomeUtils.convertAgeToDogYears(0));
    }
}
