import java.awt.*;
import javax.swing.*;
import java.net.URL;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OKNO {

    JFrame okienko;
    JButton WITAM,botBezMyszkiDESKTOP,testerMyszki;
    JLabel DBLabel,test,version, obrotyPetli;
    JTextField x,y;
    JRadioButton radioOdGory, radioOdDolu, radioOdLewej, radioOdPrawej;
    JCheckBox naprawaEQ;

    boolean wybranyOdGory = true;
    boolean wybranyOdDolu = false;
    boolean wybranyOdPrawej = false;
    boolean wybranyodLewej = false;
    boolean czyNaprawiacEq = false;

    int xMyszki,yMyszki;

    public void utworzOkno() {
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // start application
            okienko = new JFrame("DBLBOT v4.0 anty-afk + eq repair");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        /*try
        {
            UIManager.setLookAndFeel( "com.seaglasslookandfeel.SeaGlassLookAndFeel" );
            okienko = new JFrame("DBLBOT v4.0 anty-afk + eq repair");

        }
        catch ( Exception e )
        {
            e.printStackTrace();
        }*/
        //okienko = new JFrame("DBLBOT v4.0 anty-afk + eq repair");









        URL iconURL = getClass().getResource("favicon.png");
    // iconURL is null when not found
        ImageIcon icon = new ImageIcon(iconURL);
        okienko.setIconImage(icon.getImage());

        JLabel background = new JLabel(new ImageIcon("C:\\Users\\Ryszard\\Desktop\\robotto\\src\\gohan.jpg"));
        okienko.add(background);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuItem1 = new JMenuItem("Hejo!");
        menu.add(menuItem1);
        menuBar.add(menu);
        okienko.setJMenuBar(menuBar);



        JLabel zapychacz1 = new JLabel("\n");
        JLabel zapychacz2 = new JLabel("\n");
        JLabel zapychacz3 = new JLabel("\n");
        obrotyPetli = new JLabel("Wykonano obrotow petli: 0");
        JLabel zapychacz4 = new JLabel("\n");

        okienko.pack();
        okienko.setVisible(true);
        okienko.setSize(655, 373);
        okienko.setLocationRelativeTo(null);
        okienko.setDefaultCloseOperation(3);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p2.setBorder(BorderFactory.
                createTitledBorder("Inne"));


        radioOdDolu = new JRadioButton("od dolu");
        radioOdGory = new JRadioButton("od gory");
        radioOdLewej = new JRadioButton("od lewej");
        radioOdPrawej = new JRadioButton("od prawej");

        JLabel stoje = new JLabel("Stoje od: ");
        p2.add(stoje);
        ButtonGroup group = new ButtonGroup();
        group.add(radioOdDolu);
        group.add(radioOdGory);
        group.add(radioOdLewej);
        group.add(radioOdPrawej);

        p2.add(radioOdGory);
        p2.add(radioOdDolu);
        p2.add(radioOdLewej);
        p2.add(radioOdPrawej);
        p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
        for(int i=0;i<10;i++){
            p2.add(new JLabel("\n"));
        }

       naprawaEQ = new JCheckBox("Naprawianie EQ");
        p2.add(naprawaEQ);



        radioOdGory.doClick();


        okienko.add(p2, BorderLayout.EAST);



        p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
        WITAM = new JButton("dblots.pl");
        WITAM.addActionListener(e->{
            try {
                URI uri = new URI("http://dblots.pl");
                Desktop desktop = null;
                if (Desktop.isDesktopSupported()) {
                    desktop = Desktop.getDesktop();
                }

                if (desktop != null)
                    desktop.browse(uri);
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        });
        DBLabel = new JLabel("Dragon Ball Legend");
        test = new JLabel("Dziala co 13 minut");
        JLabel xLabel = new JLabel("x ikony dbl");
        JLabel yLabel= new JLabel("y ikony dbl");
        testerMyszki = new JButton("Rusz myszke");
        botBezMyszkiDESKTOP = new JButton("DBL Anty-AFK DESKTOP START");
        JLabel bezmyszkiLabel = new JLabel("DBL daj na 1 slot na pasku zadan");
        version = new JLabel("v4.0");


        p1.add(WITAM);
        p1.add(test);
        p1.add(zapychacz1);
        x = new JTextField("125");
        y = new JTextField("1050");
        p1.add(x);
        p1.add(xLabel);
        p1.add(y);
        p1.add(yLabel);
        p1.add(testerMyszki);
        p1.add(zapychacz2);
        p1.add(obrotyPetli);


        p1.add(botBezMyszkiDESKTOP);
        p1.add(bezmyszkiLabel);
        p1.add(zapychacz4);
        p1.add(version);

        p1.add(DBLabel);


        //wazne! dodanie panelu do okna
        okienko.add(p1, BorderLayout.WEST);
        p1.setBackground(Color.LIGHT_GRAY);
        p1.setBorder(BorderFactory.
                createTitledBorder("Opcje"));



            //robienie menu



        }
        public int getxMyszki() {

            String i = x.getText();
            int val = Integer.parseInt(i);
            return val;

        }

        public int getyMyszki() {

            String i = y.getText();
            int val = Integer.parseInt(i);
            return val;

        }


}



