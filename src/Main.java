import Memento.TextField;
import Memento.TextFieldMemento;

public class Main {
    public static void main(String[] args) {
        TextField textField = new TextField(new TextFieldMemento(""));

        textField.write("Bobik");
        textField.save();

        textField.write("AHAHA");

        System.out.println(textField.getCurrentText());

        textField.save();
        System.out.println(textField.getCurrentText());

        textField.restore();

        System.out.println(textField.getCurrentText());
    }
}
