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
        if (dog.ownerName == personName) {
            dog.stillInFacility = false;
            return dog.name + " has been picked up by their owner " + personName;
        }
        return "Unknown owner.";
    }

    public static void checkIn(Dog dog, String personName) {
        dog.ownerName = personName;
        dog.stillInFacility = true;
        }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        }
        else {
            return (int) (Math.random() * (899) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        dogId = dog.getDogId();
        validateDogId(dogId);
        dogChar = generateDogChar(dogId);
        newDogTag = dogId + dogChar;
        if ()

    }
}
