import java.awt.*;

/***
 * Every 30 minutes remind you go to rest
 * Take 5 minutes off each time
 */
public class BreakRemind {
    public static void main(String[] args) {
        BreakRemind b = new BreakRemind ();
        for (; ; ) {
            try {
                Thread.sleep (1800000);
                b.breakRemind ();
                Thread.sleep (300000);
                b.restEnd ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }

    public void breakRemind() {
        Toolkit t = Toolkit.getDefaultToolkit ();
        for (int i = 0; i < 5; i++) {
            t.beep ();
        }
    }

    public void restEnd() {
        Toolkit t = Toolkit.getDefaultToolkit ();
        for (int i = 0; i < 5; i++) {
            t.beep ();
        }
    }
}
