public class NameOps {
    public static String printMethodCall(String method, String name) {
        return method + "(" + name + "): ";
    }

    public static String whoIsAwesome(String name) {
        return "\"" + name + " is awesome!\"";
    }

    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    public static int indexOfSecondSpace(String name) {
        return name.indexOf(" ", indexOfFirstSpace(name) + 1);
    }

    public static String findFirstName(String name) {
        if (name.indexOf(" ") != -1) {
            return name.substring(0, name.indexOf(" "));
        } else {
            return name;
        }
    }

    public static String findLastName(String name) {
        if (name.lastIndexOf(" ") != -1) {
            return name.substring(name.lastIndexOf(" "),name.length());
        } else {
            return "";
        }
    }

    public static String findMiddleName(String name) {
        if (name.indexOf(" ") != -1) {
            if (name.lastIndexOf(" ") != name.indexOf(" ")) {
                return name.substring(name.indexOf(" ") - 1, name.lastIndexOf(" "));
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        if (name.indexOf(" ") != -1) {
            if (name.lastIndexOf(" ") != name.indexOf(" ")) {
                return "\"" + findLastName(name) + ", " + findFirstName(name) + 
                    " " + findMiddleName(name).charAt(0) + ".\"";
            } else {
                return "\"" + findLastName(name) + ", " + findFirstName(name) + ".\"";
            }
        } else {
            return "\""+name+"\"";
        }
    }
}
