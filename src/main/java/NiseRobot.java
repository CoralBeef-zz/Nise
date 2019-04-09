import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class NiseRobot extends Robot {


    public NiseRobot() throws AWTException {}

    public void delayedKeyPress(int keyToPress) {
        delayedKeyPress(keyToPress,500);
    }

    public void delayedKeyPress(int keyToPress, int delay_time) {
        delay(delay_time);
        keyPress(keyToPress);
        keyRelease(keyToPress);
    }

    public void instantType(String text) {
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        keyPress(KeyEvent.VK_CONTROL);
        keyPress(KeyEvent.VK_V);
        keyRelease(KeyEvent.VK_V);
        keyRelease(KeyEvent.VK_CONTROL);
    }

    public void waitFor(int delay_in_milliseconds) {
        try {
            Thread.sleep(delay_in_milliseconds);
        } catch(InterruptedException ioe) {}
    }

    public void mouseGlide(int x1, int y1, int x2, int y2, int t, int n) {
        try {
            double dx = (x2 - x1) / ((double) n);
            double dy = (y2 - y1) / ((double) n);
            double dt = t / ((double) n);
            for (int step = 1; step <= n; step++) {
                Thread.sleep((int) dt);
                mouseMove((int) (x1 + dx * step), (int) (y1 + dy * step));
            }
        } catch (InterruptedException e) {}
    }
}
