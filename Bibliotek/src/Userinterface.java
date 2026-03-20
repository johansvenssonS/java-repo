
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
//klass för att skapa ett enkelt ui i java
public class Userinterface {
    public void userinterface(){
        //skapa programfönster med titel.
        JFrame frame = new JFrame("Biblioteksystem");
        //sätt dimensioner på programfönster.
        frame.setSize(500, 500);
        //delas in i zooner tydligen, norr,center ,south osv.
        frame.setLayout(new BorderLayout()); // layout för swing

        JPanel topBody = createTopBody(frame);
        //appenda till programfönster(appendchild?)
        //NORTh lägger elementet högst upp ^
        frame.add(topBody, BorderLayout.NORTH);
        //createTable(frame);

        frame.setVisible(true);

    }
    public JPanel createTopBody(JFrame frame){
        //skapa textruta
        JTextField  textField = new JTextField("Sök bok",20);
        JButton button = new JButton("Main menu!");
        JButton allBtn = new JButton("Alla Böcker");
        //event för att göra allmäna queeryn
        allBtn.addActionListener(e -> createTable(frame));
        button.addActionListener(e -> userinterface());
        //ska fungera som en <div> container
        JPanel topBody = new JPanel();
        topBody.add(textField);
        topBody.add(button);
        topBody.add(allBtn);
        return topBody;
    }
    public void rerender(JFrame frame){
        //säger till layouten att räkna om dimensioner antar jag
        frame.revalidate();
        // ritar om det visuella refreshar?
        frame.repaint();
    }
    public void createTable(JFrame frame){

        String[] columnNames = {"Titel", "Publicerad", "Antal tillgängliga", "Sammanfattning", "Språk", "Antal sidor", "Författare"};

        BookRepository bookRepository = new BookRepository();
        ArrayList<Book> books = bookRepository.getAllBooks();

        Object[][] data = new Object[books.size()][7];
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            data[i][0] = b.getTitle();
            data[i][1] = b.getYearPublished();
            data[i][2] = b.getAvailableCopies();
            data[i][3] = b.getSummary();
            data[i][4] = b.getLanguage();
            data[i][5] = b.getPageCount();
            data[i][6] = b.getAuthor();
        }
        JTable table = new JTable(data,columnNames);
        JScrollPane tabelParent = new JScrollPane(table);


        frame.add(tabelParent, BorderLayout.CENTER);
        rerender(frame);

    }

}
