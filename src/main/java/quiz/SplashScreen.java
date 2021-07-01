package quiz;

import javax.swing.*;
import java.awt.*;
public class SplashScreen extends JWindow {
   Image splashScreen;
   ImageIcon imageIcon;
   public SplashScreen() {
      splashScreen = Toolkit.getDefaultToolkit().getImage("D:\\Documents\\NetBeansProjects\\Quiz\\src\\main\\java\\quiz\\pic.jpg");
      imageIcon = new ImageIcon(splashScreen);
      setSize(imageIcon.getIconWidth(),imageIcon.getIconHeight());
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int x = (screenSize.width-getSize().width)/2;
      int y = (screenSize.height-getSize().height)/2;
      setLocation(x,y);
      setVisible(true);
   }
   public void paint(Graphics g) {
      super.paint(g);
      g.drawImage(splashScreen, 0, 0, this);
   }

}