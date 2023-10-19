package Memento;

public class TextField {

    private StringBuilder textFieldText;
    private TextFieldMemento memento;


    public void save() {
        this.memento = new TextFieldMemento(textFieldText.toString());
    }

    public void write(String text) {
        textFieldText.append(text);
    }

    public void restore() {
        this.textFieldText = new StringBuilder(memento.getText());
    }

    public String getCurrentText() {
        return memento.getText();
    }

    public TextField(TextFieldMemento memento) {
        this.textFieldText = new StringBuilder();
        this.memento = memento;
    }
}
