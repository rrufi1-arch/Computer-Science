public class PurrfectUtils {
    public static String determineCatMood(Cat cat) {
        String petting;
        String mood;
        if (cat.getMoodLevel() > 7) {
            petting = "appreciated";
            mood = "in a great mood.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            petting = "acceptable";
            mood = "reminiscing of a past life.";
        } else {
            petting = "exetremely risky";
            mood = "plotting revenge.";
        }
        return "Currently, " + cat.getName()
            + " is " + mood + ".\n Petting is " + petting + ".";
    }

    public static char generateCatChar(String catId) {
        char letter = 0;
        for (int i = 0; i <= catId.length(); i++) {
            letter += Integer.valueOf(catId.charAt(i));
        }
        letter = (char) ((letter % 26) + 65);
        return letter;
    }

    public static int generateRandomNumber(int low, int high) {
        return (int) Math.random() * (high - low) + low;
    }

    public static String validateCatId(String catId) {
        if (Integer.valueOf(catId) >= 1000 && Integer.valueOf(catId) <= 9999) {
            return catId;
        }
        return String.valueOf(generateRandomNumber(1000, 9999));
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel > 10) {
            return 10;
        } else if (moodLevel < 0) {
            return 0;
        }
        return moodLevel;
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println("Petting failed...");
        } else if (cat.getMoodLevel() < 2 && cat.isHungry() == false) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
            System.out.println("Petting successful!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int randomInt = generateRandomNumber(0, 100);
        if (randomInt > 50) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
            System.out.println(cat.getName() + " did not like that...");
        } else if (randomInt <= 50) {
            cat.setMoodLevel(cat.getMoodLevel() - 2);
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Cleaning the litter box...");
        System.out.println("Done!");
        System.out.println(cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        cat.setHungry(false);
        System.out.println("Filling up " + cat.getName() + "\'s bowl...");
        System.out.println("Done!");
        System.out.println(cat.getName() + " is eating...");
        System.out.println(cat.getName() + " is full!");
    }
}
