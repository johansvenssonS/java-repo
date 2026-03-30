
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
//klass för att skapa ett enkelt ui i java
public class Userinterface {
    private JFrame frame;
    private JPanel topPanel;
    private JScrollPane tabelParent;
    private JButton mainBtn;
    private JButton searchBtn;
    private JButton allBtn;
    private JButton clearBtn;
    private JTextField textField;
    private JTable table;
    private BookRepository bookRepository;
    private ArrayList<Book> books;
    private DefaultTableModel tableModel;


    public Userinterface(){
        //skapa programfönster med titel.
        frame = new JFrame("Biblioteksystem");
        //sätt dimensioner på programfönster.
        frame.setSize(500, 500);
        //delas in i zooner tydligen, norr,center ,south osv.
        frame.setLayout(new BorderLayout()); // layout för swing

        createTopBody(frame);
        //appenda till programfönster(appendchild?)
        //NORTh lägger elementet högst upp ^
        frame.add(topPanel, BorderLayout.NORTH);
        //createTable(frame);

        frame.setVisible(true);
        bookRepository = new BookRepository();
        books = bookRepository.getAllBooks();


    }
    public void createTopBody(JFrame frame){
        //skapa textruta
        mainBtn = new JButton("Nytt fönster!");
        textField = new JTextField("Harry Pott....",20);
        searchBtn = new JButton("Sök bok!");
        allBtn = new JButton("Alla Böcker");
        clearBtn = new JButton("X");
        //event för att göra queeries
        searchBtn.addActionListener(e -> searchBooks());
        allBtn.addActionListener(e -> createTable(books));
        mainBtn.addActionListener(e -> new Userinterface());
        allBtn.addActionListener(e -> clearTable());
        clearBtn.setBackground(Color.RED);

        //ska fungera som en <div> container
        topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        topPanel.add(mainBtn);
        topPanel.add(textField);
        topPanel.add(searchBtn);
        topPanel.add(allBtn);
        topPanel.add(clearBtn);
    }

    public void searchBooks(){
        String searchTerm = textField.getText();
        ArrayList<Book> searchedBooks =  bookRepository.searchBooks(searchTerm);
        createTable(searchedBooks);

    }
    public void rerender(){
        //säger till layouten att räkna om dimensioner antar jag
        frame.revalidate();
        // ritar om det visuella refreshar?
        frame.repaint();
    }
    public void clearTable(){
        if (tableModel != null){
            tableModel.setRowCount(0);
        }

    }
    public void createTable(ArrayList <Book> books){

        String[] columnNames = {"Titel", "Publicerad", "Antal tillgängliga", "Sammanfattning", "Språk", "Antal sidor", "Författare"};

        tableModel = new DefaultTableModel(columnNames, 0);
        for(Book b : books){
            tableModel.addRow(new Object[]{
                    b.getTitle(), b.getYearPublished(),b.getAvailableCopies(),
                    b.getSummary(),b.getLanguage(),b.getPageCount(),b.getAuthor()
            });
        }
        if(tabelParent != null){
            frame.remove(tabelParent);
        }

        table = new JTable(tableModel);
        tabelParent = new JScrollPane(table);


        frame.add(tabelParent, BorderLayout.CENTER);
        rerender();

    }

}
