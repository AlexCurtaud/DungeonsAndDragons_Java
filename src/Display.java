public class Display {
    // Empty properties, this method is made only to display information
    // Display Method
    public void messageDisplay(String message) {
        System.out.println(message);
    }

    public void statusDisplay(int type, Character character) {
        if (type == 1) {
            System.out.println(character.getHealth());
        } else {
            System.out.println(character.getHealth());
        }
    }
}
