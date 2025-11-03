public class CleanUtils {
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        } else if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        }
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        String finishedName = "";
        String randomNumber = String.valueOf((int) (Math.random() * (100) + 1950));
        int i = 0;
        while (i < name.length() + 2) {
            if (name.substring(i, i + 1).equals(" ")) {
                finishedName += "@" + name.substring(0,i).toLowerCase() + "_"
                    + name.substring(i + 1, name.length()).toLowerCase() + "_"
                    + randomNumber;
                break;
            }
            i += 1;
        }
        return finishedName;
    }

    public static String fixName(String name) {
        String firstName = "";
        String lastName = "";
        String totalName = "";
        for (int i = 0, i < name.length(), i++) {
            if (name.substring(i, i+1) != " "){

            }
        }
    }
}
