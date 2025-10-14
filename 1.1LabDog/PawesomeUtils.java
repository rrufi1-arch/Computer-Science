public class PawesomeUtils {
    public static String generateDogTag(int dogId, char dogChar) {
        return Integer.toString(dogId) + dogChar;
    }

    public static char generateDogChar(int dogId) {
        int hundredsDigit = (int) (dogId / 100);
        int tenthsDigit = (int) ((dogId / 10) % 10);
        int onesDigit = (int) (dogId % 10);
        int combinedIdValue = hundredsDigit + tenthsDigit + onesDigit;
        return (char) ('F' + (combinedIdValue % 10));
    }

    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner " + personName;
        }
        return "Unknown owner.";
    }

    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog) == false) {
            System.out.println("Dog was not checked in.");
        } else {
            dog.setOwnerName(personName);
            dog.setStillInFacility(true);
            System.out.println("Dog was checked in successfully.");
        }
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) (Math.random() * (899) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        validateDogId(dogId);
        char dogChar = generateDogChar(dogId);
        String newDogTag = "" + dogId + dogChar;
        if (newDogTag.equals(dog.getDogTag())) {
            return true;
        }
        return false;

    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            return 15;
        } else if (dog.getAge() == 2) {
            return 24;
        } else {
            return 24 + ((dog.getAge() - 2) * 5);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears > 15 && humanYears <= 24) {
            return 2;
        } else {
            return 2 + (int) ((humanYears - 24) / 5);
        }
    }
}
