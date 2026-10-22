package n03_e01_noticiesEsportives;

public class Main {

    public static void main(String[] args) {
        Newsroom nr = new Newsroom();
        ConsoleUI ui = new ConsoleUI(nr);

        int option;
        do {
            ui.showMenu();
            option = ui.getOption();
        } while (option != 0);
    }

}
