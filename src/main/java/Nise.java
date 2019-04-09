import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Nise {

    private NiseRobot robot;

    private Nise() {
        try {
            robot = new NiseRobot();
        } catch (AWTException exc) {
            System.out.println("AWT Exception: "+exc.toString());
        }
    }


    private void start() {
        String tweet = JOptionPane.showInputDialog(new JFrame("NameFrame"), "What do you want to tweet?");

        robot.delayedKeyPress(KeyEvent.VK_WINDOWS);

        robot.delayedKeyPress(KeyEvent.VK_C);
        robot.delayedKeyPress(KeyEvent.VK_H);
        robot.delayedKeyPress(KeyEvent.VK_R);
        robot.delayedKeyPress(KeyEvent.VK_O);
        robot.delayedKeyPress(KeyEvent.VK_M);
        robot.delayedKeyPress(KeyEvent.VK_E);

        robot.delayedKeyPress(KeyEvent.VK_ENTER);

        robot.mouseGlide(500,500, 600, 60, 8, 1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


        robot.delayedKeyPress(KeyEvent.VK_H);
        robot.delayedKeyPress(KeyEvent.VK_T);
        robot.delayedKeyPress(KeyEvent.VK_T);
        robot.delayedKeyPress(KeyEvent.VK_P);
        robot.delayedKeyPress(KeyEvent.VK_S);

        //Colon
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.delayedKeyPress(KeyEvent.VK_SLASH);
        robot.delayedKeyPress(KeyEvent.VK_SLASH);
        robot.delayedKeyPress(KeyEvent.VK_T);
        robot.delayedKeyPress(KeyEvent.VK_W);
        robot.delayedKeyPress(KeyEvent.VK_I);
        robot.delayedKeyPress(KeyEvent.VK_T);
        robot.delayedKeyPress(KeyEvent.VK_T);
        robot.delayedKeyPress(KeyEvent.VK_E);
        robot.delayedKeyPress(KeyEvent.VK_R);
        robot.delayedKeyPress(KeyEvent.VK_PERIOD);
        robot.delayedKeyPress(KeyEvent.VK_C);
        robot.delayedKeyPress(KeyEvent.VK_O);
        robot.delayedKeyPress(KeyEvent.VK_M);
        robot.delayedKeyPress(KeyEvent.VK_SLASH);
        robot.delayedKeyPress(KeyEvent.VK_ENTER);

        robot.delayedKeyPress(KeyEvent.VK_ENTER);

        robot.delay(3000);
        robot.mouseGlide(600,60, 750, 230, 8, 1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.instantType(tweet);

        robot.mouseGlide(750,230, 1250, 360, 8, 1000);

        robot.delay(3000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        System.exit(0);
    }

    public static void main(String[] args) {
        new Nise().start();
    }
}
