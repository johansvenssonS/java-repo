package src;
import javax.swing.*;
import java.awt.*;

//klass för att skapa ett enkelt ui i java
public class Userinterface {
    public void userinterface(){
        System.out.println("ui kopplat!");
        //skapa programfönster med titel.
        JFrame frame = new JFrame("Biblioteksystem");
        //sätt dimensioner på programfönster.
        frame.setSize(500, 500);
        //delas in i zooner tydligen, norr,center ,south osv.
        frame.setLayout(new BorderLayout()); // layout för swing
        //skapa textruta
        JTextField  textField = new JTextField("Sök bok",20);
        //sätt dimensioner//skapa knapp
        JButton button = new JButton("Hej och välkommen!");

        //ska fungera som en <div> container
        JPanel topBody = new JPanel();
        topBody.add(textField);
        topBody.add(button);

        //appenda till programfönster(appendchild?)
        //NORTh lägger elementet högst upp ^
        frame.add(topBody, BorderLayout.NORTH);
        createTable(frame);

        frame.setVisible(true);

    }
    public void createTable(JFrame frame){
        String[] columnNames = {"First Name", "Last Name", "Sport", "# of Years", "Vegetarian"};
        Object[][] data = {
                {"Kathy", "Smith", "Snowboarding", 5, false},
                {"John", "Doe", "Rowing", 3, true},
                {"Sue", "Black", "Knitting", 2, false},
                {"Jane", "White", "Speed reading", 20, true},
                {"Joe", "Brown", "Pool", 10, false}
        };
        JTable table = new JTable(data,columnNames);
        JScrollPane tabelParent = new JScrollPane(table);


        frame.add(tabelParent, BorderLayout.CENTER);


    }
}
