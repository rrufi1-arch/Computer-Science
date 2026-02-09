import java.util.ArrayList;

public class Shelter {
    private Dog[][] kennels;

    public Shelter(int rows, int cols) {
        if (rows < 0 || cols < 0) {
            throw new IllegalArgumentException("Row and Columns must not be negative.");
        }
        kennels = new Dog[rows][cols];
    }

    public Shelter() {
        kennels = new Dog[3][3];
    }

    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    public void add(Dog animal) {
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
    }


    public void add(Dog animal, int row, int col) {
        if (row > kennels.length || col > kennels[0].length) {
            throw new IllegalArgumentException("Row and Columns must not be negative.");
        }
        if (kennels[row][col] == null) {
            kennels[row][col] = animal;
        } else {
            add(animal);
        }
    }

    public void add(ArrayList<Dog> animals) {
        for (Dog animal : animals) {
            add(animal);
        }
    }

    public Dog adopt(int row, int col) {
        if (row > kennels.length || col > kennels[0].length) {
            throw new IllegalArgumentException("Row and Columns must be valid values.");
        }
        Dog dogToAdopt = kennels[row][col];
        if (kennels[row][col] != null) {
            return dogToAdopt;
        } else {
            throw new IllegalArgumentException("Cannot reference null slot.");
        }
    }

    public ArrayList<Dog> search(String name) {
        ArrayList<Dog> returnList = new ArrayList<>(0);
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                if (kennels[i][j].getName().equals(name)) {
                    returnList.add(kennels[i][j]);
                }
            }
        }
        return returnList;
    }

    public ArrayList<Dog> search(int age) {
        ArrayList<Dog> returnList = new ArrayList<>(0);
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels.length; j++) {
                if (kennels[i][j].getAge() == age) {
                    returnList.add(kennels[i][j]);
                }
            }
        }
        return returnList;

    }
}
