public class Main {
    public static void main(String[] args) {
        Cafe jackcafe = new Cafe();

        jackcafe.loadMenuData();

        for (String option :
                jackcafe.getCoffeeMenu()) {
            System.out.println(option);
        }
    }
}