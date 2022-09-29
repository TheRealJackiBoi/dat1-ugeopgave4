import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();

        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");

        Menu menu = new Menu(actions);


        doAction(menu.showMenu());
    }

    public static void doAction(int action) {
        switch (action) {
            case 1 -> System.out.println("Starting the game now");
            case 2 -> System.out.println("Fetching previously saved data");
            case 3 -> System.out.println("Game paused");
            case 4 -> System.out.println("Ending game");
            default -> System.out.println("invalid input");
        }
    }
}