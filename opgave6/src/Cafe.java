import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();


    public void loadMenuData() {
        File file = new File("src/coffees.txt");
        try {
            Scanner scn = new Scanner(file);

            while (scn.hasNextLine()) {
                coffeeMenu.add(scn.nextLine());
            }
        }
        catch (FileNotFoundException nfx) {
            System.out.println("File not found");
            System.out.println(nfx.getMessage());
        }

    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
}
