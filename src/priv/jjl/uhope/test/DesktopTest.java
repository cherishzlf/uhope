package priv.jjl.uhope.test;

import java.awt.Desktop;
import java.net.URI;

public class DesktopTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                Desktop.getDesktop().browse(new URI("http://www.sun.com"));
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
