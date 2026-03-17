package src;
import javax.swing.*;
//klass för att skapa ett enkelt ui i java
public class Userinterface {
    public void userinterface(){
        System.out.println("ui kopplat!");
        //skapa programfönster med titel.
        JFrame frame = new JFrame("Mitt program");
        //skapa textruta
        JTextField  textField = new JTextField("Sök bok",20);
        //sätt dimensioner
        textField.setBounds(150, 50, 200, 30);
        //skapa knapp
        JButton button = new JButton("Hej och välkommen!");
        //sätt dimensioner
        button.setBounds(150,150, 220, 150);
        //appenda till programfönster(appendchild?)
        frame.add(button);
        frame.add(textField);
        //sätt dimensioner på programfönster.
        frame.setSize(500, 500);
        //tar bort defualt style? display block??, position absolute??
        frame.setLayout(null);//denna gör så man måste sätta storlek på alla komponenter.
        frame.setVisible(true);
    }
}
