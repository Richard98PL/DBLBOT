import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {



        ROBOTTO robocik = new ROBOTTO();
        OKNO okno = new OKNO();
        okno.utworzOkno();
        try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
            // start application

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }





        okno.testerMyszki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                robocik.testMyszki(okno.getxMyszki(),okno.getyMyszki());
            }
        });



        okno.botBezMyszkiDESKTOP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Timer timer = new Timer();
                TimerTask akcjaBota2 = new TimerTask() {

                    int licznikPetli = 0;
                    @Override
                    public void run() {


                        if(okno.wybranyOdPrawej)robocik.botBezMyszkiDESKTOPPrawoLewo();
                        else if(okno.wybranyodLewej)robocik.botBezMyszkiDESKTOPLewoPrawo();
                        else if(okno.wybranyOdGory)robocik.botBezMyszkiDESKTOPGoraDol();
                        else if(okno.wybranyOdDolu)robocik.botBezMyszkiDESKTOPDolGora();
                        licznikPetli++;
                        okno.obrotyPetli.setText("Wykonano obrotow petli: " + licznikPetli);
                        if(okno.czyNaprawiacEq)robocik.naprawEQ();
                        robocik.wejdzDoDBL();

                    }
                };
                timer.schedule(akcjaBota2, 50, 780000);

            }
        });

        //listenery radio

        okno.radioOdPrawej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okno.wybranyOdPrawej = true;
                okno.wybranyodLewej = false;
                okno.wybranyOdGory = false;
                okno.wybranyOdDolu = false;
            }
        });

        okno.radioOdLewej.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okno.wybranyodLewej = true;
                okno.wybranyOdPrawej = false;
                okno.wybranyOdGory = false;
                okno.wybranyOdDolu = false;
            }
        });

        okno.radioOdGory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okno.wybranyOdGory = true;
                okno.wybranyOdPrawej = false;
                okno.wybranyodLewej = false;
                okno.wybranyOdDolu = false;
            }
        });

        okno.radioOdDolu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okno.wybranyOdDolu = true;
                okno.wybranyOdPrawej = false;
                okno.wybranyodLewej = false;
                okno.wybranyOdGory = false;

            }
        });

        okno.naprawaEQ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okno.czyNaprawiacEq = true;
            }
        });








    }
}



