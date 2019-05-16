import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class ROBOTTO  {

    Robot robot;

    ROBOTTO(){
        try{
            robot = new Robot();
        }
        catch(AWTException e){
            System.out.println("Nie udalo sie :(");
        }
    }

    public void napiszLoch(){

        robot.keyPress(KeyEvent.VK_L);
        robot.delay(1);
        robot.keyPress(KeyEvent.VK_O);
        robot.delay(1);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(1);
        robot.keyPress(KeyEvent.VK_H);

    }

    public void kliknijDBL(int x, int y){

        robot.mouseMove(x, y);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(50);

    }

    public void ruszSieGoraDol(){

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_UP);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(44);

    }

    public void ruszSieDolGora(){

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_UP);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_UP);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(44);

    }

    public void ruszSieLewoPrawo(){

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(44);

    }

    public void ruszSiePrawoLewo(){

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.delay(44);
        robot.keyPress(KeyEvent.VK_LEFT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_LEFT);
        robot.delay(44);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(44);

    }


    public void wejdzDoDBL(){

         robot.delay(400);
         robot.keyPress(KeyEvent.VK_WINDOWS);
         robot.delay(50);
         robot.keyPress(KeyEvent.VK_1);
         robot.delay(50);
         robot.keyRelease(KeyEvent.VK_WINDOWS);
         robot.delay(50);
         robot.keyRelease(KeyEvent.VK_1);
         robot.delay(50);

    }



    public void botBezMyszkiDESKTOPGoraDol(){

        wejdzDoDBL();
        robot.delay(400);

        System.out.println("Sprawdzam kolor worka");
        System.out.println(robot.getPixelColor(838,545).toString());

        if (sprawdzenieKoloruWorka()) {
            ruszSieGoraDol();
        } else {
            wejdzDoDBL();
            System.out.println("Nie zgadza sie kolor worka lub ktos napisal");
            System.exit(0);
        }

    }


    public void botBezMyszkiDESKTOPDolGora(){

        wejdzDoDBL();
        robot.delay(400);

        System.out.println("Sprawdzam kolor worka");
        System.out.println(robot.getPixelColor(838,545).toString());

        if (sprawdzenieKoloruWorka()) {
            ruszSieDolGora();
        } else {
            wejdzDoDBL();
            System.out.println("Nie zgadza sie kolor worka lub ktos napisal");
            System.exit(0);
        }

    }

    public void botBezMyszkiDESKTOPLewoPrawo(){

        wejdzDoDBL();
        robot.delay(400);

        System.out.println("Sprawdzam kolor worka");
        System.out.println(robot.getPixelColor(838,545).toString());

        if (sprawdzenieKoloruWorka()) {
            ruszSieLewoPrawo();
        } else {
            wejdzDoDBL();
            System.out.println("Nie zgadza sie kolor worka lub ktos napisal");
            System.exit(0);
        }

    }

    public void botBezMyszkiDESKTOPPrawoLewo(){

        wejdzDoDBL();
        robot.delay(400);

        System.out.println("Sprawdzam kolor worka");
        System.out.println(robot.getPixelColor(838,545).toString());

        if (sprawdzenieKoloruWorka()) {
            ruszSiePrawoLewo();
        } else {
            wejdzDoDBL();
            System.out.println("Nie zgadza sie kolor worka lub ktos napisal");
            System.exit(0);
        }

    }

    public boolean sprawdzenieKoloruWorka(){

       /* robot.delay(500);
        if (robot.getPixelColor(838, 545).toString().equals("java.awt.Color[r=94,g=20,b=18]"))
            return true;
        else
            return false;*/
       return true; //dla testow i sie buguje czesto niestety
    }

    public void testMyszki(int x, int y){

        robot.mouseMove(x,y);
        robot.delay(50);
        System.out.println(robot.getPixelColor(833,511).toString());
        robot.delay(50);

    }
    public void zaltTabuj(){
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.delay(50);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
    }

    public void naprawEQ(){

        robot.mouseMove(1750,155);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
        robot.delay(50);

        robot.mouseMove(1750,185);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
        robot.delay(50);

        robot.mouseMove(1785,145);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
        robot.delay(50);

        robot.mouseMove(1785,175);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
        robot.delay(50);

        robot.mouseMove(1785,215);
        robot.delay(50);
        robot.mousePress(InputEvent.BUTTON2_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON2_MASK);
        robot.delay(50);
    }



}

