package org.pierre.robot;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;

public class ScreenshotSaver {
    public static void main(String[] args) {
        try {
            Robot robot = new Robot();
            String format = "png";
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
            String formattedDateTime = now.format(formatter);

            String fileName = "screenshot_" + formattedDateTime + "." + format;

            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage screenCapture = robot.createScreenCapture(screenRect);

            ImageIO.write(screenCapture, format, new File(fileName));

            System.out.println("A screenshot has been saved as " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
