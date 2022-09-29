import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList<String> options = new ArrayList<>();

    Menu(ArrayList<String> options) {
        this.options = options;
    }

    public int showMenu() {
        Scanner scn = new Scanner(System.in);

        System.out.println("Type a number to choose");
        for (String o :
                options) {
            System.out.println(o);
        }
        return scn.nextInt();
    }
}
