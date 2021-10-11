//Java Program to remind to you to get and do a random exercise in every 1 hour 

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.util.Random;

public class DeskNotification
{
    public static void displayNotification(String hourlyEx, String ex) throws AWTException 
    {
        // Obtain only one instance of the SystemTray object
        SystemTray tray = SystemTray.getSystemTray();
        
        // If you want to create an icon in the system tray to preview
        Image image = Toolkit.getDefaultToolkit().getImage("kettleBell.PNG");

        // Image im2 = new Image
        // Alternative (if the icon is on the classpath):
        // Image image =
        // Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));

        TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
        // Let the system resize the image if needed
        trayIcon.setImageAutoSize(true);
        // Set tooltip text for the tray icon
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        // Display info notification:
        // trayIcon.addMouseMotionListener(listener);
        trayIcon.displayMessage(hourlyEx, ex, MessageType.INFO);
        // Error:
        // trayIcon.displayMessage("Hello, World", "Java Notification Demo",
        // MessageType.ERROR);
        // Warning:
        // trayIcon.displayMessage("Hello, World", "Java Notification Demo",
        // MessageType.WARNING);
    }

    public static void main(String[] args) throws InterruptedException 
    {
        String arr[] = {"10 Push-Ups", "15 Squats", "1 min Plank", "45 sec Wall Sit", "5 Push-Ups", 
                "Push-Ups", "100 Jump Rope", "50 Jump Rope Explosive", "On Spot Running Jump Rope",
                "30 sec Plank", "30 Crunches", "Jumping Lunges", "10 Doublle Unders", 
                "1 minute Ruuning Jump Rope" };
        // System.out.println(arr.length);
        Random randInt = new Random();
        try 
        {
            int i=5;
            while(i>0)
            {
                // trayIc.displayMessage("Hi Everybody", "This is a demo", MessageType.INFO);
                int index = randInt.nextInt(arr.length);
                displayNotification("Hourly Exercise", arr[index]);
                System.out.println(arr[index]);
                i--;
                Thread.sleep(3600000);
            }
        } 
        catch (AWTException e) {
            e.printStackTrace();
        }
        
    }    
}
